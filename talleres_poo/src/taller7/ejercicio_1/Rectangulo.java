
package taller7.ejercicio_1;

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
