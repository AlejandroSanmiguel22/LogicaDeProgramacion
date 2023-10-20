/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Basico;


 //@author aleja
 
/**
 * Crear una clase llamada "Rectángulo" que tenga dos atributos
privados: base y altura. Incluir métodos para establecer y obtener el
valor de cada uno de los atributos y un método llamado "área" que
calcule y devuelva el área del rectángulo.
 * 
 * 
 * @author aleja
 */
public class Rectangulo {

    private int base ; 
    private int altura; 
    
    public int area(int altura, int base){
        
        int area = base * altura; 
        return area; 
        
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
  
    public static void main(String[] args) {
        
        Rectangulo ob1 = new Rectangulo(); 
        
        ob1.setAltura(2);
        ob1.setBase(2);
        
        ob1.area(ob1.getAltura(), ob1.getBase());
        
        System.out.println(ob1.area(ob1.getAltura(), ob1.getBase()));
        
    }
}
