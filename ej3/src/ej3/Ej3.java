/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;

import java.util.Scanner;
import java.util.Locale;

public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double num1;
        double num2;
        double num3;

        System.out.println("Ingrese el primer numero");
        num1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero");
        num2 = entrada.nextDouble();
        System.out.println("Ingrese el tercer numero");
        num3 = entrada.nextDouble();

        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("LOS VALORES SON IGUALES");
        } else {
            if (num1 > num2 && num1 > num3) {
                System.out.println("El numero mayor es: " + num1);
            } else {
                if (num2 > num1 && num2 > num3) {
                    System.out.println("El numero mayor es: " + num2);
                } else {
                    if (num3 > num1 && num3 > num2) {
                        System.out.println("El numero mayor es: " + num3);

                    }
                }
            }
        }

    }

}
