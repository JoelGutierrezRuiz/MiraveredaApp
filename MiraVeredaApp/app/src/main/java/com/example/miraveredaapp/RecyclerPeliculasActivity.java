package com.example.miraveredaapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;

public class RecyclerPeliculasActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private TextInputLayout inputBuscar;
    //private RecyclerAdapterPeliculas recyclerAdapterPeliculas;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_pantalla);

        inputBuscar = findViewById(R.id.inputBuscar);
        recyclerView = findViewById(R.id.recyclerView);

    }
}
