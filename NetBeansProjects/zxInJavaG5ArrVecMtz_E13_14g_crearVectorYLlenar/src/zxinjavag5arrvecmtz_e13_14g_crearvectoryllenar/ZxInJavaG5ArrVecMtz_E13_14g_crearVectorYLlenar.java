/*Ejercicio 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
Ejercicio 14
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
compañeros de equipo.
 */
package zxinjavag5arrvecmtz_e13_14g_crearvectoryllenar;

import java.util.Scanner;

/**
 *
 * @author smith
 */
public class ZxInJavaG5ArrVecMtz_E13_14g_crearVectorYLlenar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Ingrese nombres de compañeros: ");
        
        Scanner nombres= new Scanner(System.in); //ingreso de datos
        
        String  Equipo[] = new String[5]; // crear vector 
        
        for (int i = 0; i < 5; i++) {
            
         Equipo[i] = nombres.next(); // Le asignamos a cada posicion del vector los nombres
         
       }
      for (int i = 0; i < 5; i++) {
          
      System.out.print("[" + Equipo[i] + "]"); //mostramos el vector
            
        }
    }
}