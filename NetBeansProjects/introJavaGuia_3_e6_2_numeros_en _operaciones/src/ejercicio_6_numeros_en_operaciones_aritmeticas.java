
import java.util.Scanner;

/*
 6. Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
 */

/**
 *
 * @author smith
 */
public class ejercicio_6_numeros_en_operaciones_aritmeticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE VALOR_1:"); 
        int a = leer.nextInt();
        System.out.println("INGRESE VALOR_2:"); 
        int b = leer.nextInt();
        
System.out.println("Ingrese una opción");
        int opcion = leer.nextInt();
switch (opcion) {
case 1: int s = a+b;
System.out.println("");
break;
case 2: int r = a-b
System.out.println("");
break;
case 3: int p = a*b
System.out.println("");
break;
case 4: int d = a/b
System.out.println("");
break;
default:
System.out.println("");
      
    }
    
}
