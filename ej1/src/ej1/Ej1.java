/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

import java.util.Scanner;
import java.util.Locale;

public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String tipo = "";
        double angua;
        double angub;
        double anguc;

        System.out.println("Ingrese el angulo a");
        angua = entrada.nextDouble();
        System.out.println("Ingrese el angulo b");
        angub = entrada.nextDouble();
        System.out.println("Ingrese el angulo c");
        anguc = entrada.nextDouble();

        if (angua == 90 || angub == 90 || anguc == 90) {
            tipo = "Triangulo Rectangulo";
            System.out.println("El tipo de triangulo es: " + tipo); 
        } else {
            if (angua > 90 && angua < 180 || angub > 90 && angub < 180
                    || anguc > 90 && anguc < 180) {
                tipo = "Triangulo Obtusangulo";
                System.out.println("El tipo de triangulo es: " + tipo); 
            } else {
                if (angua < 90 || angub < 90 || anguc < 90) {
                    tipo = "Triangulo Acutangulo";
                    System.out.println("El tipo de triangulo es: " + tipo); 
                } else {
                    System.out.println("No es un triangulo");
                }
            }

        }
    }
    
}
