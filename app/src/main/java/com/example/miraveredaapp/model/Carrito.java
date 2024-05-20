package com.example.miraveredaapp.model;

public class Carrito {
   private int id_cliente;
   private int lineaFactura;

   public Carrito(int id_cliente, int lineaFactura) {
      this.id_cliente = id_cliente;
      this.lineaFactura = lineaFactura;
   }
}
