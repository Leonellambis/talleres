
package taller8_Super.ejercicio3;


public class Estudiante extend Persona{
    public void mostrar(){
        
         System.out.println(super.edad); 
    }
}
 // Intento incorrecto de acceder a un atributo privado de la clase base por eso se muestra el error en el compilado