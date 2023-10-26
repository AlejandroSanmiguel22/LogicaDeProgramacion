/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EjerciciosAlejandro;

import java.util.Scanner;


/**
 * Crear un programa que pueda ingresar una unidad de medida de distancia en pies y que
    pueda convertirlo a yardas, pulgadas, metros, centímetros y kilómetros usando a partir de la
    clase llamada ConversorMedidasPies, pulgadas, metros, centímetros y kilómetros usando a partir de la
    clase llamad
 * 
 * @author aleja
 */
 public class ConversorMedidasPies {

    public double yardas(double pies) {

        double yardas = pies / 3;

        return yardas;
    }

    public double pulgadas(double pies) {

        double pulgadas = pies * 12;

        return pulgadas;
    }

    public double metros(double pies) {

        double metros = pies  / 3.281;

        return metros;
    }

    public double centímetros(double pies) {

        double centímetros = pies / 30.48;

        return centímetros;
    }

    public double kilómetros(double pies) {

        double kilómetros = pies / 3281;

        return kilómetros;
    }

    public void mostrarDatos() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el la unidad en pies: ");
        double pies = sc.nextDouble();

        System.out.printf("El valor en yardas es: %f", yardas(pies));
        System.out.printf("\nEl valor en pulgadas es: %f", pulgadas(pies));
        System.out.printf("\nEl valor en metros es: %f", metros(pies));
        System.out.printf("\nEl valor en centimetros es: %f", centímetros(pies));
        System.out.printf("\nEl valor en kilometros es: %f", kilómetros(pies));
        

    }

    public static void main(String[] args) {

        ConversorMedidasPies ob = new ConversorMedidasPies();
        ob.mostrarDatos();
    }

}
