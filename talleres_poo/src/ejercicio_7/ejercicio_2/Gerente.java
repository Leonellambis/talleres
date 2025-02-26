
package ejercicio_7.ejercicio_2;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salario + bono;
    }
    @Override
    public String puesto() {
        return "Gerente";
    }
}