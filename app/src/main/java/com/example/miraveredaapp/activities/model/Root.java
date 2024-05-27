package com.example.miraveredaapp.activities.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Root implements Serializable {

    ArrayList<Contenido> data;
    public ArrayList<?> getData() {
        return data;
    }
}

