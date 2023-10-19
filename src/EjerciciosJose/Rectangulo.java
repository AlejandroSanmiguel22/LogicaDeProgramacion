package EjerciciosJose;

public class Rectangulo {
    /*
      Crear una clase llamada "Rectángulo" que tenga dos atributos
        privados: base y altura. Incluir métodos para establecer y obtener el
        valor de cada uno de los atributos y un método llamado "área" que
        calcule y devuelva el área del rectángulo
     */
    
    private double base, altura;
    
    public double area(){
        return this.base * this.altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public static void main(String[] args) {
        Rectangulo fig1 = new Rectangulo();
        fig1.setAltura(5.6);
        fig1.setBase(56.5);
        System.out.printf("Area rectangulo = %.2f\n", fig1.area());
        
    }
}
