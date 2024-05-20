package com.example.miraveredaapp.model;


import java.sql.Date;

public class Capitulo extends Contenido{
    private String nombre;
    private Integer disponibilidad;

    public Capitulo(int id, String nombreDire, String genero, int id_tarifa, Date fecha, float valoMedia, String desc, int duracion, String tipo, String titulo, String img, String nombre, Integer disponibilidad) {
        super(id, nombreDire, genero, id_tarifa, fecha, valoMedia, desc, duracion, tipo, titulo, img);
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
    }
}
