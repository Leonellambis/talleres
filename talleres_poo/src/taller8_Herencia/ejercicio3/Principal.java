
package taller8_Herencia.ejercicio3;

public class Principal {
    public static void main(String[] args){
        Empleado empleado = new Empleado ("juan andres", 288298);
        System.out.println("Detalles de empleado:");
        empleado.mostrarDetalles();
        
        Gerente gerente = new Gerente ("allisson mendoza", 380000, "Salud");
        System.out.println("\nDetalles del Gerente:");
        gerente.mostrarDetalles();
    }
}
