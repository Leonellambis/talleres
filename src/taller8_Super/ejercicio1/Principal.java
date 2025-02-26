/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8_Super.ejercicio1;

/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args){
        Persona persona = new Persona("Sofia Martinez", 25);
        System.out.println("Detalles de la persona: ");
        persona.mostrarDetalles();
        
        Empleado empleado = new Empleado("Leonel Lmabis", 30, "Finanzas");
        System.out.println("\nDetalles del empleado: ");
        empleado.mostrarDetalles();
    }
}
