
package taller8_Super.ejercicio2;

public class Principal {
    public static void main(String[] args){
        Animal animal = new Animal("carnivoro");
        System.out.println("Detalles del animal: ");
        animal.mostrarEspecie();
        
        Pez pez = new Pez("tiburon", "Agua dulce");
        System.out.println("\nDetalles del pez: ");
        pez.mostrarEspecie();
    }
}
