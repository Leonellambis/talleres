
package talleres_9.ejerciciosError2;

public class errorCompilacion implements Rueda{
    private String error ;

    public errorCompilacion(String error) {
        this.error = error;
    }
  
}

// La solucion al error de compilacion es la siguiente:

//public class errorCompilacion implements Rueda{
   // private String error ;

   // public errorCompilacion(String error) {
     //   this.error = error;
   // }
    
    //@Override
    //public void girar (){
     //   System.out.println(error+ "no gira");
   // }
//}