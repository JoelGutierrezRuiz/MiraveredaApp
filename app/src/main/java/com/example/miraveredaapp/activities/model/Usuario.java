package com.example.miraveredaapp.activities.model;

import java.sql.Date;

public abstract class Usuario {
    private int id;
    private int idRol;
    private String nombre;
    private String contrasenya;
    private String apellido;
    private String email;
    private String domicilio;
    private int CP;
    private Date fechaNac;

    public Usuario(int id, int idRol, String nombre, String contrasenya, String apellido, String email, String domicilio, int CP, Date fechaNac) {
        this.id = id;
        this.idRol = idRol;
        this.nombre = nombre;
        this.contrasenya = contrasenya;
        this.apellido = apellido;
        this.email = email;
        this.domicilio = domicilio;
        this.CP = CP;
        this.fechaNac = fechaNac;
    }

    public Usuario(int idRol, String nombre, String contrasenya, String apellido, String email, String domicilio, int CP, Date fechaNac) {
        this.idRol = idRol;
        this.nombre = nombre;
        this.contrasenya = contrasenya;
        this.apellido = apellido;
        this.email = email;
        this.domicilio = domicilio;
        this.CP = CP;
        this.fechaNac = fechaNac;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
}