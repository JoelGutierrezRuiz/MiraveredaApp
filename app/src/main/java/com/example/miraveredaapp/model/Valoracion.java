package com.example.miraveredaapp.model;

import java.sql.Date;

public class Valoracion {
    private int id_contenido;
    private int id_cliente;
    private int valoracion;

    public Valoracion(int id_contenido, int id_cliente, int valoracion) {
        this.id_contenido = id_contenido;
        this.id_cliente = id_cliente;
        this.valoracion = valoracion;
    }
}
