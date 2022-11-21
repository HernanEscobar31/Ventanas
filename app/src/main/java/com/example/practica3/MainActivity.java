package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //1. Declarar datos
    private EditText nombre;
    private EditText apeP;
    private EditText apeM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2. Construir objetos
        nombre=(EditText)findViewById(R.id.nombre);
        apeP=(EditText)findViewById(R.id.apeP);
        apeM=(EditText)findViewById(R.id.apeM);
    }
    //3. Creamos los metodos
    public void captura(View view) {
        String nom;
        String pat;
        String mat;
        nom = nombre.getText().toString();
        pat = apeP.getText().toString();
        mat = apeM.getText().toString();

        Intent v1 = new Intent(MainActivity.this,Ventana2.class);
        v1.putExtra("nombre",nom);
        v1.putExtra("paterno",pat);
        v1.putExtra("materno",mat);
        startActivity(v1);
    }
    public void limpiar(View view){
        l();
    }
    public void l(){
        nombre.setText("");
        apeP.setText("");
        apeM.setText("");
    }
}


