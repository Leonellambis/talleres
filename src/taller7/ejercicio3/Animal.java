/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7.ejercicio3;

/**
 *
 * @author Usuario
 */
public abstract class Animal {
    protected String nombre;
    
    public Animal(String nombre){
        this.nombre = nombre;
    }
    
    public abstract void hacerSonido();
    
    public void mostrarNombre(){
        System.out.print("Nombre: " + nombre);
    }
}
