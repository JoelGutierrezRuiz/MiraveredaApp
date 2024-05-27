package com.example.miraveredaapp.activities;

import android.app.backup.BackupAgent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.miraveredaapp.API.Connector;
import com.example.miraveredaapp.R;
import com.example.miraveredaapp.activities.model.Actor;
import com.example.miraveredaapp.activities.model.Contenido;
import com.example.miraveredaapp.activities.model.Root;
import com.example.miraveredaapp.activities.model.RootActores;
import com.example.miraveredaapp.base.BaseActivity;
import com.example.miraveredaapp.base.CallInterface;
import com.example.miraveredaapp.base.ImageDownloader;
import com.example.miraveredaapp.base.ParametrosMiravereda;
import com.google.android.material.textfield.TextInputEditText;

import java.util.List;

public class InfoPelicula extends BaseActivity implements CallInterface {
    private RecyclerView recyclerViewActores;
    private ImageView ivCarritoInfoPelicula;
    private ImageView ivUsuarioInfoPelicula;
    private TextView tvValoracionInfoPelicula;
    private ImageView ivInfoPelicula;
    private TextView tvDuracionInfoPelicula;
    private Button btnAnadirACarrito;
    private TextView tvTituloInfoPelicula;
    private TextInputEditText tvDescripcionInfoPelicula;
    private ImageView imagenPortada;
    private String path = ParametrosMiravereda.URL;
    private RootActores root;
    private List<Actor> actores;
    Contenido contenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_pelicula);

        imagenPortada = findViewById(R.id.imagenPortadaInfo);
        recyclerViewActores = findViewById(R.id.recyclerViewActores);
        ivCarritoInfoPelicula = findViewById(R.id.ivCarritoInfoPelicula);
        ivUsuarioInfoPelicula = findViewById(R.id.ivUsuarioInfoPelicula);
        tvValoracionInfoPelicula = findViewById(R.id.tvValoracionInfoPelicula);
        ivInfoPelicula = findViewById(R.id.ivInfoPelicula);
        tvDuracionInfoPelicula = findViewById(R.id.tvDuracionInfoPelicula);
        tvTituloInfoPelicula = findViewById(R.id.tvTituloInfoPelicula);
        tvDescripcionInfoPelicula = findViewById(R.id.tvDescripcionInfoPelicula);

        Intent intent = getIntent();
         contenido = (Contenido) intent.getSerializableExtra("contenido");

        tvTituloInfoPelicula.setText(contenido.getTitulo());
        ImageDownloader.downloadImage(this,contenido.getImg(),imagenPortada,R.drawable.ic_launcher_background);
        tvDescripcionInfoPelicula.setText(contenido.getDesc());
        tvDuracionInfoPelicula.setText(String.valueOf(contenido.getDuracion())+" m");
        tvValoracionInfoPelicula.setText(String.valueOf(Math.round(contenido.getValoMedia()))

        );

        ivCarritoInfoPelicula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InfoPelicula.this,CarritoActivity.class);
                startActivity(intent);
            }
        });

        ivUsuarioInfoPelicula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InfoPelicula.this,AjustesActivity.class);
                startActivity(intent);
            }
        });

       showProgress();
        executeCall(this);
    }

    @Override
    public void doInBackground() {
        root = Connector.getConector().get(RootActores.class,path+contenido.getId()+"/actores");
        if (root!=null){
            actores = (List<Actor>) root.getData();
        }
    }

    @Override
    public void doInUI() {
        hideProgress();
        RecyclerAdapterActores adapterActores = new RecyclerAdapterActores(this,R.layout.item_actores,actores);
        recyclerViewActores.setAdapter(adapterActores);
        recyclerViewActores.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }
}
