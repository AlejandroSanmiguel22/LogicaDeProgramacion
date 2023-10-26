/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosJose.LavoratorioJose.LaboratorioCaja;

/**
 *
 * @author Jose Angel Silva
 */
public class Caja {
    private int ancho,profundo, altura;
    
    public Caja(){
        this.ancho = 0;
        this.profundo = 0;
        this.altura = 0;
    }
    public Caja(int ancho, int profundo, int altura){
        this.ancho = ancho;
        this.profundo = profundo;
        this.altura = altura;
    }
    
    public int calcularVolumen(){
        return this.ancho * this.altura * this.profundo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
