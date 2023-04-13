/*1. Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author smith
 */
public class ejercicio_1_suma_de_dos_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
    
     System.out.println("INGRESE VALOR 1:"); 
        int a = leer.nextInt();
        System.out.println("INGRESE VALOR 2:"); 
        int b = leer.nextInt();
        int c = a+b;
        System.out.println("La suma de los VALORES 1 y 2 es "+c);
    }
    
}
