package com.protalento.appRest.modelo.entidad;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @Column(name = "id_categoria",unique = true)
    private int idCategoria;

    private String descripcion;

    private boolean estado;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    public Categoria() {
    }

    public Categoria(int idCategoria, String descripcion, boolean estado) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.estado = estado;

    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
