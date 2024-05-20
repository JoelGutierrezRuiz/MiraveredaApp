package com.example.miraveredaapp.model;


import java.sql.Date;

public class Factura {
    private int id;
    private Date fecha;
    private double importe;
    private float IVA;
    private int id_cliente;

    public Factura(int id, Date fecha, double importe, float IVA, int id_cliente) {
        this.id = id;
        this.fecha = fecha;
        this.importe = importe;
        this.IVA = IVA;
        this.id_cliente = id_cliente;
    }

}
