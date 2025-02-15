/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;
 import java.util.List;

public class promotor extends empleado{
   
   private List<proyecto> listadeproyectos; 
   
    public promotor(){
       super(); //llama al constructor de empleados
   }
   public promotor(String n, String a){
       super(n,a); //llama al constructor de empleados
   }
}
