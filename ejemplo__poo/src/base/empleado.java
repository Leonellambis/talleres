/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;
import java.util.Date;
import java.util.List;

 // PROPIEDADES 
public class empleado {
   protected  String dni;
protected  String nombre;
protected  String apellido;
protected   String dirrecion;
protected   String telefono;
protected  String email;
protected  Date fechacontrato;
protected empresa empresa;
protected  List<proyecto> listadeproyectos;
protected  List<tarea> listadetareas;

 public empleado(){
     
 }
 public empleado(String nombre, String apellido){
     this.nombre = nombre;
     this.apellido = apellido;
 }
}

