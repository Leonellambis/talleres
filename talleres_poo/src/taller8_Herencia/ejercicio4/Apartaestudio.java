
package taller8_Herencia.ejercicio4;


public class Apartaestudio extends Vivienda, Apartamento{ //No se puede heredar multiples clases
    public void mostrarDetalles(){
        
        //intenta acceder a atributos privados
        System.out.print("Direccion: " + direccion);
    }
}
