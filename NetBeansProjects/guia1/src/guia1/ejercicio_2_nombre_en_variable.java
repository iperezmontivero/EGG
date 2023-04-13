/*2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author smith
 */
public class ejercicio_2_nombre_en_variable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE su nombre:"); //solicita ingraso de frase
        String nombre = leer.nextLine();
        System.out.println("usted es " + nombre);
    }
    
}
