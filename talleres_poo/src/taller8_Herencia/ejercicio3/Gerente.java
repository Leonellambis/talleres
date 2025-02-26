
package taller8_Herencia.ejercicio3;

public class Gerente extends Empleado {
    private String departamento;
    
    public Gerente(String nombre, int salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}
