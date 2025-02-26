/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8_Herencia.ejercicio1;

/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Renault", 180);
        Coche coche = new Coche("Chevrolet", 200, 4);

        System.out.println("Informacion del Vehiculo:");
        vehiculo.mostrarInformacion();

        System.out.println("\nInformacion del Coche:");
        coche.mostrarInformacion();
    }
}
