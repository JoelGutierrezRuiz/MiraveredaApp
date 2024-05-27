/*package com.example.miraveredaapp.activities;

import static java.security.AccessController.getContext;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.miraveredaapp.R;

public class SpinnerIdiomaAdapter <T extends ListableIdioma> extends ArrayAdapter<T>{

    private int resource;

    public SpinnerIdiomaAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View customView = convertView;
        if (customView == null)
            customView = LayoutInflater.from(getContext()).inflate(resource, parent, false);

        T item = getItem(position);
        TextView ciudad = customView.findViewById(R.id.ciudad);

        ciudad.setText(item.getLanguage());

        return customView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View customView = convertView;
        if (customView == null)
            customView = LayoutInflater.from(getContext()).inflate(resource, parent, false);

        T item = getItem(position);
        TextView nation = customView.findViewById(R.id.ciudad);

        nation.setText(item.getLanguage());

        return customView;
    }

}*/
