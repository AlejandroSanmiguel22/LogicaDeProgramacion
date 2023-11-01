package EjerciciosJose;

public class ConversionDeGrados {
    private double gradosNormal;
    private ConversionGradosRad calcularAngulosRadianes;

    public ConversionDeGrados(double gradosNormal) {
        this.gradosNormal = gradosNormal;
        this.calcularAngulosRadianes = new ConversionGradosRad(
                convGradosToRadianes(gradosNormal)
        );
    }
    
    private double convGradosToRadianes(double grados){
        return grados * (Math.PI / 180);
    }
    
    private double convRadianesToGrados(double rad){
        return rad * (180 / Math.PI);
    }
    
    public double getTangenteGrados(){
        return convRadianesToGrados(this.calcularAngulosRadianes.tangente());
    }
    public double getCotagenteGrados(){
        return convRadianesToGrados(this.calcularAngulosRadianes.cotagente());
    }
    public double getSecanteGrados(){
        return convRadianesToGrados(this.calcularAngulosRadianes.secante());
    }
    public double getCosecanteGrados(){
        return convRadianesToGrados(this.calcularAngulosRadianes.cosecante());
    }

    @Override
    public String toString() {
        return String.format("Grados: %f\n"
                + "Tagente: %f\n"
                + "Cotagente: %f\n"
                + "Secante: %f\n"
                + "Cosecante: %f\n", this.gradosNormal,
                getTangenteGrados(),
                getCotagenteGrados(),
                getSecanteGrados(),
                getCosecanteGrados());
    }
    
    public static void main(String[] args) {
        
        ConversionDeGrados grados1 = new ConversionDeGrados(90);
        System.out.println(grados1.toString());
    }
    
}
