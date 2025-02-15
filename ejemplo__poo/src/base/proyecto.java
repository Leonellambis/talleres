/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

import java.util.Date;
import java.util.List;


public class proyecto {
    //PROPIEDADES
  private String nombreclave;
 private String denominacion;
 private Date fechainicio;
 private Date fechafin;
  private String estado;
 private empresa empresa;
 private promotor empleadopromotor;
 private List<tarea> listadetareas;
 
 public proyecto(){
     
 }
 public proyecto(String nombreclave,String denominacion){
     this.nombreclave = nombreclave;
     this.denominacion = denominacion;
 }
}
