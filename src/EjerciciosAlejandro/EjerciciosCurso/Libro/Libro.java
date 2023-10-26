/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EjerciciosAlejandro.EjerciciosCurso.Libro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Instaurar una clase llamada "Libro" que tenga los siguientes atributos:
 * título, autor, año de publicación y número de páginas. Incluir métodos para
 * establecer y obtener el valor de cada uno de los atributos
 * 
 * */
 
public class Libro {
    
    //Atributos 
    private String titulo; 
    private  String autor; 
    private  LocalDate añoPublicacion; 
    private int numeroPaginas; 
    
    
    //Constructores
    public Libro() {
    }

    public Libro(String titulo, String autor, LocalDate añoPublicacion, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.numeroPaginas = numeroPaginas;
    }

    //Set y Get
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(LocalDate añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    
    //Metodo para agregar  libro 
    public void agregarLibro(){
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Titulo del libro: ");
        setTitulo(sc.nextLine());
        System.out.print("Autor del libro: ");
        setAutor(sc.nextLine());
        System.out.print("Fecha de publicacion del libro: ");
        String fecha = sc.nextLine();
        LocalDate fechaPublicacion = LocalDate.parse(fecha, formatter);
        setAñoPublicacion(fechaPublicacion);
        System.out.print("Numero de paginas del libro: ");
        setNumeroPaginas(sc.nextInt());
        
    }
    
    //Metodo para mosrar datos del libro
    public  void mostrarLibro (){
        
        agregarLibro();
        System.out.println("");
        System.out.println("--------DATOS DEL LIBRO AGREGADO--------");
        System.out.printf("\nTitulo: %s", (getTitulo()));
        System.out.printf("\nAutor: %s", (getAutor()));
        System.out.printf("\nFecha de publicacion: %s", (getAñoPublicacion()));
        System.out.printf("\nNumero de paginas: %s", (getNumeroPaginas()));
        
    }
    

}
