/*1. Realizar un algoritmo que calcule la suma de 
todos los elementos de un vector de tamaño N, 
con los valores ingresados por el usuario.
 */
package zxinjavag5arrvecmtz_ext1_sumaenvector;


import java.util.Scanner;

/**
 *
 * @author smith
 */
public class ZxInJavaG5ArrVecMtz_Ext1_sumaEnVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("tamaño del VECTOR");
        int n = leer.nextInt();
        int vector[] = new int[n];
        int sum = 0;
        for (int i = 0; i < vector.length; i++) {

            System.out.println(" VALOR " + (i+1));
            vector[i] = leer.nextInt();
            System.out.print("[" + vector[i] + "]");
            sum+= vector[i];
            
            System.out.println("");
            System.out.println("la suma es "+sum);
            
           
        }

    }
}
