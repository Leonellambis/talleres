
package talleres_9.ejercicio2;


public class Animal implements Volador, Nadador{
 
    private String nombre;
    public Animal(String nombre) {
        this.nombre=nombre;
       
    }

    @Override
    public void volar() {
        System.out.println (nombre+ " esta volando"); }

    @Override
    public void nadar() {
        System.out.println (nombre+ " esta nadando"); }
    
}
