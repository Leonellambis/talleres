
package taller8_Herencia.ejercicio2;

public class Persona {
    protected String nombre;
    protected int edad;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad; 
    }
    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " +edad);
    }
}
