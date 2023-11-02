package EjerciciosJose;

/**
 *
 * @author Jose Angel Silva
 */
public class ProductoFactura {
    private String dni;
    private String nombre;
    private String descripcion;
    private double costo;
    private int cantidad;
    
    public ProductoFactura(String dni, String nombre, String descripcion, double costo, int cantidad){
        this.dni = dni;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.cantidad = cantidad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
}
