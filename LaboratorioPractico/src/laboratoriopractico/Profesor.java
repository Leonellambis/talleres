
package laboratoriopractico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Profesor {
    
    
    private String Identificacion;
    private String Nombre;
    private String Correo;
    private String NroTelefono;
    private String Departamento;
    private String Cargo;
    private LocalDate FechaInicio;
    private LocalDate FechaFinal;
    private LocalDate FechaDiseño;
    private List<Asignatura> Asignaturas;
    private List<Evaluacion> EvaluacionesDiseñadas;

    public Profesor(String identificacion, String nombre, String correo,
            String nroTelefono, String departamento, String cargo, LocalDate fechaInicio,
            LocalDate fechaFinal, LocalDate fechaDiseño, List<Asignatura> asignaturas,
            List<Evaluacion> evaluacionesDiseñadas) {
        this.Identificacion = identificacion;
        this.Nombre = nombre;
        this.Correo = correo;
        this.NroTelefono = nroTelefono;
        this.Departamento = departamento;
        this.Cargo = cargo;
        this.FechaInicio = fechaInicio;
        this.FechaFinal = fechaFinal;
        this.FechaDiseño = fechaDiseño;
        this.Asignaturas = new ArrayList<Asignatura>();
        this.EvaluacionesDiseñadas = new ArrayList<Evaluacion>();
    }

    public void Asignatura(Asignatura asignatura) {
        Asignaturas.add(asignatura);
    }

    public void EvaluacionesDiseño(Evaluacion evaluacionesDiseñadas) {
        EvaluacionesDiseñadas.add(evaluacionesDiseñadas);
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String identificacion) {
        Identificacion = identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getNroTelefono() {
        return NroTelefono;
    }

    public void setNroTelefono(String nroTelefono) {
        NroTelefono = nroTelefono;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        FechaFinal = fechaFinal;
    }

    public LocalDate getFechaDiseño() {
        return FechaDiseño;
    }

    public void setFechaDiseño(LocalDate fechaDiseño) {
        FechaDiseño = fechaDiseño;
    }

    public List<Asignatura> getAsignaturas() {
        return Asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        Asignaturas = asignaturas;
    }

    public List<Evaluacion> getEvaluacionesDiseñadas() {
        return EvaluacionesDiseñadas;
    }

    public void setEvaluacionesDiseñadas(List<Evaluacion> evaluacionesDiseñadas) {
        EvaluacionesDiseñadas = evaluacionesDiseñadas;
    }

    public void mostrarProfesor() {

        System.out.println("Identificacion: " + Identificacion);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Correo electronico: " + Correo);
        System.out.println("Numero de telefono: " + NroTelefono);
        System.out.println("Departamento: " + Departamento);
        System.out.println("Cargo: " + Cargo);
        System.out.println("Fecha de inicio de contrato: " + FechaInicio);
        System.out.println("Fecha de fin de contrato: " + FechaFinal);
        System.out.println("Fecha de diseño de la evaluacion: " + FechaDiseño);
        System.out.println("Asignatura(s) que dicta: ");
        for (Asignatura asignatura : Asignaturas) {
            System.out.println(" - ");
            asignatura.mostrarAsignatura();
        }
        System.out.println("Controles realizados: ");
        for (Evaluacion examen : EvaluacionesDiseñadas) {
            System.out.println(" - ");
            examen.mostrarInfoEvaluacion();
        }
    }
}


