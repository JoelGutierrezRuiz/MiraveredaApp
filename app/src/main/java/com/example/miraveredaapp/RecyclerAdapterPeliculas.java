package com.example.miraveredaapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.miraveredaapp.model.Contenido;

import java.util.List;

public class RecyclerAdapterPeliculas extends RecyclerView.Adapter<RecyclerAdapterPeliculas.ViewHolder>{
    private int layout;

    private Context context;
    private Contenido contenido;
    private List<Contenido> contenidosList;

    public RecyclerAdapterPeliculas(Context context,int layout, Contenido contenido) {
        super();
        this.layout = layout;
        this.context = context;
        this.contenido = contenido;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.segunda_pantalla,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvTitulo.setText("");
        base.ImageDownloader.downloadImage(context.getApplicationContext(), "",holder.ivImagenPelicula,R.drawable.ic_launcher_background);
        holder.tvPuntuacion.setText("");
    }

    @Override
    public int getItemCount() {
        return contenidosList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvTitulo;
        private ImageView ivImagenPelicula;
        private TextView tvPuntuacion;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            ivImagenPelicula = itemView.findViewById(R.id.ivImagenPelicula);
            tvPuntuacion = itemView.findViewById(R.id.tvPuntuacion);
        }
    }
}