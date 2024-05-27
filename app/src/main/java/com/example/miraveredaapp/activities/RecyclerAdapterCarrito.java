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
import com.example.miraveredaapp.base.ImageDownloader;
import com.example.miraveredaapp.activities.model.Contenido;

import java.util.List;

public class RecyclerAdapterCarrito extends RecyclerView.Adapter<RecyclerAdapterCarrito.ViewHolder> {
    private int layout;

    private Context context;
    private Contenido contenido;
    private List<Contenido> carritoList;

    public RecyclerAdapterCarrito(Context context, int layout, Contenido contenido) {
        super();
        this.layout = layout;
        this.context = context;
        this.contenido = contenido;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.carrito, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapterCarrito.ViewHolder holder, int position) {
        holder.tvTituloLineaCarrito.setText("");
        ImageDownloader.downloadImage(context.getApplicationContext(), "", holder.ivLineaCarrito, R.drawable.ic_launcher_background);
        holder.tvPrecioLineaCarrito.setText("");
        holder.tvDescuentoLineaCarrito.setText("");
    }

    @Override
    public int getItemCount() {
        return carritoList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTituloLineaCarrito;
        private ImageView ivLineaCarrito;
        private TextView tvPrecioLineaCarrito;
        private TextView tvDescuentoLineaCarrito;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTituloLineaCarrito = itemView.findViewById(R.id.tvTituloLineaCarrito);
            ivLineaCarrito = itemView.findViewById(R.id.ivLineaCarrito);
            tvPrecioLineaCarrito = itemView.findViewById(R.id.tvPrecioLineaCarrito);
            tvDescuentoLineaCarrito = itemView.findViewById(R.id.tvDescuentoLineaCarrito);
        }
    }

}
