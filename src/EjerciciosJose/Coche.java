package EjerciciosJose;

/**
 *
 * @author Jose Angel Silva
 */
public class Coche {
    /**
     Generar una clase llamada "Coche" que tenga los siguientes atributos: 
     * marca, modelo, matrícula y color. 
     * Incluir métodos para establecer y obtener el valor de cada uno de 
     * los atributos y un método llamado "arrancar" que muestre por pantalla 
     * un mensaje indicando que el coche ha arrancado.
     */
    
    // atributos
    private String marca, modelo, matricula, color;
    private boolean estaArrancado;
    
    // constructor
    public Coche(String marca, String modelo, String matricula, String color){
    estaArrancado = false;
    this.marca = marca;
    this.modelo = modelo;
    this.matricula = matricula;
    this.color = color;
    }
   
    
    public void estaArrancado(){
        if(estaArrancado)
            System.out.printf("El coche %s %s esta arracando \n",
                    this.modelo, this.color);
        else
            System.out.printf("El coche %s %s esta detenido \n",
                    this.modelo, this.color);
            
    }
    
    public void arrancarCoche(){
        if(!this.estaArrancado)
            this.estaArrancado = true;
    }
    public void detenerCoche(){
        if(this.estaArrancado)
            this.estaArrancado = false;
    }

    @Override
    public String toString() {
       return String.format("Marca: %s \n"
               + "Modelo: %s \n"
               + "Matricula: %s \n"
               + "Color: %s \n"
               + "Estado: %s", 
               this.marca, this.modelo, this.matricula, this.color,
               (this.estaArrancado)? "Arrancado": "Denetindo");
    }
    
    
    
    
    public static void main(String[] args) {
        Coche cocheNissan = new Coche("Nissan", 
                "Versa", 
                "ERC-23DF", 
                "Rojo");
        cocheNissan.estaArrancado();
        System.out.println(cocheNissan.toString());
        System.out.println();
        cocheNissan.arrancarCoche();
        cocheNissan.estaArrancado();
        System.out.println();
        System.out.println(cocheNissan.toString());
        /*
        System.out.println();
        Coche cocheNissanNegro = new Coche("Nissan", 
                "Versa", 
                "ERK-23MF-43", 
                "Negro");
        cocheNissanNegro.estaArrancado();
        cocheNissanNegro.arrancarCoche();

        System.out.println(cocheNissanNegro.toString());
        System.out.println();
        cocheNissanNegro.estaArrancado();
*/
    }
}
