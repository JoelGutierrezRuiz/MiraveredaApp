package com.example.miraveredaapp.model;

import java.sql.Date;

public class Añadir {
   private int id_contenido;
   private int id_cliente;
   private Date fecha;

   public Añadir(int id_contenido, int id_cliente, Date fecha) {
      this.id_contenido = id_contenido;
      this.id_cliente = id_cliente;
      this.fecha = fecha;
   }
}
