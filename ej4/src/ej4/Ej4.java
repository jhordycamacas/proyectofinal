/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;

import java.util.Scanner;
import java.util.Locale;

public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double cadenaFinal = 0;
        double num = 1;
        double den = 1;
        double fraccion;

        while (den <= 100) {
            fraccion = num / den;
            cadenaFinal = cadenaFinal + fraccion;
            den = den + 1;
        }
        System.out.printf("%.2f\n", cadenaFinal);

    }

}


