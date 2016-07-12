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

        if (alumno instanceof Persona)
        {
            // Alumno es una persona
            Log.d (getClass().getCanonicalName(), "El alumno es una persona!!");

            String nombre_alumno = alumno.obtenerNombre();

            if (nombre_alumno != null )
            {
                Log.d(getClass().getCanonicalName(), " El alumno no es nulo");
            }
            else
            {
                Log.d(getClass().getCanonicalName(), " El alumno es nulo");
            }

            try {
                Log.d(getClass().getCanonicalName(), " = "+ nombre_alumno.length());
            } catch (Throwable t){
                Log.e(getClass().getCanonicalName(), "ERROR",t);
            }

        }
        else {
            // el alumno no es una persona
            Log.d (getClass().getCanonicalName(), "El alumno NO es una persona!!");
        }
    }

}
