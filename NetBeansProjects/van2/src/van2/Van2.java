/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package van2;

/**
 *
 * @author smith
 */
public class Van2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Declarar las variables
        int num1, num2, suma;
        
        //Importar Scanner para realizar la lectura
        Scanner leer=new Scanner(System.in);
        
        //Entrada de datos
        System.out.println("Ingrese un número");
        num1=leer.nextInt();//Integer.parseInt(leer.next()) ;        
        System.out.println("Ingrese el segundo número");
        num2=leer.nextInt();//Integer.parseInt(leer.next()) ;
        
        //Realizamos la suma
        suma=num1+num2;
        //Mostramos el resultado
        System.out.println("La suma de los números es: "+suma);
        // TODO code application logic here
    }
    
}
