/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9.ejerciciosError;

/**
 *
 * @author Usuario
 */
public class Carro implements Atleta {
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void correr(){   
    System.out.println(modelo+ "esta corriendo aunque los carros no corren");
}
}

//  La interfaz no tiene nada que ver con la clase, un carro no puede correr
