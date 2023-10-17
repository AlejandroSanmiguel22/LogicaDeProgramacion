/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Basico;

import java.util.ArrayList;
import java.util.Scanner;


 //@author aleja
 
public class Arrays {
    
    /**EJERCICIO 1
     * Arrays: Solicita al usuario 5 números, almacénalos en un array y muestra el promedio.
     * 
     * @return ArrayList
     **/

    public static double promedio(){
        
        ArrayList <Integer> numeroList = new ArrayList();
        
        
        //Llenamos el array
        for(int i=0; i< 5; i++){
            
            Scanner sc = new Scanner(System.in);
            int numero; 
            
            System.out.println("Digite el numero: "+ (i+1));
            numero = sc.nextInt();
            numeroList.add(numero);
        }
        
        int suma =0; 
        double promedio= 0; 

        //Sumamos el array y encontramos el promedio
        for (int i = 0; i < numeroList.size() ; i++) {
           
            suma +=  numeroList.get(i); 
       
        }
        
        promedio = (double) suma / numeroList.size(); 
        
        System.out.println("La suma del arreglo es: "+ suma);
        System.out.println("El promedio del array: "+ promedio);
       
        return promedio ;
    }
    
    
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
          int numero; 
        
        System.out.println("Digite los 5 numeros: ");
        promedio(); 
        
        System.out.println("Digite el numero para saber si es primo: ");
        numero = sc.nextInt();
        primo(numero);
    }

}
