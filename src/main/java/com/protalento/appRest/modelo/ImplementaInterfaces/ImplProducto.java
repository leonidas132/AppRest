package com.protalento.appRest.modelo.ImplementaInterfaces;

import com.protalento.appRest.modelo.entidad.Producto;
import com.protalento.appRest.modelo.interfacesExtendsDaogenerico.IProductoRepositorio;
import com.protalento.appRest.services.ServicesProducoto;

import java.util.List;

public class ImplProducto implements IProductoRepositorio {
    private ServicesProducoto servicesProducoto;

    public ImplProducto(ServicesProducoto servicesProducoto) {
        this.servicesProducoto = servicesProducoto;
    }

    @Override
    public List<Producto> getALL() {
        return servicesProducoto.getAll();
    }
}
