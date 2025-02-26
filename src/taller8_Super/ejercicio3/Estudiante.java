/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8_Super.ejercicio3;

/**
 *
 * @author Usuario
 */
public class Estudiante extend Persona{
    public void mostrar(){
        // Intento incorrecto de acceder a un atributo privado de la clase base
         System.out.println(super.edad); 
    }
}
