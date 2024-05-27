package com.example.miraveredaapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.miraveredaapp.R;

public class AjustesActivity extends AppCompatActivity {
    private ConstraintLayout constraintAjustesAdicionales;
    private ImageView ivAtrasAjustes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajustes);

        constraintAjustesAdicionales = findViewById(R.id.constraintAjustesAdicionales);
        ivAtrasAjustes = findViewById(R.id.ivAtrasAjustes);

        ivAtrasAjustes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AjustesActivity.this,SegundaPantallaActivity.class);
                startActivity(intent);
            }
        });
        constraintAjustesAdicionales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AjustesActivity.this,AjustesAdicionales.class);
                startActivity(intent);
            }
        });
    }
}
