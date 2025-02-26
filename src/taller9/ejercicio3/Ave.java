/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9.ejercicio3;

/**
 *
 * @author Usuario
 */
public class Ave implements Volador, Cantante {
   private String nombre;

    public Ave(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void volar() {
        System.out.println( nombre+ " esta volando");
    }
    @Override
    public void cantar() {
       System.out.println (nombre+ " esta cantando"); 
    }
}
    

