/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;
import java.util.List;

public class documento {
    // PROPIEDADES
private String codigo;
private String descripcion;
private String tipo;
private tarea tarea;
private List<version> listadeversiones;

 public documento(){
     
 }
  public documento(String codigo, String desc){
      this.codigo =codigo;
      this.descripcion =desc;
 }
}
