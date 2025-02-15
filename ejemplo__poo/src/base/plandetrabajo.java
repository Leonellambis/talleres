/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

import java.util.Date;

public class plandetrabajo {
    private tarea tarea;
private empleado trabajador;
private Date fechainicio;
private Date fechafin;
private String descripcion;

 public plandetrabajo(){
     
 }
 public plandetrabajo(tarea t, empleado p){
     tarea = t;
     trabajador = p;
 }
}
