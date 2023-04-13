/*
 Dada una cantidad de grados centígrados se 
debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author smith
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double F, C ;      
        Scanner leer = new Scanner(System.in);                           
        System.out.println("INGRESE grados centigrados:"); 
         C=leer.nextDouble();
         F = 32 + (9 * C / 5);
         
        System.out.println("los grados en Farenheit es: " +F);
        
    }
    
}
