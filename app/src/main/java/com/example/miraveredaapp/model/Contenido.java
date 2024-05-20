package com.example.miraveredaapp.model;

import java.util.Date;
import java.util.List;

public class Contenido {
    private int id_tarifa;
    private String descripcion;
    private Date fecha;
    private double valoracionMedia;
    private String nombreDire;
    private int duracion;
    private String genero;
    private Tipo tipo;
    private Date changedTS;
    private List<? extends Contenido> contenidos;

    public Contenido(int id_tarifa, String descripcion, Date fecha, double valoracionMedia, String nombreDire, int duracion, String genero, Tipo tipo, Date changedTS) {
        this.id_tarifa = id_tarifa;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.valoracionMedia = valoracionMedia;
        this.nombreDire = nombreDire;
        this.duracion = duracion;
        this.genero = genero;
        this.tipo = tipo;
        this.changedTS = changedTS;
    }
}

