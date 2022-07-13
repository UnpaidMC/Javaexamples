package com.generation.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

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

        private String email;

    @NotNull
    @Size(min=3, max=20)
        private String password;
        @Transient  //Transient no deja que se cree una columna en la base de datos
        private String passwordConfirmacion;


    @Column(updatable = false)
        private Date updatedAt;
        private Date createdAt;

        //One-to-One
        @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private Licencia licencia;

    //ManytoMany es igual que tener 2 OnetoMany
    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable(
            name = "roles_usuarios", //nombre de tabla relacional
            joinColumns = @JoinColumn(name = "usuario_id"), //Desde la entidad/tabla actual //Mencionar nombre de columna
            inverseJoinColumns = @JoinColumn(name = "rol_id") //La otra entidad/tabla con que se va a comunicar
            // Mencionar nombre de columna de union
            )
    private List<Rol> roles;

    //Constructores
    public Usuario(){
        super();

    }

    public Usuario(String nombre, String apellido, Integer edad, String password) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.password = password;

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

    public String getPasswordConfirmacion() {
        return passwordConfirmacion;
    }

    public void setPasswordConfirmacion(String passwordConfirmacion) {
        this.passwordConfirmacion = passwordConfirmacion;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
