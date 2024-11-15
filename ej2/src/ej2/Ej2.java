/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;

import java.util.Scanner;
import java.util.Locale;

public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double porcentaje = 60;
        double numtrajes;
        double descuento;
        double subtotal;
        double total;
        double preciou;

        System.out.println("Ingrese la cantidad de trajes que va a adquirir");
        numtrajes = entrada.nextDouble();
        System.out.println("Ingrese el precio unitario");
        preciou = entrada.nextDouble();

        subtotal = numtrajes * preciou;

        if (numtrajes == 1) {
            porcentaje = 10;
        } else {
            if (numtrajes == 2) {
                porcentaje = 20;
            } else {
                if (numtrajes == 3) {
                    porcentaje = 40;
                } else {
                    if (numtrajes > 3) {
                        porcentaje = 60;
                    }
                }
            }
        }
        descuento = (subtotal * porcentaje)/100;
        total = subtotal - descuento;
        System.out.printf("El subtotal a pagar es: $%.2f"
                + "\nEl descuento en dolares es: $%.2f"
                + "\nEl total a pagar es: $%.2f\n", subtotal,descuento,total);
        
    }
}


