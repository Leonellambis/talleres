
package talleres_9.ejercicio4;

public class Pez implements Nadador, Respirador {
   private String nombre;
    
   public Pez (String nombre){
       this.nombre = nombre;
       
   }

    @Override
    public void nadar() {
        System.out.println(nombre+ " esta nadando"); }

    @Override
    public void respirar() {
        System.out.println(nombre+ " esta respirando "); }

   
}
