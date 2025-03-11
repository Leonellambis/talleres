
package laboratoriopractico;

import java.time.LocalDate;


    
    class Practica  extends Evaluacion {
    private boolean EsGrupal;
    private String Codigo;
    private String Titulo;
    private int NivelDificultad;
    private float Laboratorio;
    private float EficienciaTiempo;

    public Practica(int iD, String tipo, LocalDate fecha, Asignatura asignatura, Tema temas, boolean esGrupal, String codigo, String titulo, int nivelDificultad, int laboratorio, int eficienciaTiempo) {
        super(iD, tipo, fecha, asignatura, temas);
        this.EsGrupal = esGrupal;
        this.Codigo = codigo;
        this.Titulo = titulo;
        this.NivelDificultad = nivelDificultad;
        this.Laboratorio = laboratorio;
        this.EficienciaTiempo = eficienciaTiempo;
    }

    public boolean isEsGrupal() {
        return EsGrupal;
    }

    public void setEsGrupal(boolean esGrupal) {
        EsGrupal = esGrupal;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getNivelDificultad() {
        return NivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        NivelDificultad = nivelDificultad;
    }

    public float getLaboratorio() {
        return Laboratorio;
    }

    public void setLaboratorio(float laboratorio) {
        Laboratorio = laboratorio;
    }

    public float getEficienciaTiempo() {
        return EficienciaTiempo;
    }

    public void setEficienciaTiempo(float eficienciaTiempo) {
        EficienciaTiempo = eficienciaTiempo;
    }

    public void mostrarPractica() {
        super.mostrarInfoEvaluacion();
        System.out.println("Es trabajo grupal?" + (EsGrupal ? "Si" : "No"));
        System.out.println("Codigo de la practica: " + Codigo);
        System.out.println("Titulo de la practicas: " + Titulo);
        System.out.println("Nivel de dificultad: " + NivelDificultad);
        System.out.println("Porcentaje Laboratorio: " + Laboratorio);
        System.out.println("Porcentaje Eficiencia y Timepo: " + EficienciaTiempo);
    }
}


