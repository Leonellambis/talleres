
package laboratoriopractico;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
   

    private int NroMatricula;
    private String Nombre;
    private String GrupoAsisten;
    private List<Evaluacion> Evaluaciones;

    public Alumno(int NroMatricula, String Nombre, String GrupoAsisten, List<Evaluacion> Evaluaciones) {
        this.NroMatricula = NroMatricula;
        this.Nombre = Nombre;
        this.GrupoAsisten = GrupoAsisten;
        this.Evaluaciones = new ArrayList<Evaluacion>();

    }

    public void AddEvaluacion(Evaluacion examen) {
        Evaluaciones.add(examen);
    }

    public int getNroMatricula() {
        return NroMatricula;
    }

    public void setNroMatricula(int nroMatricula) {
        NroMatricula = nroMatricula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getGrupoAsisten() {
        return GrupoAsisten;
    }

    public void setGrupoAsisten(String grupoAsisten) {
        GrupoAsisten = grupoAsisten;
    }

    public List<Evaluacion> getEvaluaciones() {
        return Evaluaciones;
    }

    public void setEvaluaciones(List<Evaluacion> evaluaciones) {
        Evaluaciones = evaluaciones;
    }

    public void mostrarAlumno() {
        System.out.println("Numero de matricula: " + NroMatricula);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Grupo al que asiste: " + GrupoAsisten);
        System.out.println("Evaluaciones: ");
        if (Evaluaciones.isEmpty()) {
            System.out.println("No tiene evaluaciones registradas");
        } else {
            for (Evaluacion examenes : Evaluaciones) {
                System.out.println(" - ");
                examenes.mostrarInfoEvaluacion();
            }
        }
    }

}


