
package laboratoriopractico;


public class Asignatura {
    
    
    private String Codigo;
    private String Nombre;
    private String Descripcion;
    private int Creditos;
    private int AñoAcademico;
    private int Semestre;
    private String Horario;

    public Asignatura(String codigo, String nombre, String descripcion, int creditos, int añoAcademico,
            int semestre, String horario) {
        this.Codigo = codigo;
        this.Nombre = nombre;
        this.Descripcion = descripcion;
        this.Creditos = creditos;
        this.AñoAcademico = añoAcademico;
        this.Semestre = semestre;
        this.Horario = horario;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getCreditos() {
        return Creditos;
    }

    public void setCreditos(int creditos) {
        Creditos = creditos;
    }

    public int getAñoAcademico() {
        return AñoAcademico;
    }

    public void setAñoAcademico(int añoAcademico) {
        AñoAcademico = añoAcademico;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int semestre) {
        Semestre = semestre;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public void mostrarAsignatura() {
        System.out.println("Codigo: " + Codigo);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Descripcion: " + Descripcion);
        System.out.println("Creditos: " + Creditos);
        System.out.println("Año academico:" + AñoAcademico);
        System.out.println("Semestre: " + Semestre);

    }
}

class Tema extends Asignatura {
    private int ID;
    private String NombreTema;
    private String DescripcionTema;
    private int NivelDificultad;

    public Tema(String codigo, String nombre, String descripcion, int creditos, int añoAcademico, int semestre,
            String horario, int iD, String nombreTema, String descripcionTema, int nivelDificultad) {
        
        super(codigo, nombre, descripcion, creditos, añoAcademico, semestre, horario);
        this.ID = iD;
        this.NombreTema = nombreTema;
        this.DescripcionTema = descripcionTema;
        this.NivelDificultad = nivelDificultad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getNombreTema() {
        return NombreTema;
    }

    public void setNombreTema(String nombreTema) {
        NombreTema = nombreTema;
    }

    public String getDescripcionTema() {
        return DescripcionTema;
    }

    public void setDescripcionTema(String descripcionTema) {
        DescripcionTema = descripcionTema;
    }

    public int getNivelDificultad() {
        return NivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        NivelDificultad = nivelDificultad;
    }

    public void mostrarTema() {
        System.out.println("Id de la asignatura: " + ID);
        System.out.println("Nombre: " + NombreTema);
        System.out.println("Descripcion: " + DescripcionTema);
        System.out.println("Nivel de dificultad: " + NivelDificultad);
    }

}

