package pkg2_valores_funciones.aritmeticas;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smith
 */
public class SumaDeElementosEntreVectores_reduce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int arr[] = new int[] {12,34,45,21,33,4};
        int sum = Arrays.stream(arr).reduce(0,(a,b)->  a + b);
        System.out.println("Array Sum = "+sum);
// TODO code application logic here
    }
    
}
