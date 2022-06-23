package com.generation.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "licencias")
public class Licencia {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private Integer numero;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date fechaVencimiento;
    private String clase;
    private String estado;

    //opcionales, sirven para la gestion de base de datos

    @Column(updatable = false)//Columna no se va actualizar a traves del sistema
    private Date createdAt;
    private Date updatedAt;

    private Date deletedAt;

    //Relacion One-to-One

    @OneToOne(fetch=FetchType.LAZY)//Busca licencia pero por default busca usuario que se relaciona con licencia
                                   //pero no carga informacion hasta que alguien haga el llamado
                                   //.EAGER carga toda la informacion de una
    @JoinColumn(name ="usuario_id")
    private Usuario usuario;


    public Licencia() {
       super();
    }


    public Licencia(Long id, Integer numero, Date fechaVencimiento, String clase, String estado) {
        super();
        this.id = id;
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.clase = clase;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @PrePersist//Insertara en el atributo la fecha antes de agregarla a la base de datos
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate//
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

}
