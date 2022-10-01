package com.protalento.appRest.modelo.entidad;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @Column(name = "id_producto",unique = true)
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


    public Producto() {
    }

    public Producto(int idProducto, String nombre, int idCategoria, String codigoBarras, double precioVenta, int cantidadStock, boolean estado ) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.idCategoria = idCategoria;
        this.codigoBarras = codigoBarras;
        this.precioVenta = precioVenta;
        CantidadStock = cantidadStock;
        this.estado = estado;


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


}
