package com.example.miraveredaapp.model;

import java.util.Date;

public class Cliente extends Usuario{
    private Date changedTS;
    private int ntarjeta;
    private Date fechaNac;
    private int CP;
    private String Domicilio;

    public Cliente(int id, String nombre, String apellidos, String contrasenya, String email, Date changedTS, int ntarjeta, Date fechaNac, int CP, String domicilio) {
        super(id, nombre, apellidos, contrasenya, email);
        this.changedTS = changedTS;
        this.ntarjeta = ntarjeta;
        this.fechaNac = fechaNac;
        this.CP = CP;
        Domicilio = domicilio;
    }

    public Date getChangedTS() {
        return changedTS;
    }

    public int getNtarjeta() {
        return ntarjeta;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public int getCP() {
        return CP;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    @Override
    public boolean equals(Object object){
        if(object==null || !(object instanceof Cliente))
            return false;
        Cliente cliente = (Cliente) object;
        return getId() == cliente.getId();
    }

     @Override
    public int hashCode(){
        return getId();
     }

}
