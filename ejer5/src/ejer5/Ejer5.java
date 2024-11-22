/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer5;

import java.util.Scanner;
import java.util.Locale;

public class Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int suma = 0;
        int numero;
        int intento = 2;
        int par = 2;

        System.out.println("Ingrese un numero par mayor a 2");
        numero = entrada.nextInt();

        if (numero % 2 != 0 || numero < 2) {
            System.out.println("Error");
        } else {
            while (intento <= numero) {
                suma = suma + par;
                par = par + 2;
                intento = intento + 2;

            }
            System.out.printf("El resultado de la suma es: %d\n", suma);
        }

        

    }

}
