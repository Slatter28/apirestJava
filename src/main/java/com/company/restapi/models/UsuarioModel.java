package com.company.restapi.models;


import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModel{



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true,nullable=false)
    private long id;

    private String nombre;
    private String apellido;
    private String email;
    private Integer prioridad;

    public UsuarioModel() {
    }

    public UsuarioModel(long id, String nombre, String apellido, String email, Integer prioridad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.prioridad = prioridad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

    // @Override
    // public String toString() {
    //     return "UsuarioModel{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", prioridad=" + prioridad + '}';
    // }


}