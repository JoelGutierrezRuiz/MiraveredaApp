package com.example.miraveredaapp.activities.model;

import java.io.Serializable;

public class Actor implements Serializable {
    private int id;
    private String nombre;
    private String personaje;
    private String img;

    public Actor() {

    }

    public Actor(int id, String nombre, String personaje, String img) {
        this.id = id;
        this.nombre = nombre;
        this.personaje = personaje;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPersonaje() {
        return personaje;
    }

    public String getImg() {
        return img;
    }
}
