/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

import java.util.List;

public class empresa {
    // PROPIEDADES
   private String nit;
 private String nombre;
 private String telefono;
 private String email;
 private String tipo;
 private String web;
 private String dirrecion;
private List<empleado> listadeempleados;
private List<proyecto> listadeproyectos; 

public empresa(){
     
 }
 public empresa(String nit, String nombre){
     this.nit = nit;
     this.nombre = nombre;
 }
}
