package com.example.miraveredaapp.activities.model;

import java.io.Serializable;

public class LoginRequest implements Serializable {

    private String email;
    private String contrasenya;


    public LoginRequest(String email, String contrasenya) {
        this.email = email;
        this.contrasenya = contrasenya;
    }

    public String getEmail() {
        return email;
    }

    public String getContrasenya() {
        return contrasenya;
    }
}
