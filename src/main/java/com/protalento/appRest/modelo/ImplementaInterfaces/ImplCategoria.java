package com.protalento.appRest.modelo.ImplementaInterfaces;

import com.protalento.appRest.modelo.entidad.Categoria;
import com.protalento.appRest.modelo.interfaceJdbc.DAOJpaRepository;
import com.protalento.appRest.modelo.interfacesExtendsDaogenerico.ICategoriaRepositorio;
import org.springframework.stereotype.Component;

@Component
public class ImplCategoria implements ICategoriaRepositorio {
    private DAOJpaRepository daoJpaRepository;

    public ImplCategoria(DAOJpaRepository daoJpaRepository) {
        this.daoJpaRepository = daoJpaRepository;
    }



}
