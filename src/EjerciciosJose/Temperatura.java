package EjerciciosJose;

import java.util.Scanner;

/**
 *
 * @author Jose Angel Silva
 */
public class Temperatura {
    /*
    Crear una clase llamada **Temperatura** con el atributo que almacene 
    grados kelvin, además, que contengan dos métodos que conviertan grados 
    Celsius y otra a grados Fahrenheit.
    */
    
    private double gradosKelvin;
    
    public Temperatura(double gradosKelvin){
        this.gradosKelvin = gradosKelvin;
    }
    
    public double convertirAGradosCelsius(){
        return  this.gradosKelvin - 273.15;
    }
    
    public double convertirAGradosfah(){
        return (convertirAGradosCelsius() * 1.8) + 32;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de grados Kelvin: ");
        double gradosKelvinIngresado = input.nextDouble();
        
        Temperatura convTemperatura = new Temperatura(gradosKelvinIngresado);
        System.out.printf("Grados K: %.3f - Grados C: %.3f \n", gradosKelvinIngresado,
                convTemperatura.convertirAGradosCelsius());
        System.out.printf("Grados K: %.3f - Grados F: %.3f \n", gradosKelvinIngresado,
                convTemperatura.convertirAGradosfah());
        
    }
}
