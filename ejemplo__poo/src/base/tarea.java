/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

import java.util.Date;
import java.util.List;

public class tarea {
    private String descripcion;
private String tipo;
private Date fechaInicioEstimado;
private Date fechaInicioReal;
private int duracionEstimada;
private int duracionReal;
private List<empleado> listadedoempleados;
private proyecto proyecto;
private List<documento> listadedocumentos;

public tarea(){
     
 }
 public tarea(String d, String t){
     descripcion = d;
     tipo = t;
 }
}
