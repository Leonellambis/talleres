/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8_Herencia.ejercicio3;

/**
 *
 * @author Usuario
 */
public class Empleado {
    protected String nombre;
    protected int salario;
    
    public Empleado(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
}
