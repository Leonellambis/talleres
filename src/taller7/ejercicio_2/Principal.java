/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_7.ejercicio_2;

/**
 *
 * @author Usuario
 */
public class Principal {
    
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Jesus", 50000, 15000);
        Empleado vendedor = new Vendedor("Jennifer", 12000, 10000);

        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}

