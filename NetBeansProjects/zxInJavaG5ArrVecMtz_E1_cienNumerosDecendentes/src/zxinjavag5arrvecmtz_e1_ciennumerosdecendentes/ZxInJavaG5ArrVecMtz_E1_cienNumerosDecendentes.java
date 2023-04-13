/*
 * Ejercicio 1_Realizar un algoritmo que llene un
     * vector con los 100 primeros números enteros y los muestre por pantalla en
     * orden descendente.
 */
package zxinjavag5arrvecmtz_e1_ciennumerosdecendentes;

/**
 *
 * @author smith
 */
public class ZxInJavaG5ArrVecMtz_E1_cienNumerosDecendentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vector[] = new int[100]; // Le ponemos la dimension al vector


// Asigno valores mediante el for
        for (int i = 0; vector.length > i; i++) {
            vector[i] = i;
        }
// Muestro el vector
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println("[" + vector[i] + "]");

        }
    }
}
