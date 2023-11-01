package EjerciciosJose;

/**
 *
 * @author Jose Angel Silva
 */
public class ConversionGradosRad {
    /**
     * Elaborar un algoritmo que permita leer el tamaño de un 
     * ángulo en radianes e imprima la tangente, 
     * cotangente, secante y cosecante
     */
    
    private double gradRadianes;
    
    public ConversionGradosRad(double gradRadianes){
        this.gradRadianes = gradRadianes;
    }
    
    private double sen(){
        return Math.sin(this.gradRadianes);
    }
    private double cos(){
        return Math.cos(this.gradRadianes);
    }
    
    public double tangente(){
        return Math.tan(gradRadianes);
    }
    public double cotagente(){
        return 1 / tangente();
    }
    public double secante(){
        return 1 / cos();
    }
    public double cosecante(){
        return 1 / sen();   
    }

    @Override
    public String toString() {
        return String.format("Grados Radines: %f \n"
                + "Tangente: %f \n"
                + "Cotagente: %f \n"
                + "Secante: %f \n"
                + "Cosecante: %f\n", this.gradRadianes,
                this.tangente(),
                this.cotagente(),
                this.secante(),
                this.cosecante());
    }
    
    public static void main(String[] args) {
        ConversionGradosRad grad1 = new ConversionGradosRad(1.57079632);
        System.out.println(grad1.toString());
        
    }
    
}
