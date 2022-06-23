package com.generation.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name="usuarios")

public class Usuario {

        //Atributos
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Size(min=3, max=20) //@Size limita la cantidad de caracteres
        private String nombre;
        @Size(min=3, max=20)
        private String apellido;

        private Integer edad;

        @NotNull
        private String password;
        @Column(updatable = false)
        private Date updatedAt;
        private Date createdAt;

        //One-to-One
        @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private Licencia licencia;

    //Constructores
    public Usuario(){
        super();

    }

    public Usuario(String nombre, String apellido, Integer edad) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }
    //Getter and Setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Licencia getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
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
