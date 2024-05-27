package com.example.miraveredaapp.activities;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.miraveredaapp.R;
import com.example.miraveredaapp.activities.model.Actor;
import com.example.miraveredaapp.base.ImageDownloader;
import com.example.miraveredaapp.activities.model.Contenido;

import java.util.List;

public class RecyclerAdapterActores extends RecyclerView.Adapter<RecyclerAdapterActores.ViewHolder> {
    private int layout;

    private Context context;
    private Contenido contenido;
    private List<Actor> actoresList;

    public RecyclerAdapterActores(Context context, int layout, List<Actor> actoresList) {
        super();
        this.layout = layout;
        this.context = context;
        this.actoresList=actoresList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_actores, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvNombreActor.setText(actoresList.get(position).getNombre());
        holder.papel.setText(actoresList.get(position).getPersonaje());
        ImageDownloader.downloadImage(context.getApplicationContext(), actoresList.get(position).getImg(), holder.ivActor, R.drawable.ic_launcher_background);
    }

    @Override
    public int getItemCount() {
        return actoresList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNombreActor;
        private ImageView ivActor;
        private TextView papel;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNombreActor = itemView.findViewById(R.id.tvNombreActor);
            ivActor = itemView.findViewById(R.id.ivActor);
            papel = itemView.findViewById(R.id.papel);
        }
    }
}
