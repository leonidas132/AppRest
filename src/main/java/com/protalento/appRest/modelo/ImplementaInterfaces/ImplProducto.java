package com.protalento.appRest.modelo.ImplementaInterfaces;

import com.protalento.appRest.modelo.entidad.Producto;
import com.protalento.appRest.modelo.interfacesExtendsDaogenerico.IProductoRepositorio;
import com.protalento.appRest.services.ServicesProducoto;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import java.util.List;

public class ImplProducto implements IProductoRepositorio {
    private final Log LOGGER = LogFactory.getLog(ImplProducto.class);
    private ServicesProducoto servicesProducoto;

    public ImplProducto(ServicesProducoto servicesProducoto) {
        this.servicesProducoto = servicesProducoto;
    }

    @Override
    public List<Producto> getALL() {
        return servicesProducoto.getAll();
    }

    @Override
    public Producto geGuardar(Producto newProduc) {
        return servicesProducoto.getSave(newProduc);
    }

    @Override
    public Producto getActualizar(Producto producto, int id) {
        return servicesProducoto.getUpdate(producto,id);
    }

    @Override
    public void remover(int id) {
        servicesProducoto.remove(id);
    }


}
