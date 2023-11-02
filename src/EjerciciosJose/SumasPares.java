
package EjerciciosJose;

import java.util.Scanner;

/**
 *
 * @author Jose Angel Silva
 */
public class SumasPares {
    /**
     * Elaborar un algoritmo que permita leer un número N par y calcule 
     * e imprima la suma de los números pares del 2 hasta el número leído. 
     * Si el número leído es menor a 2 debe imprimir un mensaje de error.
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Ingresar un numero: ");
        int limSuma = inp.nextInt();
        int sumaPar = 0;
        for(int i = 1; i <= limSuma; i++){
            if(i%2 == 0 )
                sumaPar += i;
        }
        System.out.println("Suma Par total: " + sumaPar);
    }
}
