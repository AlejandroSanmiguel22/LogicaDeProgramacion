/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EjerciciosAlejandro;

import java.util.Scanner;


 //@author aleja
 
public class NumeroPrimo {

    /**
     * EJERCICIO 2
     *  Calcular si un numero es primo 
     * 
     * 
     * 
     */
    
    public static int primo( int numero){
        
        Scanner sc = new Scanner(System.in);
         
        if(numero % 1 == 0 && numero % numero == 0){
            System.out.println("El numero ingresado es primo");
            
        }else{
            System.out.println("El numero no es primo");
        }
        
        return 0; 

    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite el numero para saber si es primo: ");
        
        int numero = sc.nextInt();
        primo(numero);
    }
}
