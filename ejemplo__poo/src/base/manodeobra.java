/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

import java.util.Date;

public class manodeobra {
    // PROPIEDADES
  private empleado trabajador;
 private proyecto proyecto;
 private Date fechainicio;
 private Date fechafin;
 private String rol;  
 

  public manodeobra(){
     
 }
 public manodeobra(empleado e, proyecto p){
     trabajador = e;
     proyecto = p;
 }
}
