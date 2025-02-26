/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9.ejerciciosError2;

/**
 *
 * @author Usuario
 */
public class Casa implements Rueda {
    private String paredes;
         public Casa (String lado){
        this.paredes=paredes;
        
    }
       @Override
       public void girar(){
           System.out.println(paredes+ "esta girando");
       }    
}

// Las paredes no giran, por lo tanto 
// esta seria una implementacion de una interfaz sin sentido