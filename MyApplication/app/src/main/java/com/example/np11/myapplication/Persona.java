package com.example.np11.myapplication;

/**
 * Created by NP11 on 12/07/2016.
 */
public class Persona {

    //Atributos
    private String nombre;
    private int edad;

    //Constructor
    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    public  Persona() {}

    //métodos
    public String obtenerNombre ()
    {
        return this.nombre;
    }


}
