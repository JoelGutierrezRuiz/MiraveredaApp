package com.example.miraveredaapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.miraveredaapp.API.Connector;
import com.example.miraveredaapp.R;
import com.example.miraveredaapp.activities.model.LoginRequest;
import com.example.miraveredaapp.activities.model.Root;
import com.example.miraveredaapp.activities.model.RootInicioSesion;
import com.example.miraveredaapp.base.BaseActivity;
import com.example.miraveredaapp.base.CallInterface;
import com.example.miraveredaapp.base.ImageDownloader;
import com.google.android.material.textfield.TextInputEditText;

public class InicioSesion extends BaseActivity /*implements CallInterface*/ {
    private ImageView ivFondo;
    private TextView tvHaciaRegistro;
    private TextInputEditText inputContrasenaInicio;
    private TextInputEditText inputUsuarioInicio;
    private Button btnInicioSesion;
    RootInicioSesion rootLogin;
    LoginRequest usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_sesion);

        ivFondo = findViewById(R.id.ivFondo);
        tvHaciaRegistro = findViewById(R.id.tvHaciaRegistro);
        btnInicioSesion = findViewById(R.id.btnInicioSesion);
        inputContrasenaInicio = findViewById(R.id.inputContrasenaInicio);
        inputUsuarioInicio = findViewById(R.id.inputUsuarioInicio);

        ImageDownloader.downloadImage(this,"https://assets.nflxext.com/ffe/siteui/vlv3/ff5587c5-1052-47cf-974b-a97e3b4f0656/e313449a-cdd2-4f20-83b0-f6a4b4b024d6/ES-en-20240506-popsignuptwoweeks-perspective_alpha_website_small.jpg",ivFondo,R.drawable.ic_launcher_background);

        tvHaciaRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InicioSesion.this, Registro.class);
                startActivity(intent);
            }
        });

        btnInicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InicioSesion.this, SegundaPantallaActivity.class);
                startActivity(intent);
            }
        });
    }
    /*@Override
    public void doInBackground() {
        String contrasenya = inputContrasenaInicio.getText().toString();
        String emailUsuario = inputUsuarioInicio.getText().toString();
        usuario = new LoginRequest(emailUsuario,contrasenya);
        try {
            rootLogin =  Connector.getConector().post(RootInicioSesion.class,usuario,"172.30.134.215:8080/inicioSesion");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void doInUI() {

            Intent intent = new Intent(InicioSesion.this,SegundaPantallaActivity.class);
            startActivity(intent);

    }*/
}