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

<<<<<<< HEAD


        EjerciciosRepaso ejercicio = new EjerciciosRepaso();

        if (ejercicio.estaLetraEnPalabra("cadena", 'l')){
            Log.d(getClass().getCanonicalName(), "Si que esta!!");
        }else{
            Log.d(getClass().getCanonicalName(), "Que va no esta!!");
        }

        Log.d(getClass().getCanonicalName(), "La letra aparece "+ ejercicio.vecesLetrasEnPalabra("cadena", 'a') +" veces");
=======
        if (alumno instanceof Persona)
        {
            // Alumno es una persona
            Log.d (getClass().getCanonicalName(), "El alumno es una persona!!");

            String nombre_alumno = alumno.obtenerNombre();

            if (nombre_alumno != null )
            {
                Log.d(getClass().getCanonicalName(), "El alumno no es nulo");
            }
            else
            {
                Log.d(getClass().getCanonicalName(), "El alumno es nulo");
            }
/*
            try {
                Log.d(getClass().getCanonicalName(), " = "+ nombre_alumno.length());
            } catch (Throwable t){
                Log.e(getClass().getCanonicalName(), "ERROR",t);
            }
*/
        }
        else {
            // el alumno no es una persona
            Log.d (getClass().getCanonicalName(), "El alumno NO es una persona!!");
        }

        EjerciciosRepaso ejerciciosRepaso = new EjerciciosRepaso();

//    1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA SI ESE CARACTER PERTENECE A LA CADENA O NO
        boolean resultado = ejerciciosRepaso.estaLetraPalabra("NIKI", 'I');
        if (resultado) {
            Log.d(getClass().getCanonicalName(), "Si que está!!!");
        } else {
            Log.d(getClass().getCanonicalName(), "Que va, no esta!!!");
        }

//    2) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA CÚANTAS VECES APARECE ESE CARACTER EN LA CADENA
        int numero = ejerciciosRepaso.vecesLetraEnPalabra("esta es una oración", 'x');
        if (numero > 0){
            Log.d(getClass().getCanonicalName(), "La letra se repite "+ numero +" veces");
        } else {
            Log.d(getClass().getCanonicalName(), "La letra no aparece en la palabra");
        }

//    3) HACER UN MÉTODO QUE DADO UN NÚMERO, DIGA SI ES PAR O
        Log.d(getClass().getCanonicalName(), "El número es "+ ejerciciosRepaso.numeroPar(7));

//    5) HACER UN MÉTODO QUE RECIBA UNA NOTA DE 0 A 10 Y DIGA SI EQUIVALE A UN APROBADO, BIEN, NOTABLE, O SOBRESALIENTE
        Log.d(getClass().getCanonicalName(), "La calificación es: "+ ejerciciosRepaso.calificar(6.5));

//    6) HACER UN MÉTODO QUE RECIBA UNA CADENA Y LA DEVUELVA ALREVÉS
        String cadena = "Palabrota";
        String mensaje = cadena+" se escribe así "+ejerciciosRepaso.palabraDelReves(cadena)+" del revés";
        Log.d(getClass().getCanonicalName(), "La palabra "+ mensaje);

//    7) HACER UN PROGRAMA QUE MUESTRE LA SECUENCIA 3, 6, 9, 12, 15 ...99
        Log.d(getClass().getCanonicalName(), "La secuencia de número de 3 en 3 hasta el 99 es: " + ejerciciosRepaso.secuenciaDe3En3());

<<<<<<< HEAD
>>>>>>> origin/master
=======
>>>>>>> origin/master
    }

}
