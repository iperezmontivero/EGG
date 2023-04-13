/*Ejercicio 12
*Crea un procedimiento
*EsMultiplo que reciba los dos números pasados por el
*usuario, validando que el primer número múltiplo del 
*segundo e imprima si el primer número es múltiplo 
*del segundo, sino informe que no lo son.
 */
package x2introjavaguia4_e12g_es_multiplo;

import java.util.Scanner;

/**
 *
 * @author smith
 */
public class X2introJavaGuia4_e12g_es_multiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Por favor ingrese un valor: ");
        int num1 = read.nextInt();
        System.out.println("Por favor ingrese un segundo valor: ");
        int num2 = read.nextInt();

        if (num2 > num1) {
            int aux = num1;
            num1 = num2;
            num2 = aux;
            
        }

        EsMultiplo(num1, num2);
    }

    public static void EsMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("Es Multiplo");
        } else {
            System.out.println("No es multiplo");
        }
    }
}

