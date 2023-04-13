/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2_valores_funciones.aritmeticas;

/**
 *
 * @author smith
 */
public class sumaDeElementosEntreVectores_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//SUMA metodo F  O R
       
         int arr[] = new int[] {12,34,45,21,33,4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Array Sum = "+sum);
        
    }
}// TODO code application logic here
    
    

