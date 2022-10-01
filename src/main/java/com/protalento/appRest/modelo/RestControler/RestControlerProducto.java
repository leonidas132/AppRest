package com.protalento.appRest.modelo.RestControler;

import com.protalento.appRest.modelo.entidad.Producto;
import com.protalento.appRest.modelo.interfacesExtendsDaogenerico.IProductoRepositorio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class RestControlerProducto {
    private IProductoRepositorio iProductoRepositorio;

    public RestControlerProducto(IProductoRepositorio iProductoRepositorio) {
        this.iProductoRepositorio = iProductoRepositorio;
    }


    @GetMapping("/") //OPTENER TODOS LOS PRODUCTOS
    List<Producto> obtener(){
      return iProductoRepositorio.getALL();
    }

    @PostMapping("/add") // AGREGAR UN PRODUCTO
    ResponseEntity<Producto> addUser(@RequestBody Producto newUser){
        return new ResponseEntity<>(iProductoRepositorio.geGuardar(newUser), HttpStatus.CREATED); // HttpStatus.CREATED nos devuelve el codigo de estado 201
    }

    @PutMapping("/{idProducto}")
    ResponseEntity<Producto> update(@RequestBody Producto producto, @PathVariable int idProducto){
        return new ResponseEntity<>(iProductoRepositorio.getActualizar(producto,idProducto),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    ResponseEntity deleteProducto(@PathVariable int id){
        iProductoRepositorio.remover(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
