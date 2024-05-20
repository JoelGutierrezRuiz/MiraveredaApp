package com.example.miraveredaapp.model;

import java.sql.Date;

public abstract class Contenido {
    private int id;
    private String nombreDire;
    private String genero;
    private int id_tarifa;
    private Date fecha;
    private float valoMedia;
    private String desc;
    private int duracion;
    private String tipo;
    private String titulo;
    private String img;

    public Contenido(int id, String nombreDire, String genero, int id_tarifa, Date fecha, float valoMedia, String desc, int duracion, String tipo, String titulo, String img) {
        this.id = id;
        this.nombreDire = nombreDire;
        this.genero = genero;
        this.id_tarifa = id_tarifa;
        this.fecha = fecha;
        this.valoMedia = valoMedia;
        this.desc = desc;
        this.duracion = duracion;
        this.tipo = tipo;
        this.titulo = titulo;
        this.img = img;
    }
}
