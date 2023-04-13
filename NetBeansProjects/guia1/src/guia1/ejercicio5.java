/*
 Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número. 
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author smith
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in); 
        int num ;
        System.out.println("INGRESE VALOR:"); 
        num = leer.nextInt();
        System.out.println("el doble del VALOR es: " +(2*num));
        System.out.println("el triple del VALOR es: " +(3*num));
        System.out.println("La raiz cuadrada del VALOR es: " +Math.sqrt(num));
        System.out.println("La raiz cuadrada del VALOR es: " +Math.pow(num,0.5));
    }
    
}
