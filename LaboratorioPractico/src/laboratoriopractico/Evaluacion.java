
package laboratoriopractico;

import java.time.LocalDate;


public class Evaluacion {
    
    private int ID;
    private String Tipo;
    private LocalDate Fecha;
    private Asignatura Asignatura;
    private Tema temas;

    public Evaluacion(int iD, String tipo, LocalDate fecha,
        Asignatura asignatura, Tema temas) {
        this.ID = iD;
        this.Tipo = tipo;
        this.Fecha = fecha;
        this.Asignatura = asignatura;
        this.temas = temas;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    public Asignatura getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        Asignatura = asignatura;
    }

    public Tema getTemas() {
        return temas;
    }

    public void setTemas(Tema tema) {
        temas = tema;
    }

   

    public void mostrarInfoEvaluacion() {
        System.out.println("Id de la evaluacion: " + ID);
        System.out.println("Tipo de examen: " + Tipo);
        System.out.println("Fecha de realizcion: " + Fecha);
        System.out.println("Asignatura: " + Asignatura.getNombre());
        System.out.println("Temas: " + temas.getNombreTema());
    }
}