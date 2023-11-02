package EjerciciosJose;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jose Angel Silva
 */
public class Factura {
    /**
     * Elaborar un algoritmo que imprima el costo de un pedido de un 
     * artículo del cual se tiene la descripción, la cantidad pedida 
     * y el precio unitario. Si la cantidad pedida excede de 50 unidades, 
     * se hace un descuento de 15%.
     */
    double  total;
    
    ArrayList<ProductoFactura> listaProductos = new ArrayList<ProductoFactura>();
    
    private void agregarProducto(ProductoFactura producto){
        listaProductos.add(producto);
    }
    
    public void agregarProductos( ArrayList<ProductoFactura> listaProductos){
        for(ProductoFactura productoAdd : listaProductos){
            agregarProducto(productoAdd);
        }
    }
    
    private boolean tieneDescuento(ProductoFactura prod){
        return (prod.getCantidad() > 50);
    }
    
    private double calcularCostoNeto(ProductoFactura prod){
        return prod.getCosto() * prod.getCantidad();
    }
    
    private double calcularDescuento(ProductoFactura prod){
        if(tieneDescuento(prod))
            return calcularCostoNeto(prod) * 0.15;
        else
            return 0;
    }
    
    private double costoTotal(ProductoFactura prod){
        return calcularCostoNeto(prod) - calcularDescuento(prod);
    }
    
    public void ImprimirCostoFactura(){
        System.out.printf("ID \t\tNombre \t\t\tDescripcion \t\tCantidad "
                + "\t\tCosto \t\tDescuento \t\tTotal Neto\n\n");
        imprimirCaracter();
        System.out.println();
        for(ProductoFactura prod : this.listaProductos){
            System.out.printf("%s \t\t %s \t\t%s \t %d\t\t\t $%.2f\t\t\t "
                    + "$%.2f\t\t\t $%.2f\n", prod.getDni(),
                    prod.getNombre(),
                    prod.getDescripcion(),
                    prod.getCantidad(),
                    prod.getCosto(),
                    calcularDescuento(prod),
                    costoTotal(prod));
            this.total += costoTotal(prod);
        }
        imprimirCaracter();
        System.out.println();
        System.out.printf("\t\t\t\tTotal: $%.2f\n\n", this.total);
    }
    
    private void imprimirCaracter(){
        for(int i = 0; i<=150; i++){
            System.out.print("-");
        }
    }
    
    
    public static void main(String[] args) {
        ProductoFactura prod;
        ArrayList<ProductoFactura> listaVenta = new ArrayList<>();
        Scanner inp = new Scanner(System.in);
        boolean continuar = true;
        do{
            System.out.print("Ingresa id Producto: ");
            String id = inp.nextLine();
            System.out.print("Ingresa nombre Producto: ");
            String nombre = inp.nextLine();
            System.out.print("Ingresa la descripcion: ");
            String descripcion = inp.nextLine();
            System.out.print("Ingresa el costo unitario: ");
            double costoUnitario = inp.nextDouble();
            System.out.print("Ingresa la cantidad: ");
            int cantidadProducto = inp.nextInt();
            
            prod = new ProductoFactura(id, 
                    nombre, 
                    descripcion, 
                    costoUnitario, 
                    cantidadProducto);
            listaVenta.add(prod);
            
            System.out.print("Desea ingresar mas producto? s/n: ");
            char descicion = inp.next().charAt(0);
            inp.nextLine();
            if(descicion == 's')
                continuar = true;
            else
                continuar = false;
            System.out.println();
        }while(continuar);
        
        Factura facturarPago = new Factura();
        facturarPago.agregarProductos(listaVenta);
        facturarPago.ImprimirCostoFactura();
    }
}
