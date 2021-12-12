package com.company;

public class Main {

    /**
     * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
     *
     *
     * Tened en cuenta que los textos pueden venir de un array de tipo String.
     *
     *
     * Por ejemplo: String[] nombres = {"", "", "", ""}
     *
     */

    public static void main(String[] args) {


        String[] palabras = {
                "Esto", "es", "un", "array", "y lo", "estamos", "concatenando"
        };
        StringBuilder frase = new StringBuilder();

        for (int i = 0; i < palabras.length; i++) {
            frase = frase.append(palabras[i] + " ");
            System.out.println(frase);
        }










    }
}
