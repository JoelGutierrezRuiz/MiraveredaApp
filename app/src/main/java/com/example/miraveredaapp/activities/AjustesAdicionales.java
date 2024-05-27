package com.example.miraveredaapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.miraveredaapp.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class AjustesAdicionales extends AppCompatActivity {
    private ImageView ivAjustesAdicionales;
    private TextInputEditText tiRutaServidor;
    private Button btnGuardar;
    private ImageView ivAtrasAjustesAdicionales;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajustes_adicionales);

        ivAjustesAdicionales = findViewById(R.id.ivAjustesAdicionales);
        tiRutaServidor = findViewById(R.id.tiRutaServidor);
        btnGuardar = findViewById(R.id.btnGuardar);
        ivAtrasAjustesAdicionales = findViewById(R.id.ivAtrasAjustesAdicionales);

        ivAtrasAjustesAdicionales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AjustesAdicionales.this,AjustesActivity.class);
                startActivity(intent);
            }
        });
    }
}
