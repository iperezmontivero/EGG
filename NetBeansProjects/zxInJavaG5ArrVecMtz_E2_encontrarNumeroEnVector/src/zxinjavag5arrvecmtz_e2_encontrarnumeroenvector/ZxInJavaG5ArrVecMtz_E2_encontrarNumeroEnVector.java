/*2. Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package zxinjavag5arrvecmtz_e2_encontrarnumeroenvector;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author smith
 */
public class ZxInJavaG5ArrVecMtz_E2_encontrarNumeroEnVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner vlad = new Scanner(System.in);
        Random r = new Random();
        Scanner leer = new Scanner(System.in);
        System.out.println("cantidad de lugares de busqueda");
        int n = leer.nextInt();
        int vector[] = new int[n];
        
        Rellenar(vector, r);
        imprimir(vector, r);
        System.out.println("");
        System.out.println("INGRESE UN VALOR A BUSCAR");
        int check = 0;
        int buscar = vlad.nextInt();
        Buscar(vector, check, buscar);
        imprimir(vector, r);
    }

    public static void Rellenar(int[] vec, Random r) {
        for (int i = 0; i < vec.length; i++) {
            vec[i] = r.nextInt(10);
        }
    }

    public static void imprimir(int[] vec, Random r) {

        for (int i = 0; i < (vec.length); i++) {
            System.out.print("[" + (vec[i]) + "]");
        }
    }

    public static void Buscar(int[] vec, int ch, int bus) {
        for (int i = 0; i < vec.length ; i++) {
            if (bus == vec[i]) {
                System.out.println(bus + " ESTA EN LA POSICION " + (i +1));
                ch = 2;
            }
        }
        if (ch == 0) {
            System.out.println(bus + " NO ESTA EN NINGUN INDICE DEL VECTOR");
        }
    }

    private static class leer {

        private static int nextInt() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public leer() {
        }
    }

}
