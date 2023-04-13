/*1. Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package x2introjavaguia4eje_1_suma_resta_producto_division;

import java.util.Scanner;

/**
 *
 * @author smith
 */
public class X2introJavaGuia4eje_1_suma_resta_producto_division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);//Necesito instanciar la clase Scanner para poder Leer datos por teclado
        int varNumero1;//DEFINO TIPO DE DATO QUE VA A CONTENER ESA VARIABLE
        System.out.println("Ingrese dos numeros para obtener resultados:");
        varNumero1 = leer.nextInt(); // GUARDO EL DATO QUE LEI EN LA VARIABLE
        int varNumero2 = leer.nextInt(); // Opcion dos, defino y leo la variable en la misma linea

        //INVOCAMOS A LA FUNCION SEGUN LA ELECCION DEL USUARIO
        //obs: De este modo puedo imprimir varias cosas en pantalla sin utilizar un SOUT en cada linea
        System.out.println("\nINGRESA una opcion(numero) para operar:"
                + "\n1.SUMA "
                + "\n2.RESTA"
                + "\n3.MULTIIPLICACION "
                +"\n4.DIVIDIR\n");
        
        
        int varRespuesta = leer.nextInt();
        switch (varRespuesta) {// Para que solo muestre un resultado, segun lo que eligio el usuario. 
            case 1:
                System.out.println("LA SUMA DE LOS NUMEROS INGRESADOS ES: " + FuncionSumar(varNumero1, varNumero2));
                break; // Utilizo esto para cortar cuando llega a esta linea la ejecucion dentro de la estructura
            case 2:
                System.out.println("LA RESTA DE LOS NUMEROS INGRESADOS ES: " + FuncionRestar(varNumero1, varNumero2));
                 break;
            case 3:
                System.out.println("LA MULTIPLICACION DE LOS NUMEROS INGRESADOS ES: " + FuncionMultiplicar(varNumero1, varNumero2));
                 break;
            case 4:
                System.out.println("LA MULTIPLICACION DE LOS NUMEROS INGRESADOS ES: " + Funciondividir(varNumero1, varNumero2));
                 break;
            default:
                System.out.println("INGRESO UNA OPCION INCORRECTA");
        }

        

    }
//Recordar que en una funcion, antes del nombre que le puuse, detallo"tipo de dato que va a retornar"
    public static int FuncionSumar(int datoCualquiera1, int datoCualquiera2) {
        int varAuxiliar; //Podria usar una variable de retorno, LOCAL
        varAuxiliar = datoCualquiera1 + datoCualquiera2;
        return varAuxiliar;//Retorno la variable que contiene el resultado.
    }

    public static int FuncionRestar(int x, int y) {
        return x - y;//En este caso realizo la operacion sin usar una variable auxiliar especifica.
    }

    public static int FuncionMultiplicar(int x, int y) {
        return x * y; // En este caso realizo la operacion sin usar una variable auxiliar especifica. 
        }

    public static int Funciondividir(int x, int y) {
        return x / y;
    }
    
}


