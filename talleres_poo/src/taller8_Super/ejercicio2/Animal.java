
package taller8_Super.ejercicio2;


public class Animal{
    protected String especie;
    
    public Animal(String especie){
        this.especie = especie;
    }
    
    public void mostrarEspecie(){
        System.out.println("Especie: " + especie);
    }
}
