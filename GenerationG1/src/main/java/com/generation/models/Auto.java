package com.generation.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name="registroAutos")

public class Auto {

        //Atributos
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Size(min=3, max=20) //@Size limita la cantidad de caracteres
        private String marca;
        @Size(min=3, max=20)
        private String color;

        private String modelo;

        private String motor;

        private Integer precioUSD;

        @NotNull
        private String matricula;

        @Column(updatable = false)
        private Date createdAt;
        private Date updatedAt;

    //Constructores


    public Auto() {
        super();
    }

    public Auto(Long id, String marca, String color, String modelo, String motor, Integer precioUSD, String matricula) {
        this.id = id;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.motor = motor;
        this.precioUSD = precioUSD;
        this.matricula = matricula;
    }


    //Getter y setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Integer getPrecioUSD() {
        return precioUSD;
    }

    public void setPrecioUSD(Integer precioUSD) {
        this.precioUSD = precioUSD;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
