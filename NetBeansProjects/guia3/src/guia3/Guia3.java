/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author smith
 */
public class Guia3 {

   

    private static int num;
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int cont = 0;
        do {
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        if(num > 1)
            suma = suma + num;
            
        
        
        cont++;
        System.out.println("La vuelta es " + cont);
       } while (num == 0 || cont < 20 );
       
        System.out.println("La suma total de los numeros ingresados es: " + suma);
    }
}
        
  
