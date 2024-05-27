package com.example.miraveredaapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.miraveredaapp.API.Connector;
import com.example.miraveredaapp.R;
import com.example.miraveredaapp.base.BaseActivity;
import com.example.miraveredaapp.base.CallInterface;
import com.example.miraveredaapp.base.ImageDownloader;
import com.google.android.material.textfield.TextInputEditText;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Registro extends BaseActivity /*implements CallInterface*/ {
    private ImageView ivFondoRegistro;
    private TextView tvHaciaInicioSesion;
    private TextInputEditText tiNombreRegistro;
    private TextInputEditText tiApellidoRegistro;
    private TextInputEditText tiEmailRegistro;
    private TextInputEditText tiDireccionRegistro;
    private TextInputEditText tiContrasenyaRegistro;
    private TextInputEditText tiTarjetaCreditoRegistro;
    private Button btnRegistro;
    private TextInputEditText tiCPRegistro;
    private TextInputEditText tiFechaNacRegistro;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        ivFondoRegistro = findViewById(R.id.ivFondoRegistro);
        tvHaciaInicioSesion = findViewById(R.id.tvHaciaInicioSesion);
        tiNombreRegistro = findViewById(R.id.tiNombreRegistro);
        tiApellidoRegistro = findViewById(R.id.tiApellidoRegistro);
        tiEmailRegistro = findViewById(R.id.tiEmailRegistro);
        tiDireccionRegistro = findViewById(R.id.tiDireccionRegistro);
        tiContrasenyaRegistro = findViewById(R.id.tiContrasenyaRegistro);
        tiTarjetaCreditoRegistro = findViewById(R.id.tiTarjetaCreditoRegistro);
        btnRegistro = findViewById(R.id.btnRegistro);
        tiCPRegistro = findViewById(R.id.tiCPRegistro);
        tiFechaNacRegistro = findViewById(R.id.tiFechaNacRegistro);

        ImageDownloader.downloadImage(this, "https://assets.nflxext.com/ffe/siteui/vlv3/ff5587c5-1052-47cf-974b-a97e3b4f0656/e313449a-cdd2-4f20-83b0-f6a4b4b024d6/ES-en-20240506-popsignuptwoweeks-perspective_alpha_website_small.jpg", ivFondoRegistro, R.drawable.ic_launcher_background);

        tvHaciaInicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registro.this, InicioSesion.class);
                startActivity(intent);
            }
        });
    }

        /*btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showProgress();
                executeCall(Registro.this);
            }
        });
    }

    @Override
    public void doInBackground() {
        usuario = Connector.getConector().post(UsuarioConcreto.class,registrar(),"172.30.134.215:8080/usuarios");
    }

    @Override
    public void doInUI() {

    }

    public UsuarioConcreto registrar(){
        String nombre = tiNombreRegistro.getText().toString();
        String apellidos = tiApellidoRegistro.getText().toString();
        String contrasenya = tiContrasenyaRegistro.getText().toString();
        String email = tiEmailRegistro.getText().toString();
        String domicilio = tiDireccionRegistro.getText().toString();
        int CP = Integer.parseInt(tiCPRegistro.getText().toString());
        String fechaNacStr = tiFechaNacRegistro.getText().toString();

        Date fechaNac = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            fechaNac = sdf.parse(fechaNacStr);
        }catch (Exception e){
            e.printStackTrace();
        }

        return new UsuarioConcreto(1,nombre,contrasenya,apellidos,email,domicilio,CP, (java.sql.Date) fechaNac);
    }*/
}
