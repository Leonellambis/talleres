/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8_Herencia.ejercicio2;

/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main (String[] args){
        Estudiante estudiante = new Estudiante("Valentina Diaz", 18 , 241018007);
        
        System.out.println("Detalles del estudiante: ");
        estudiante.mostrarDetalles();
    }
}
