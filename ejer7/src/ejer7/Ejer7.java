/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer7;

import java.util.Scanner;
import java.util.Locale;

public class Ejer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        
        int numerorep;
        String cadenaFinal;
        int numero1;
        int numero2;
        int contador;

        cadenaFinal = "S1= ";

        System.out.println("Ingrese que cantidad de numeros requiere de la "
                + "serie");
        numerorep = entrada.nextInt();

        for (contador = 1;contador <= numerorep;contador++){
            numero1 =12 * contador;
            numero2 = 11 * contador;
            cadenaFinal = cadenaFinal + "+" + numero1 + "-" + numero2;
        }

        
        System.out.printf("%s\n",cadenaFinal);

    }
}
