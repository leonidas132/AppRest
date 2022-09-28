package com.protalento.appRest.modelo.entidad;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @Column(unique = true)
    private String id;

    private String nombre;

    private String apellido;

    private long celular;

    private String dirrecion;

    @Column(name = "correo_electronico")
    private String correo;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> listCompra;
}
