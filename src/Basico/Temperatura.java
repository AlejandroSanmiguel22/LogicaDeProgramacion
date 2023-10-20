/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Basico;

import java.util.Scanner;


 /**
  * Crear una clase llamada Temperatura con el atributo que almacene grados kelvin, además,
que contengan dos métodos que conviertan grados Celsius y otra a grados Fahrenheit
  * 
  * 
  * @author aleja
  */
public class Temperatura {

    //Atributos
    private double kelvin; 
    
    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(Double kelvin) {
        this.kelvin = kelvin;
    }
    
    //Metodo de kelvin a celsius
    public double celsius(double kelvin){
        
        double celsius; 
        celsius = kelvin - 273.15; 
        
        return celsius;
        
    }
   
    //Metodo de kelvin a fahrenheit
    public double fahrenheit(double kelvin) {

        double fahrenheit;
        fahrenheit = ((kelvin -  273.15)*1.8+32);
        
        return  fahrenheit; 
        
    }
    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digita los grados kelvin: ");
        double celsius = sc.nextDouble();
        
        System.out.println("Digita los grados fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        
        Temperatura k = new Temperatura();
        
        System.out.println("Los grados celsius es: "+ k.celsius(celsius));
        System.out.println("Los grados fahrenheit es: "+ k.fahrenheit(fahrenheit));

        
    }
}
