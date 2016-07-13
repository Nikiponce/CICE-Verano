package com.example.np11.myapplication;


/**
 * Created by g5 on 13/7/16.
 */
public class EjerciciosRepaso {

    public boolean estaLetraEnPalabra(String cadena, char letra){
/*       boolean res = false;
        if (cadena.indexof(letra) > -1){
            res = true;
        }
        return res;*/
        return (cadena.indexOf(letra)!=-1);
    }

    public int vecesLetrasEnPalabra(String palabra, char letra){
        int n_veces = 0;
        int i = 0;
        char auxiliar;

        for (i=0; i<palabra.length(); i++){

            auxiliar = palabra.charAt(i);
            if (auxiliar == letra){
                n_veces++;
            }
        }
        return n_veces;
    }

}
