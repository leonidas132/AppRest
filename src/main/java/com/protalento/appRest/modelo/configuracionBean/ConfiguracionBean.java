package com.protalento.appRest.modelo.configuracionBean;

import com.protalento.appRest.modelo.ImplementaInterfaces.ImplCategoria;

import com.protalento.appRest.modelo.ImplementaInterfaces.ImplProducto;
import com.protalento.appRest.modelo.interfacesExtendsDaogenerico.IProductoRepositorio;

import com.protalento.appRest.services.ServicesProducoto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracionBean {

    @Bean
    IProductoRepositorio iproductoRepositorio(ServicesProducoto servicesProducoto){
        return new ImplProducto(servicesProducoto);
    }
}
