/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9.ejercicio4;

/**
 *
 * @author Usuario
 */
public class Pez implements Nadador, Respirador {
   private String nombre;
    
   public Pez (String nombre){
       this.nombre = nombre;   
   }
    @Override
    public void nadar() {
        System.out.println(nombre+ " esta nadando"); 
    }
    @Override
    public void respirar() {
        System.out.println(nombre+ " esta respirando "); 
    }
}
