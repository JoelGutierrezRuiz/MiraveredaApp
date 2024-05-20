package com.example.miraveredaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import base.ImageDownloader;

public class Registro extends AppCompatActivity {
    private ImageView ivFondoRegistro;
    private TextView tvHaciaInicioSesion;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        ivFondoRegistro = findViewById(R.id.ivFondoRegistro);
        tvHaciaInicioSesion = findViewById(R.id.tvHaciaInicioSesion);

        ImageDownloader.downloadImage(this,"https://assets.nflxext.com/ffe/siteui/vlv3/ff5587c5-1052-47cf-974b-a97e3b4f0656/e313449a-cdd2-4f20-83b0-f6a4b4b024d6/ES-en-20240506-popsignuptwoweeks-perspective_alpha_website_small.jpg",ivFondoRegistro,R.drawable.ic_launcher_background);

        tvHaciaInicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registro.this,InicioSesion.class);
                startActivity(intent);
            }
        });

    }
}
