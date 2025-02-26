/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7.ejercicio_1;

/**
 *
 * @author Usuario
 */
public class Rectangulo extends Figura{
    private double ancho;
    private double alto;
    
    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }
    @Override
    public  double calcularArea(){
        double resultado = ancho*alto;
        return resultado;
    }
}
