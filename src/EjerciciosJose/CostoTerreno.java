package EjerciciosJose;

/**
 *
 * @author Jose Angel Silva
 */
public class CostoTerreno {
    /**
     * Elaborar un algoritmo para calcular e imprimir el precio de un 
     * terreno del cual se tienen los siguientes datos: largo, ancho y 
     * precio por metro cuadrado. Si el terreno tiene más de 400 metros 
     * cuadrados se hace un descuento de 10 %.
     */
    
    private double largo, ancho, precioMetroCuadrado;
    
    public CostoTerreno(double largo, double ancho, 
            double precioMetroCuadrado){
        this.largo = largo;
        this.ancho = ancho;
        this.precioMetroCuadrado = precioMetroCuadrado;
    }
    
    private double calcAreaTerreno(){
        return this.largo * this.ancho;
    }
    /*
    Igual al ejercicio anterior, sólo que si el terreno tiene más de 
    500 metros cuadrados el descuento es de 17 % y si tiene más de 
    1000 el descuento es de 25 %.
    */
    private boolean hayDescuento(){
        return (calcAreaTerreno() > 400);
    }
    
    private double calcularDescuento(){
        double area = calcAreaTerreno();
        if(area > 1000)
            return CalcularPresioTerrenoNeto()* 0.25;
        if(area > 500)
            return CalcularPresioTerrenoNeto() * 0.17;
        if(area > 400)
            return CalcularPresioTerrenoNeto() * 0.1;
        else
            return 0;
    }
    
    public double CalcularPresioTerrenoNeto(){
        double neto = calcAreaTerreno() * this.precioMetroCuadrado;
        return neto;
    }
    
    public double CalcularTotal(){
        double total = CalcularPresioTerrenoNeto();
        if(hayDescuento())
            total -= calcularDescuento();
        return total;
    }

    @Override
    public String toString() {
        return String.format("Ancho: %.2f\n"
                + "Largo: %.2f\n"
                + "Area: %.2f\n"
                + "Costo m2: $%.4f\n"
                + "Hay descuento: %s\n"
                + "Neto: $%.2f\n"
                + "Descuento: $%.2f\n"
                + "Total: $%.2f\n"
                + "", this.ancho, this.largo,
                calcAreaTerreno(), this.precioMetroCuadrado,
                hayDescuento(), CalcularPresioTerrenoNeto(),
                calcularDescuento(), CalcularTotal());
    }
    
    public static void main(String[] args) {
        CostoTerreno terreno1 = new CostoTerreno(19, 8, 1500);
        System.out.println(terreno1.toString());
    }
}
