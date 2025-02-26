/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_7.ejercicio_2;

/**
 *
 * @author Usuario
 */
public class Vendedor extends Empleado {
    private double comision;
    
    public Vendedor(String nombre, double salario, double comision) {
        super(nombre, salario);
        this.comision = comision;
        
    }

    @Override
    public double calcularSalario() {
        return salario + comision;
    }
    @Override
    public String puesto() {
        return "Vendedor";
    }
}
