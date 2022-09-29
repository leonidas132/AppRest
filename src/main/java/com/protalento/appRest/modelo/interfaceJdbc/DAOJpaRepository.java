package com.protalento.appRest.modelo.interfaceJdbc;

import com.protalento.appRest.modelo.entidad.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DAOJpaRepository extends JpaRepository<Producto,Integer> {



}
