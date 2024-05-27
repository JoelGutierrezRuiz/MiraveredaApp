package ieslavereda.es.repository.model;

import com.example.miraveredaapp.activities.model.Usuario;

import java.sql.Date;

public class Cliente extends Usuario {
    private int ntarjeta;

    public Cliente(int id, int idRol, String nombre, String contrasenya, String apellido, String email, String domicilio, int CP, Date fechaNac, int ntarjeta) {
        super(id, idRol, nombre, contrasenya, apellido, email, domicilio, CP, fechaNac);
        this.ntarjeta = ntarjeta;
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
