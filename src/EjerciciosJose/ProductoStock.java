package EjerciciosJose;

/**
 *
 * @author Jose Angel Silva
 */
public class ProductoStock {
    /*
    Generar una clase llamada "Producto" que tenga los siguientes atributos: 
    nombre, precio y cantidad en stock. 
    Incluir métodos para establecer y obtener el valor de cada uno de los 
    atributos y un método llamado "valorTotal" que calcule y devuelva el
    valor total del producto (precio x cantidad en stock).
    */
    private String nombre;
    private double precio;
    private int cantidadStock;
    
    public ProductoStock(String nombreProducto, 
            double precio, 
            int cantidadStock){
        this.nombre = nombreProducto;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    };
    
    public double valorTotal(){
        return this.precio * this.cantidadStock;
    }

    @Override
    public String toString() {
        return String.format("Producto: %s \n"
                + "Precio Unitario: $%.2f \n"
                + "Cantidad en Stock: %d \n"
                + "Valor Total $%.2f \n",
                this.nombre,
                this.precio,
                this.cantidadStock,
                valorTotal());
    }
    
    public static void main(String[] args) {
        ProductoStock prod1 = new ProductoStock("Xiaomi S5", 4500, 15);
        ProductoStock prod2 = new ProductoStock("Pantalla LG 50 pulgada", 15785.89, 6);
        System.out.println(prod1.toString());
        System.out.println(prod2.toString());
        
    }
    
    
}
