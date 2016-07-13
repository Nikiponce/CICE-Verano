package com.example.np11.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.i(getClass().getCanonicalName(), "Se ha iniciado la actividad");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Persona persona = new Persona("Niki", 20);
        Log.i(getClass().getCanonicalName(), "Se ha creado una persona");

        String nombre_persona = persona.obtenerNombre();
        Log.i(getClass().getCanonicalName(), "Se ha obtenido el nombre de una persona");

        int numero_letras = nombre_persona.length();

        Log.d(getClass().getCanonicalName(), "Número de letras = " + numero_letras);

        Alumno alumno = new Alumno(9);

        Persona persona_alumno = (Persona)alumno; //Supracasting

        Alumno alumno2 = (Alumno)persona_alumno;//Infracasting



        EjerciciosRepaso ejercicio = new EjerciciosRepaso();

        if (ejercicio.estaLetraEnPalabra("cadena", 'l')){
            Log.d(getClass().getCanonicalName(), "Si que esta!!");
        }else{
            Log.d(getClass().getCanonicalName(), "Que va no esta!!");
        }

        Log.d(getClass().getCanonicalName(), "La letra aparece "+ ejercicio.vecesLetrasEnPalabra("cadena", 'a') +" veces");
    }

}
