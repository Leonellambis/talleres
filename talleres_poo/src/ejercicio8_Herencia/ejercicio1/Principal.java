
package ejercicio8_Herencia.ejercicio1;

public class Principal {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Renault", 180);
        Coche coche = new Coche("Chevrolet", 200, 4);

        System.out.println("Informacion del Vehiculo:");
        vehiculo.mostrarInformacion();

        System.out.println("\nInformacion del Coche:");
        coche.mostrarInformacion();
    }
}
