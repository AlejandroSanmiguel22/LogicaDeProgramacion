package EjerciciosJose;

/**
 *
 * @author Jose Angel Silva
 */
/*
Desarrolla una clase llamada **Alumno** con los siguientes atributos: 
nombre y cuatro calificaciones. 
Además, implementa métodos para establecer los valores de nombre y 
calificaciones, calcular el promedio de las calificaciones y para 
imprimir el nombre del estudiante junto con su promedio general.
*/
public class Alumno {
    
    private String nombreAlumno;
    float[] arrayCalificaciones = new float[4];

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public void setCuatroCalificaciones(float[] arrayCalificaciones) {
        this.arrayCalificaciones = arrayCalificaciones;
    }
    
    private float calcularPromedio(){
        float operacionCalificacion = 0f;
        for(float calf : this.arrayCalificaciones){
            operacionCalificacion += calf;
        }
        operacionCalificacion /= this.arrayCalificaciones.length;
        return operacionCalificacion;
    }

    public String mostrarCalificacion() {
        
        return String.format("El alumno '%s' tiene el promedio de %.2f \n",
                this.nombreAlumno, calcularPromedio());
    }
    
    
    public static void main(String[] args) {
        Alumno alum1 = new Alumno();
        float[] listaCalificaciones = {10f, 9.9f, 8.5f, 9.1f};
        alum1.setNombreAlumno("Jose Angel Silva");
        alum1.setCuatroCalificaciones(listaCalificaciones);
        System.out.println(alum1.mostrarCalificacion());
        
        
        Alumno alumno2 = new Alumno();
        float[] listaCalificaciones2 = {8.5f, 9f, 8.9f, 9.1f};
        alumno2.setNombreAlumno("Andrea Martinez");
        alumno2.setCuatroCalificaciones(listaCalificaciones2);
        System.out.println(alumno2.mostrarCalificacion());
    }
    
    
}
