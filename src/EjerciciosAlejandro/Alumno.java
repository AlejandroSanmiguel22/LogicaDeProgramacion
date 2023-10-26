/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EjerciciosAlejandro;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {

    // Atributos 
    private String nombre;
    private ArrayList<Double> notasAlumnos = new ArrayList<>(); 

    // Metodos para establecer valores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getNotasAlumnos() {
        return notasAlumnos;
    }

    public void setNotasAlumnos(ArrayList<Double> notasAlumnos) {
        this.notasAlumnos = notasAlumnos;
    }

    // Metodo para calcular promedio de notas y nombre del estudiante
    public double promedioEstudiante() { 

        double suma = 0;

        for (int i = 0; i <= 3; i++) {
            Scanner sc = new Scanner(System.in); 
            System.out.println("");
            System.out.printf("Digite la nota %d: ", (i + 1));
            double nota = sc.nextDouble();
            notasAlumnos.add(nota);
        }

        for (Double nota : notasAlumnos) 
            suma += nota;

        return suma / notasAlumnos.size();
    }

    public void mostrarDatos() {
        System.out.printf("--------------- Notas estudiante %s ---------------", nombre);
        System.out.println("\n El promedio de notas del estudiante es: "+ promedioEstudiante() );
    }

    public static void main(String[] args) {
        
        Alumno alumno = new Alumno();
        alumno.setNombre("Alejandro");
        alumno.mostrarDatos(); 

    }
}

