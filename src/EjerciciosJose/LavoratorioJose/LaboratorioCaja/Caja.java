package EjerciciosJose.LavoratorioJose.LaboratorioCaja;

/**
 *
 * @author Jose Angel Silva
 */
public class Caja {
    private int ancho,profundo, altura;
    
    public Caja(){
        this.ancho = 0;
        this.profundo = 0;
        this.altura = 0;
    }
    public Caja(int ancho, int profundo, int altura){
        this.ancho = ancho;
        this.profundo = profundo;
        this.altura = altura;
    }
    
    public int calcularVolumen(){
        return this.ancho * this.altura * this.profundo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return String.format("Informacion del cubo \n"
                + "*********************\n"
                + "Ancho: %d\n"
                + "Largo: %d\n"
                + "Profundo: %d\n"
                + "Volumen: %d\n\n", this.ancho, this.altura, this.profundo,
                calcularVolumen());
    }
 
}
