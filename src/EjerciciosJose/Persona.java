package EjerciciosJose;

/**
 *
 * @author Jose Angel Silva
 */
public class Persona {
    /*
    Instaurar una clase llamada "Persona" que tenga los siguientes
    atributos: nombre, edad y género. Incluir métodos para establecer y
    obtener el valor de cada uno de los atributos. Además, incluir un
    método que muestre por pantalla toda lainformación del objeto
    */
    private String nombre;
    private byte edad;
    private char genero; // Masculino o Femenino

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        String mensaje = String.format("Nombre: %s \n"
                + "Edad: %d \n"
                + "Genero: %s \n",
                this.nombre, this.edad, this.genero);
        return mensaje;
    }
    
    
    public static void main(String[] args) {
        Persona person1 =  new Persona();
        person1.setNombre("Hugo Santiago");
        person1.setEdad((byte) 26);
        person1.setGenero('M');
        
        System.out.println(person1.toString());
        
    }
    
}
