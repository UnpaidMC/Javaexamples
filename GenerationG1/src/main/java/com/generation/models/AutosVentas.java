package com.generation.models;


import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name="autos_ventas")
public class AutosVentas {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cantidad;
    private Float subtotal;
    private Date fecha;

    @Column(updatable = false)
    private Date updatedAt;
    private Date createdAt;

    //Relaciones ManytoOne de CompraVenta y Auto, recordar que ManytoMany es 2 ManytoOne

    //Relacion ente AutoVenta con Auto
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "auto_id")
    private Auto auto;


    //Relacion entre CompraVenta y AutoVenta
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "compra_venta_id")
    private CompraVenta comprasVentas;

    public AutosVentas() {
        super();
    }

    public AutosVentas(Long id, String cantidad, Float subtotal, Date fecha, Auto auto, CompraVenta comprasVentas) {
        super();
        this.id = id;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.fecha = fecha;
        this.auto = auto;
        this.comprasVentas = comprasVentas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public CompraVenta getComprasVentas() {
        return comprasVentas;
    }

    public void setComprasVentas(CompraVenta comprasVentas) {
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
