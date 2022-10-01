package com.protalento.appRest.services;

import com.protalento.appRest.modelo.entidad.Producto;
import com.protalento.appRest.modelo.interfaceJdbc.DAOJpaRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service // se le indica a Spring que en esta clase va a ir logica de negosiop
public class ServicesProducoto {

    private DAOJpaRepository daoJpaRepository;

    public ServicesProducoto(DAOJpaRepository daoJpaRepository) {
        this.daoJpaRepository = daoJpaRepository;
    }

    public List<Producto> getAll(){
           return daoJpaRepository.findAll();
    }

    public Producto getSave(Producto newProdcuto){
        return daoJpaRepository.save(newProdcuto);
    }

    public Producto getUpdate(Producto newProducto, int id){
        return daoJpaRepository.findById(id)
                .map(producto -> {
                    producto.setNombre(newProducto.getNombre());
                    producto.setIdCategoria(newProducto.getIdCategoria());
                    producto.setCodigoBarras(newProducto.getCodigoBarras());
                    producto.setPrecioVenta(newProducto.getPrecioVenta());
                    producto.setCantidadStock(newProducto.getCantidadStock());
                    producto.setEstado(newProducto.isEstado());
                    return daoJpaRepository.save(producto);
                }
                ).get(); //get() Si hay un valor presente, devuelve el valor; de lo contrario, lanza NoSuchElementException.
    }

    public void remove(int id){
        daoJpaRepository.deleteById(id);
    }
}
