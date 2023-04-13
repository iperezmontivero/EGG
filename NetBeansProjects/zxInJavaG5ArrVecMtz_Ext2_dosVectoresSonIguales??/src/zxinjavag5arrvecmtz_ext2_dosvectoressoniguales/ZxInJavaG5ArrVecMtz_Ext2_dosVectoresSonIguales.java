/*2. Escriba un programa que averigüe si dos vectores de N 
enteros son iguales (la comparación deberá detenerse en 
cuanto se detecte alguna diferencia entre los elementos).
 */
package zxinjavag5arrvecmtz_ext2_dosvectoressoniguales;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author smith
 */
public class ZxInJavaG5ArrVecMtz_Ext2_dosVectoresSonIguales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("tamaño del VECTOR");
        int n = leer.nextInt();
        int vectori[] = new int[n];
        int vectorj[] = new int[n];
        for (int i = 0; i < vectori.length; i++) {

           // System.out.println(" VALOR " + (i + 1));
            vectori[i] = (int) (Math.random() * 10) + 1;

         System.out.print("["+vectori[i]+"]" );

        }
        System.out.println("");
        for (int j = 0; j < vectorj.length; j++) {

            vectori[j] = (int) (Math.random() * 10) + 1;
            System.out.print("["+vectori[j]+"]" );
        }
    }
}
