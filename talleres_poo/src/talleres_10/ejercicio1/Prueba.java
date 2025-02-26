
package talleres_10.ejercicio1;

public class Prueba  {
    public static void main (String[]args){
        
         Figura Rectangulo = new Rectangulo(9, 18) {};
        Figura triangulo = new Triangulo(7, 12) {};

        
         System.out.println("Area del rectangulo: " + Rectangulo.calcularArea());
        System.out.println("Area del triangulo: " + triangulo.calcularArea());
    }
}
    