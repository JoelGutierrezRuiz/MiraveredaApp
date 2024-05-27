package com.example.miraveredaapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.miraveredaapp.R;


public class CarritoActivity extends AppCompatActivity {
    private RecyclerView recyclerViewCarrito;
    private RecyclerAdapterPeliculas recyclerAdapterCarrito;
    private ImageView ivVolverAtrasCarrito;
    private ImageView ivPerfilCarrito;
    private Button btnPagar;
    private TextView tvImporteCarrito;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrito);

        recyclerViewCarrito = findViewById(R.id.recyclerCarrito);
        ivVolverAtrasCarrito = findViewById(R.id.ivVolverAtrasCarrito);
        ivPerfilCarrito = findViewById(R.id.ivPerfilCarrito);
        btnPagar = findViewById(R.id.btnPagar);
        tvImporteCarrito = findViewById(R.id.tvImporteCarrito);

        ivVolverAtrasCarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CarritoActivity.this,SegundaPantallaActivity.class);
                startActivity(intent);
            }
        });

        ivPerfilCarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CarritoActivity.this,AjustesActivity.class);
                startActivity(intent);
            }
        });
    }
}
