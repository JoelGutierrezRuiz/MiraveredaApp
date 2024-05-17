package com.example.miraveredaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import base.ImageDownloader;

public class InicioSesion extends AppCompatActivity {
    private ImageView ivFondo;
    private TextView tvHaciaRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_sesion);

        ivFondo = findViewById(R.id.ivFondo);
        tvHaciaRegistro = findViewById(R.id.tvHaciaRegistro);

        ImageDownloader.downloadImage(this,"https://assets.nflxext.com/ffe/siteui/vlv3/ff5587c5-1052-47cf-974b-a97e3b4f0656/e313449a-cdd2-4f20-83b0-f6a4b4b024d6/ES-en-20240506-popsignuptwoweeks-perspective_alpha_website_small.jpg",ivFondo,R.drawable.ic_launcher_background);

        tvHaciaRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InicioSesion.this, Registro.class);
                startActivity(intent);
            }
        });
    }
}