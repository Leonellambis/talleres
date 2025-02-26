
package talleres_9.ejerciciosError;


public class Carro implements Atleta {
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void correr(){   
    System.out.println(modelo+ "esta corriendo..... aunque los carros no corren");
}
}

//  esto es una mala practica ya que la interfaz no tiene nada que ver con la clase
//  ya que como sabemos un carro no puede correr, por lo que decimos que la clase
//  esta implementando una interfaz sin sentido coherente 
