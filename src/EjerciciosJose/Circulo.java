package EjerciciosJose;

/**
 *
 * @author Jose Angel Silva
 */
public class Circulo {
    private double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    
    public double area(){
        return Math.PI * Math.pow(radio, 2);
    }
    
    
    
    public static void main(String[] args) {
        Circulo fig1 =  new Circulo(5.5);
        System.out.printf("El area del circulo con el radio %.2f es: %.4f"
                + "\n",
                fig1.getRadio(), fig1.area());
    }
    
}
