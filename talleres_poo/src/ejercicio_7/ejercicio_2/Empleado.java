
package ejercicio_7.ejercicio_2;


public abstract class Empleado {
    protected String nombre;
    protected double salario;
    
    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public abstract double calcularSalario();
    public abstract String puesto();
    
    public void mostrarDetalles(){
        double salario = calcularSalario();
        System.out.println("Puesto: " + puesto() );
        System.out.println("Nombre : " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println();
        
    }
}
 
