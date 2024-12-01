/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer10;

/**
 *
 * @author usuario
 */
public class Ejer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador;
        int limite;
        contador =1;
        limite = 140;
        while (contador <=limite){
         if(contador % 7 == 0){
             System.out.println(contador);
         }
         contador = contador + 1;
        }
    }
    
}
