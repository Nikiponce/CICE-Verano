package com.example.np11.myapplication;

<<<<<<< HEAD
<<<<<<< HEAD

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
=======
=======
>>>>>>> origin/master
/**
 * Created by NP11 on 13/07/2016.
 */
public class EjerciciosRepaso {

    //    1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA SI ESE CARACTER PERTENECE A LA CADENA O NO
    public boolean estaLetraPalabra(String palabra, char letra) {
        boolean res = false;
        if (palabra.indexOf(letra) > -1) {
            res = true;
        }
        return res;
    }

    //    2) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA CÚANTAS VECES APARECE ESE CARACTER EN LA CADENA
    public int vecesLetraEnPalabra(String palabra, char letra) {
        int n_veces = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
<<<<<<< HEAD
>>>>>>> origin/master
=======
>>>>>>> origin/master
                n_veces++;
            }
        }
        return n_veces;
    }

<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> origin/master
    //    3) HACER UN MÉTODO QUE DADO UN NÚMERO, DIGA SI ES PAR O NO
    public String numeroPar(int numero) {
        String res = "IMPAR";
        if (numero % 2 == 0) {
            res = "PAR";
        }
        return res;
    }

    //    5) HACER UN MÉTODO QUE RECIBA UNA NOTA DE 0 A 10 Y DIGA SI EQUIVALE A UN APROBADO, BIEN, NOTABLE, O SOBRESALIENTE
    public String calificar(double nota) {
        String calificacion = "";
        if (nota == 10) {
            calificacion = "Matrícula de Honor";
        } else {
            if (nota <= 9.9 && nota >= 9) {
                calificacion = "Sobresaliente";
            } else {
                if (nota <= 8.9 && nota >= 7) {
                    calificacion = "Notable";
                } else {
                    if (nota <= 6.9 && nota >= 5) {
                        calificacion = "Aprobado";
                    } else {
                        calificacion = "Suspenso";
                    }
                }
            }
        }
        return calificacion;
    }

    //    6) HACER UN MÉTODO QUE RECIBA UNA CADENA Y LA DEVUELVA ALREVÉS
    public String palabraDelReves(String palabra) {
        String res = "";
//        for (int i = palabra.length();  i > -1; i--) {
//            res = res + palabra.charAt(i);
//        }
        for (int i = 0; i < palabra.length(); i++) {
            res = palabra.charAt(i) + res;
        }
        return res;
    }

    //    7) HACER UN PROGRAMA QUE MUESTRE LA SECUENCIA 3, 6, 9, 12, 15 ...99
    public String secuenciaDe3En3() {
        String res = "";
        for (int i = 3; i <= 99; i = i + 3) {
            if (i == 99) {
                res = res + i;
            } else {
                res = res + i + ", ";
            }
        }
        return res;
    }
<<<<<<< HEAD
>>>>>>> origin/master
=======
>>>>>>> origin/master
}
