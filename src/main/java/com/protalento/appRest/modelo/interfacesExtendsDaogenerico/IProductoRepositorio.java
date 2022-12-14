package com.protalento.appRest.modelo.interfacesExtendsDaogenerico;

import com.protalento.appRest.modelo.entidad.Categoria;
import com.protalento.appRest.modelo.entidad.Producto;
import com.protalento.appRest.modelo.interfaceJdbc.DAOJpaRepository;

import java.util.List;

public interface IProductoRepositorio {

    List<Producto> getALL();

    Producto geGuardar(Producto newProduc);

    Producto getActualizar(Producto producto, int id);

    void remover(int id);
}
