package com.example.miraveredaapp.model;


public abstract class Usuario {
    private int id;
    private String nombre;
    private String apellidos;
    private String contrasenya;
    private String email;

    public Usuario(int id, String nombre, String apellidos, String contrasenya, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contrasenya = contrasenya;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public String getEmail() {
        return email;
    }
}
