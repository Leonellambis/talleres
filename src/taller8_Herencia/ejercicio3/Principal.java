/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8_Herencia.ejercicio3;

/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args){
        Empleado empleado = new Empleado ("Camila Perez", 273000);
        System.out.println("Detalles de empleado:");
        empleado.mostrarDetalles();
        
        Gerente gerente = new Gerente ("Diego Caraballo", 400000, "Salud");
        System.out.println("\nDetalles del Gerente:");
        gerente.mostrarDetalles();
    }
}
