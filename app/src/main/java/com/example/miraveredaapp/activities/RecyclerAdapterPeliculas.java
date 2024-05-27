package com.example.miraveredaapp.activities;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.miraveredaapp.R;
import com.example.miraveredaapp.base.ImageDownloader;
import com.example.miraveredaapp.activities.model.Contenido;

import java.util.List;

public class RecyclerAdapterPeliculas extends RecyclerView.Adapter<RecyclerAdapterPeliculas.ViewHolder>{
    private int layout;
    private Context context;
    private List<Contenido> contenidosList;

    public RecyclerAdapterPeliculas(Context context,int layout, List<Contenido> contenidosList) {
        super();
        this.layout = layout;
        this.context = context;
        this.contenidosList = contenidosList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_recycler,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){


        ImageDownloader.downloadImage(context.getApplicationContext(),"https://i.pinimg.com/originals/98/4d/22/984d22fce5cae2c01473f4abe8063fd1.png",holder.estrella,R.drawable.ic_launcher_background);
        ImageDownloader.downloadImage(context.getApplicationContext(), contenidosList.get(position).getImg(),holder.ivImagenPelicula,R.drawable.ic_launcher_background);
        holder.tvPuntuacion.setText(String.valueOf(Math.round(contenidosList.get(position).getValoMedia())));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, InfoPelicula.class);

                intent.putExtra("contenido", contenidosList.get(position));
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return contenidosList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvTitulo;
        private ImageView ivImagenPelicula;
        private TextView tvPuntuacion;
        private ImageView estrella;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivImagenPelicula = itemView.findViewById(R.id.ivImagenPelicula);
            tvPuntuacion = itemView.findViewById(R.id.tvPuntuacion);
            estrella = itemView.findViewById(R.id.estrella);
        }




    }


}