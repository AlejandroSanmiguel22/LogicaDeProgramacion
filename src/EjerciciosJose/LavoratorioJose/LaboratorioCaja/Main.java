
package EjerciciosJose.LavoratorioJose.LaboratorioCaja;

/**
 *
 * @author Jose Angel Silva
 */
public class Main {
    public static void main(String[] args) {
        Caja caja1 = new Caja();
        caja1.setAltura(15);
        caja1.setAncho(12);
        caja1.setProfundo(2);
        System.out.println(caja1.toString());
        
        Caja caja2 = new Caja(10, 6, 16);
        System.out.println(caja2.toString());
    }
}
