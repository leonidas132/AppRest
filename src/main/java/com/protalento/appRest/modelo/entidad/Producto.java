package com.protalento.appRest.modelo.entidad;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Prodcutos")
public class Producto {

    @Id
    @Column(name = "id_prodcuto",unique = true)
    private int idProducto;

    private String nombre;

    @Column(name = "id_categoria",unique = true)
    private int idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private double precioVenta;

    @Column(name = "cantidad_stock")
    private int CantidadStock;

    private boolean estado;

    //este atributo nos ayuda a relacionar nuestra tabla categoria con productos
    @ManyToOne
    @JoinColumn(name = "id_categoria",insertable = false,updatable = false)
    private  Categoria categoria;

    @OneToMany(mappedBy = "producto")
    private List<CompraProducto> listaCompProducto;

    public Producto() {
    }

    public Producto(int idProducto, String nombre, int idCategoria, String codigoBarras, double precioVenta, int cantidadStock, boolean estado, Categoria categoria, List<CompraProducto> listaCompProducto) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.idCategoria = idCategoria;
        this.codigoBarras = codigoBarras;
        this.precioVenta = precioVenta;
        CantidadStock = cantidadStock;
        this.estado = estado;
        this.categoria = categoria;
        this.listaCompProducto = listaCompProducto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidadStock() {
        return CantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        CantidadStock = cantidadStock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<CompraProducto> getListaCompProducto() {
        return listaCompProducto;
    }

    public void setListaCompProducto(List<CompraProducto> listaCompProducto) {
        this.listaCompProducto = listaCompProducto;
    }
}
