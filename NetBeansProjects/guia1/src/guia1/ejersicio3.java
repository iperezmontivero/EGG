/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas 
y después toda en minúsculas. 

 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author smith
 */
public class ejersicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); //objeto que genera clase/tipo de dato
       String frase;                          //declracion de variable
        System.out.println("INGRESE FRASE:"); //solicita ingraso de frase
        frase=leer.nextLine();               //ingreso de frase
        System.out.println(frase.toUpperCase());
         System.out.println(frase.toLowerCase());
        
        
    }
    
}
