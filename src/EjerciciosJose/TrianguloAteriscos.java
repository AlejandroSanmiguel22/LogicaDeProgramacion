package EjerciciosJose;

import java.util.Scanner;

/**
 *
 * @author Jose Angel Silva
 */
public class TrianguloAteriscos {
    public static void main(String[] args) {
        /**
         * Elaborar un algoritmo que lea un valor N y que imprima un 
         * triángulo de asteris- cos, como se muestra a continuación. 
         * Si el valor leído es 5 imprimir:
         * | * 
         * | * * 
         * | * * * 
         * | * * * * 
         * | * * * * *
         */
        Scanner inp = new Scanner(System.in);
        int cantidadLineas = inp.nextInt();
        
        for(int i = 1; i <= cantidadLineas; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
