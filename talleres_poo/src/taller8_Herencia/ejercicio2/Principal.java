
package taller8_Herencia.ejercicio2;


public class Principal {
    public static void main (String[] args){
        Estudiante estudiante = new Estudiante("leonel lambis", 17 , 24108729);
        
        System.out.println("Detalles del estudiante: ");
        estudiante.mostrarDetalles();
    }
}
