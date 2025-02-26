
package talleres_9.ejerciciosError2;


public class casa implements Rueda {
    private String paredes;
         public casa (String lado){
        this.paredes=paredes;
        
    }
       @Override
       public void girar(){
           System.out.println(paredes+ "esta girando...");
       }
         
    }

// como podemos ver, las paredes no giran, por lo tanto 
// esta seria una implementacion de una interfaz sin sentido en esta clase