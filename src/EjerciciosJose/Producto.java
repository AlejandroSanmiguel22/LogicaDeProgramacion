package EjerciciosJose;

/**
 *
 * @author Jose Angel Silva
 */
public class Producto {
    /*
    Elaborar un programa que se pueda ingresar nombre de un producto y 
    su costo, La utilidad es el 150% y el impuesto es el 15%. 
    Calcular e imprimir los datos del nombre del producto, 
    utilidad, impuesto y precio de venta.
    */
    private String nombreProducto;
    private double costoProduccion;
    
    public Producto(String nombreProducto, double costoProduccion){
        this.nombreProducto = nombreProducto;
        this.costoProduccion = costoProduccion;
    }
    
    private double calcUtilidad(){
        return this.costoProduccion * 1.5;
    }
    private double calcImpuesto(){
        return (this.costoProduccion + calcUtilidad()) * 0.15;
    }
    private double calcCostoTotal(){
        return this.costoProduccion + calcUtilidad() + calcImpuesto();
    }

    @Override
    public String toString() {
        return String.format("Producto: %s \n"
                + "Costo de Prod: $%.2f \n"
                + "Utilidad: $%.2f \n"
                + "Impuesto: $%.2f \n"
                + "Total: $%.2f \n",
                this.nombreProducto, this.costoProduccion, calcUtilidad(),
                calcImpuesto(), calcCostoTotal());
    }
    
    public static void main(String[] args) {
        Producto prod1 = new Producto("Coca-cola 2L", 
                10);
        System.out.println(prod1.toString());
    }
    
    
    
}
