/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer9;

import java.util.Scanner;
import java.util.Locale;
public class Ejer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
         int numEdificios = 20;
        int numDepartamentos = 15;
        double renta = 800;
        int meses = 12;

     
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        // Generar talonarios de pago
        for (int edificio = 1; edificio <= numEdificios; edificio++) {
            for (int departamento = 1; departamento <= numDepartamentos; departamento++) {
                for (int mes = 1; mes <= meses; mes++) {
                    // Imprimir el talonario
                    System.out.println("Edificio: " + edificio);
                    System.out.println("Departamento: " + departamento);
                    System.out.println("Mes: " + nombresMeses[mes - 1]); // Ajuste del índice
                    System.out.println("Monto a pagar: $" + renta);
                    System.out.println("----------------------------");
                }
            }
        }
         
    }
    
}
