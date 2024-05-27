package com.example.miraveredaapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.miraveredaapp.API.Connector;
import com.example.miraveredaapp.R;
import com.example.miraveredaapp.activities.model.Contenido;
import com.example.miraveredaapp.activities.model.Root;
import com.example.miraveredaapp.base.BaseActivity;
import com.example.miraveredaapp.base.CallInterface;
import com.example.miraveredaapp.base.ParametrosMiravereda;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;

public class SegundaPantallaActivity extends BaseActivity implements CallInterface,TextWatcher {
    private RecyclerView recyclerViewPeliculas;
    String path = ParametrosMiravereda.URL;
    private TextInputEditText inputBuscar;
    private RecyclerAdapterPeliculas recyclerAdapterPeliculas;
    private ImageView ivPerfilSegundaPantalla;
    private ImageView ivCarritoSegundaPantalla;
    private Root root;
    private List<Contenido> contenidos;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_pantalla);

        inputBuscar = findViewById(R.id.inputBuscar);
        recyclerViewPeliculas = findViewById(R.id.recyclerViewPeliculas);

        ivCarritoSegundaPantalla = findViewById(R.id.ivCarritoSegundaPantalla);
        ivPerfilSegundaPantalla = findViewById(R.id.ivPerfilSegundaPantalla);


        inputBuscar.addTextChangedListener(this);

        ivCarritoSegundaPantalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SegundaPantallaActivity.this,CarritoActivity.class);
                startActivity(intent);
            }
        });

        ivPerfilSegundaPantalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SegundaPantallaActivity.this,AjustesActivity.class);
                startActivity(intent);
            }
        });

        path = "http://172.30.134.216:8080/api/v1/getContenidos";
        showProgress();
        executeCall(this);
    }

    @Override
    public void doInBackground() {
        root = Connector.getConector().get(Root.class,path);
        if (root!=null){
           contenidos= (List<Contenido>) root.getData();
        }
    }

    @Override
    public void doInUI() {
        hideProgress();
        RecyclerAdapterPeliculas adapterPeliculas = new RecyclerAdapterPeliculas(this,R.layout.item_recycler,contenidos);
        recyclerViewPeliculas.setAdapter(adapterPeliculas);
        recyclerViewPeliculas.setLayoutManager(new GridLayoutManager(this,2));

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        if(after==' ')return;
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
       String titulo = s.toString().trim();
       if(titulo.isEmpty())return;
        path = "http://172.30.134.216:8080/api/v1/getContenido/"+titulo;
        executeCall(this);
    }
    @Override
    public void afterTextChanged(Editable s) {
    }
}
