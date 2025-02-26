/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10.ejercicio1;

/**
 *
 * @author Usuario
 */
public class Principal  {
    public static void main (String[]args){
        
         Figura Rectangulo = new Rectangulo(9, 18) {};
         Figura triangulo = new Triangulo(7, 12) {};

        
        System.out.println("Area del rectangulo: " + Rectangulo.calcularArea());
        System.out.println("Area del triangulo: " + triangulo.calcularArea());
    }
}
    