/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
diferente a cada una. A continuación, realizar las instrucciones necesarias 
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D 
tome el valor de B. Mostrar los valores iniciales y los valores finales de cada 
variable. Utilizar sólo una variable auxiliar.
 */
package extraguia3_eje_2_cuatro_variables;

import java.util.Scanner;

/**
 *
 * @author smith
 */
public class ExtraGuia3_eje_2_cuatro_variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int a = 10;
        int b = 15;
        int c = 20;
        int d = 25;
        int aux;
        
        System.out.println("Valores iniciales");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("C = "+c);
        System.out.println("D = "+d);
        System.out.println("Valores convertidos");
        aux=a;
        a=d;
        System.out.println("A = "+a);
        a=aux;
        aux=b;
        b=c;
        System.out.println("B = "+b);
        b=aux;
        aux=c;
        c=a;
        System.out.println("C = "+c);
        d=b;
        System.out.println("D = "+d);
    }
    
}
