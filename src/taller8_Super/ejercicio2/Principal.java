/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8_Super.ejercicio2;

/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args){
        Animal animal = new Animal("Mamifero");
        System.out.println("Detalles del animal: ");
        animal.mostrarEspecie();
        
        Pez pez = new Pez("Pez globo", "Agua salada");
        System.out.println("\nDetalles del pez: ");
        pez.mostrarEspecie();
    }
}
