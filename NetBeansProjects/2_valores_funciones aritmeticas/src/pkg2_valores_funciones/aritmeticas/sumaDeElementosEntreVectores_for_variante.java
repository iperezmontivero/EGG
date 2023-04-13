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
public class sumaDeElementosEntreVectores_for_variante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = new int[] {12,34,45,21,33,4};
        int sum,i;
        for(sum= 0, i= arr.length - 1; 0 <= i; sum+= arr[i--]);
        System.out.println("Array Sum = "+sum);// TODO code application logic here
    }
    
}
