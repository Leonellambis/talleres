
package taller8_Super.ejercicio1;

public class Principal {
    public static void main(String[] args){
        Persona persona = new Persona("camila estrada", 19);
        System.out.println("Detalles de la persona: ");
        persona.mostrarDetalles();
        
        Empleado empleado = new Empleado("gabriel lopez", 25, "Finanzas");
        System.out.println("\nDetalles del empleado: ");
        empleado.mostrarDetalles();
    }
}
