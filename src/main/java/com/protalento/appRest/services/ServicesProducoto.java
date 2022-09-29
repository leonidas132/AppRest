package com.protalento.appRest.services;

import com.protalento.appRest.modelo.entidad.Producto;
import com.protalento.appRest.modelo.interfaceJdbc.DAOJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicesProducoto {
    private DAOJpaRepository daoJpaRepository;

    public ServicesProducoto(DAOJpaRepository daoJpaRepository) {
        this.daoJpaRepository = daoJpaRepository;
    }

    public List<Producto> getAll(){
     return daoJpaRepository.findAll();
    }


}
