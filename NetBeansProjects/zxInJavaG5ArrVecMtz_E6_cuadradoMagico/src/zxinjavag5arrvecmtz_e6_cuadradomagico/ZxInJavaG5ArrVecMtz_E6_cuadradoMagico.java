/*6. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package zxinjavag5arrvecmtz_e6_cuadradomagico;

import static java.lang.System.in;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author smith
 */
public class ZxInJavaG5ArrVecMtz_E6_cuadradoMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = new int[3][3]; // Le ponemos la dimension a la matriz, 

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(" Ingrese datos matriz: [" + i + " , " + j + "]");
                matriz[i][j] = leer.nextInt();

           

                    }

                }

                /*if (matriz[0][0] + matriz[1][0] + matriz[2][0] = 0)*/
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        // Usamos la i y j para pasar por todos los elementos y mostrarlos
                        // Mostrando la matriz por sus filas
                        System.out.print("[" + matriz[i][j] + "]");

                    }
                    System.out.println(" ");
                }

            }

        }
    
    

