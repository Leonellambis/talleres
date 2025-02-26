/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8_Herencia.ejercicio4;

/**
 *
 * @author Usuario
 */
public class Apartaestudio extends Vivienda, Apartamento{ //No se puede heredar multiples clases
    public void mostrarDetalles(){
        //intenta acceder a atributos privados
        System.out.print("Direccion: " + direccion);
    }
}
