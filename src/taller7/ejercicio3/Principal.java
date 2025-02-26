/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7.ejercicio3;

/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args) {
        
         Animal animal = new Animal("Aquiles"); 

        Perro perro = new Perro("Golden");
       
        System.out.println("Detalles del Perro:");
        perro.mostrarNombre();
        perro.hacerSonido();
    }
}
