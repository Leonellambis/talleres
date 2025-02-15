/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

import java.io.File;
import java.util.Date;


public class version {
    //PROPIEDADES
private Date fecha;
private String descripcion;
private File archivo;
private documento documento;

public version(){
     
 }
 public version(Date fecha, String d){
   this.fecha = fecha;
  descripcion = d ;
}
}
