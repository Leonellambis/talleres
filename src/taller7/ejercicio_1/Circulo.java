/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7.ejercicio_1;

import taller7.ejercicio_1.Figura;

/**
 *
 * @author Usuario
 */
public class Circulo extends Figura{
    private double radio;
    
    public Circulo(){
    }
    
    public Circulo(double radio){
        this.radio = radio;
    }
    @Override
    public double calcularArea(){
        double resultado = Math.PI * radio * radio;
        return resultado;
    }
}
