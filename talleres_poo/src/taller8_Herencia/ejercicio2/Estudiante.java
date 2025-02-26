
package taller8_Herencia.ejercicio2;


public class Estudiante extends Persona{
    protected int matricula;
    
    public Estudiante(String nombre, int edad, int matricula){
        super(nombre,edad);
        this.matricula = matricula;
    }
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Matricula: " + matricula);
    }
}
