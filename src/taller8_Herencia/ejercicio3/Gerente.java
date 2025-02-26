/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8_Herencia.ejercicio3;

/**
 *
 * @author Usuario
 */
public class Gerente extends Empleado {
    private String departamento;
    
    public Gerente(String nombre, int salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}
