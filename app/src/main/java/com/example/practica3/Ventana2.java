package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Ventana2 extends AppCompatActivity {
    TextView nom,pater,mater;
    Bundle datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);
        nom=findViewById(R.id.nom);
        pater=findViewById(R.id.pater);
        mater=findViewById(R.id.mater);
        datos=getIntent().getExtras();
        nom.setText(datos.getString("nombre"));
        pater.setText(datos.getString("paterno"));
        mater.setText(datos.getString("materno"));
    }
}