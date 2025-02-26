
package taller7.ejercicio_1;

import taller7.ejercicio_1.Figura;

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
