package model;

import java.util.Date;

public class Capitulo extends Contenido{
    public Capitulo(int id_tarifa, String descripcion, Date fecha, double valoracionMedia, String nombreDire, int duracion, String genero,  Tipo tipo, Date changedTS) {
        super(id_tarifa, descripcion, fecha, valoracionMedia, nombreDire, duracion, genero, tipo, changedTS);
    }
}
