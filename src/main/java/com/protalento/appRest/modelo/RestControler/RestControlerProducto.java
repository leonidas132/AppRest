package com.protalento.appRest.modelo.RestControler;

import com.protalento.appRest.modelo.entidad.Producto;
import com.protalento.appRest.modelo.interfacesExtendsDaogenerico.IProductoRepositorio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class RestControlerProducto {
    private IProductoRepositorio iProductoRepositorio;

    public RestControlerProducto(IProductoRepositorio iProductoRepositorio) {
        this.iProductoRepositorio = iProductoRepositorio;
    }


    @GetMapping("/")
    List<Producto> obtener(){
      return iProductoRepositorio.getALL();
    }
}
