/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EjerciciosAlejandro;

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
            
            System.out.printf("Digite el numero %d : ",(i+1));
            numero = sc.nextInt();
            numeroList.add(numero);
        }
        
        int suma =0; 
        double promedio; 

        //Sumamos el array y encontramos el promedio
        for (int i = 0; i < numeroList.size() ; i++) {
           
            suma +=  numeroList.get(i); 
       
        }
        
        promedio = (double) suma / numeroList.size(); 
        
        System.out.println("La suma del arreglo es: "+ suma);
        System.out.println("El promedio del array: "+ promedio);
       
        return promedio ;
    }
    
    
    
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        
        System.out.println("Digite los 5 numeros: ");
        promedio(); 
        
        sc.close();

    }

}
