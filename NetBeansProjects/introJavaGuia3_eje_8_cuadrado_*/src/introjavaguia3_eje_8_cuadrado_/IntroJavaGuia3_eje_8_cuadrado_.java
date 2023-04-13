/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaguia3_eje_8_cuadrado_;

import java.util.Scanner;

/**
 *
 * @author smith
 */
public class IntroJavaGuia3_eje_8_cuadrado_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        public class EjercicioCuadrado {
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el tamaño del cuadrado");
     int num = leer.nextInt();
     
     for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=num; j++) {

                if (i==1 || i ==num  || j==1 || j==num ) { //
                System.out.print("* ");
                
                } else {
                System.out.print("  "); 

                 }
            }
            System.out.println("");
        }
     
    }
    
}
        // TODO code application logic here
    }
    

