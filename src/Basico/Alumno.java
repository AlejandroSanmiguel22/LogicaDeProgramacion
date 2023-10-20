/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Basico;

import java.util.ArrayList;
import java.util.Scanner;


 //@author aleja
 
public class Alumno {

    //Atributos 
    private String nombre; 
    private ArrayList<Alumno> notasAlumnos; 

    
    //Metodos para establecer valores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alumno> getNotasAlumnos() {
        return notasAlumnos;
    }

    public void setNotasAlumnos(ArrayList<Alumno> notasAlumnos) {
        this.notasAlumnos = notasAlumnos;
    }
    
    
    //Metodo para calcular promedio de notas y nombe del estudiante
    public double datosEstudiante(ArrayList<Double>notas,String nombre){
        
        this.nombre = nombre; 
        
        double promedio = 0; 
        double nota;
        double suma=0; 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("--------------- Notas estudiante %s ---------------", nombre);
        
        for (int i = 0; i <= 3; i++) {
            
            System.out.println("");
            System.out.printf("Digite la nota %d: ", (i+1));
            nota = sc.nextDouble();
            notas.add(nota);  
        }
        
        for (int i = 0; i < notas.size(); i++) {
     
            suma +=  notas.get(i);  
        }
        
        promedio = suma / notas.size();
        
        System.out.println("\n El promedio de notas del estudiante es: "+ promedio);
        
        return promedio; 
        
    }
    
    public static void main(String[] args) {
        
        Alumno alumno = new Alumno(); 
        ArrayList<Double> notas = new ArrayList<>(); 
        alumno.datosEstudiante(notas,"Alejandro");
        
    }
    
}
