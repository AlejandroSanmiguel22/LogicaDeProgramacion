/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosAlejandro.EjerciciosCurso.Cubo;

//@author aleja
import java.util.Scanner;

public class Caja {

    //Atributos 
    private int ancho;
    private int largo;
    private int alto;

    //Constructores
    public Caja() {
    }

    public Caja(int ancho, int largo, int alto) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    //Set y get 
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    //Metodo para calcular el volumen de la caja
    public int volumenCaja(int ancho, int alto, int largo) {

        int volumen;
        volumen = ancho * alto * largo;

        return volumen;
    }

    //Metodo para pedir los datos del cubo
    public void perdirDatos() {
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i <= 2; i++) {
            
            if (i == 0) {
                System.out.print("\nDigite el valor del ancho de la caja: ");
                setAncho(sc.nextInt());
            }
            if (i == 1) {
                System.out.print("\nDigite el valor del largo de la caja: ");
                setLargo(sc.nextInt());
            }
            if (i == 2) {
                System.out.print("\nDigite el valor del alto de la caja: ");
                setAlto(sc.nextInt());
            }

        }
    }

    //Metodo para mostrar datos
    public void mostrarDatos() {

        perdirDatos();
        System.out.println("");
        System.out.println("--------DATOS DE LA CAJA--------");
        System.out.printf("Ancho: %s", (getAncho()));
        System.out.printf("\nAlto: %s", (getAlto()));
        System.out.printf("\nLargo: %s", (getLargo()));
        
        System.out.printf("\nEl volumen del caja es: %s ",volumenCaja(ancho, alto, largo));
    }

}
