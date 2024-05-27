package com.example.miraveredaapp.activities.model;

import java.io.Serializable;
import java.util.Date;
public class Contenido implements Serializable {
    private int id;
    private int precio;
    private int idDirector;
    private String genero;
    private int id_tarifa;
    private Date fecha;
    private float valoMedia;
    private String desc;
    private int duracion;
    private String tipo;
    private String titulo;
    private String img;

    public Contenido() {

    }

    public Contenido(int id, int precio, int idDirector, String genero, int id_tarifa, Date fecha, float valoMedia, String desc, int duracion, String tipo, String titulo, String img) {
        this.id = id;
        this.precio = precio;
        this.idDirector = idDirector;
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

    public int getId() {
        return id;
    }

    public int getPrecio() {
        return precio;
    }

    public int getIdDirector() {
        return idDirector;
    }

    public String getGenero() {
        return genero;
    }

    public int getId_tarifa() {
        return id_tarifa;
    }

    public Date getFecha() {
        return fecha;
    }

    public float getValoMedia() {
        return valoMedia;
    }

    public String getDesc() {
        return desc;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getImg() {
        return img;
    }
}
