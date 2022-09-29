package com.protalento.appRest.services;

import com.protalento.appRest.modelo.entidad.Categoria;
import com.protalento.appRest.modelo.interfaceJdbc.DAOJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ServicesCategoria {
    private DAOJpaRepository daoJpaRepository;

    public ServicesCategoria(DAOJpaRepository daoJpaRepository) {
        this.daoJpaRepository = daoJpaRepository;
    }



}
