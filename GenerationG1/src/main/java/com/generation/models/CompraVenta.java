package com.generation.models;


import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="comprasVentas")
public class CompraVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd") //formato de fecha
    private Date fecha;

    @Range(min = 0)      //Range es para rango numerico y el size es para caracteres dentro de un string
    private Float monto;

    //Establecemos relacion 1 a muchos
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name ="cliente_id")
    private Cliente cliente;

    //ManytoMany

    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable(
            name = "autos_ventas", //nombre de tabla relacional
            joinColumns = @JoinColumn(name = "compra_venta_id"), //Desde la entidad/tabla actual //Mencionar nombre de columna
            inverseJoinColumns = @JoinColumn(name = "auto_id") //La otra entidad/tabla con que se va a comunicar
            // Mencionar nombre de columna de union
    )
    private List<Auto> autos;
    @Column(updatable = false)
    private Date updatedAt;
    private Date createdAt;

    public CompraVenta() {
        super();
    }

    public CompraVenta(Date fecha, Float monto, Cliente cliente) {
        super();
        this.fecha = fecha;
        this.monto = monto;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
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
