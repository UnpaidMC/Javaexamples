package com.generation.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="clientes")
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String email;

    //Relacion para unir clientes con la compraVenta
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)

    //mappedBy = "cliente" significa que lo que esta en comprasVenta queda en un "cliente"
    private List<CompraVenta> comprasVentas;



    @Column(updatable = false)
    private Date updatedAt;
    private Date createdAt;

    public Cliente() {
        super();
    }
    public Cliente(Long id, String nombre, String apellido, String email) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public List<CompraVenta> getComprasVentas() {
        return comprasVentas;
    }

    public void setComprasVentas(List<CompraVenta> comprasVentas) {
        this.comprasVentas = comprasVentas;

    }


    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}
