
package talleres_10.ejercicio2;

public class Pato implements Volador,Nadador {
   private String nombre;

    public Pato(String nombre) {
        this.nombre = nombre;
    }
   
    @Override
    public void volar(){
        System.out.println(nombre+ " esta volando");
    }
 @Override
 public void nadar (){
     System.out.println(nombre+ " esta nadando");
 }
}
