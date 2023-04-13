/*6. Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
 */
package introjavaguia3_eje_6_dos_valores_en_menu_aritmetico;

import java.util.Scanner;

/**
 *
 * @author smith
 */
public class IntroJavaGuia3_eje_6_dos_valores_en_menu_aritmetico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int op;
        String op2;
        do {

            System.out.println("Ingrese el numero de la opción deseada");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("La suma de los numeros es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los numeros es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La division de los numeros es: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Seguro que quieres salir? S/N");

                    op2 = leer.next();

                    if (op2.equalsIgnoreCase("s")) {
                        op = 6;
                    } else {
                        op = 5;
                    }

                default:
            }
        } while (op != 6)
        
    }
    
}


