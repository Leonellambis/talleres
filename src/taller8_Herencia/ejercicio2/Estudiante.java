/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8_Herencia.ejercicio2;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona{
    protected int matricula;
    
    public Estudiante(String nombre, int edad, int matricula){
        super(nombre,edad);
        this.matricula = matricula;
    }
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Matricula: " + matricula);
    }
}
