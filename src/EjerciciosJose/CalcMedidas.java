package EjerciciosJose;

import java.util.Scanner;

/**
 *
 * @author Jose Angel Silva
 */
public class CalcMedidas {
    /**
     * Elabore un algoritmo que lea un número de pies y calcule e imprima 
     * su equiva- lente en yardas, pulgadas, centímetros y metros, 
     * de acuerdo con las siguientes equivalencias: 1 pie = 12 pulgadas, 
     * 1 yarda = 3 pies, 1 pulgada = 2.54 cm, 1 metro = 100 cm.
     */
    private double pies;
    
    public CalcMedidas(double pies){
        this.pies = pies;
    }
    
    private double convToPulgadas(){
        return this.pies * 12;
    }
    
    private double convToYarda(){
        return this.pies / 3;
    }
    
    private double convToCentimetros(){
        return convToPulgadas() * 2.54;
    }
    
    private double convToMetros(){
        return convToCentimetros() / 100;
    }

    @Override
    public String toString() {
        return String.format("Pies: %.2f\n"
                + "Pulgadas: %.2f\n"
                + "Yardas: %.2f\n"
                + "Centimetros: %.2f\n"
                + "Metros: %.3f\n", this.pies,
                convToPulgadas(),
                convToYarda(),
                convToCentimetros(),
                convToMetros());
    }
    
    public static void main(String[] args) {
        double pies = solDato();
        CalcMedidas convPies = new CalcMedidas(pies);
        System.out.println(convPies.toString());
    }
    
    public static double solDato(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Ingrese el valor de Pies a convertir: ");
        double input = inp.nextDouble();
        return input;
    }
}
