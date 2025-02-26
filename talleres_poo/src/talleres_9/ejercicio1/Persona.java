
package talleres_9.ejercicio1;

class Persona implements Hablador, Trabajador{

    
    private String nombre;

    public Persona (String nombre) {
        this.nombre = nombre;
    }
    
    
    
    @Override
    public void hablar() {
        System.out.println( nombre+ " esta hablando.");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre+ " esta trabajando.");
    }
}

    

