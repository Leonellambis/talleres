
package taller7.ejercicio3;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(" El perro ladra.");
    }

    @Override
    public void mostrarNombre() {
        super.mostrarNombre();
        System.out.println(" Este es un perro.");
    }
}
