/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9.ejercicio2;

/**
 *
 * @author Usuario
 */
public class Animal implements Volador, Nadador{
 
    private String nombre;
    public Animal(String nombre) {
        this.nombre=nombre;
       
    }
    @Override
    public void volar() {
        System.out.println (nombre+ " esta volando"); 
    }
    @Override
    public void nadar() {
        System.out.println (nombre+ " esta nadando"); 
    }
}
