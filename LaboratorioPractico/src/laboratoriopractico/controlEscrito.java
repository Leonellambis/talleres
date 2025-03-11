
package laboratoriopractico;

import java.time.LocalDate;


    class ControlEscrito extends Evaluacion {
        
    private int NroControl;
    private int NroPreguntas;
    private float NotaObtenida;
    private float TeoricoConceptual;
    private float RedaccionOrtografia;

    public ControlEscrito(int iD, String tipo, LocalDate fecha, laboratoriopractico.Asignatura asignatura, Tema temas, int nroControl,
            int nroPreguntas, float notaObtenida, float teoricoConceptual, float redaccionOrtografia) {
        super(iD, tipo, fecha, asignatura, temas);
        this.NroControl = nroControl;
        this.NroPreguntas = nroPreguntas;
        this.NotaObtenida = notaObtenida;
        this.TeoricoConceptual = teoricoConceptual;
        this.RedaccionOrtografia = redaccionOrtografia;
    }

    public int getNroControl() {
        return NroControl;
    }

    public void setNroControl(int nroControl) {
        NroControl = nroControl;
    }

    public int getNroPreguntas() {
        return NroPreguntas;
    }

    public void setNroPreguntas(int nroPreguntas) {
        NroPreguntas = nroPreguntas;
    }

    public float getNotaObtenida() {
        return NotaObtenida;
    }

    public void setNotaObtenida(float notaObtenida) {
        NotaObtenida = notaObtenida;
    }

    public float getTeoricoConceptual() {
        return TeoricoConceptual;
    }

    public void setTeoricoConceptual(float teoricoConceptual) {
        TeoricoConceptual = teoricoConceptual;
    }

    public float getRedaccionOrtografia() {
        return RedaccionOrtografia;
    }

    public void setRedaccionOrtografia(float redaccionOrtografia) {
        RedaccionOrtografia = redaccionOrtografia;
    }

    public void mostrarEscrito() {
        super.mostrarInfoEvaluacion();
        System.out.println("Numero del control escrito: " + NroControl);
        System.out.println("Numero de preguntas: " + NroPreguntas);
        System.out.println("Nota Obtenida: " + NotaObtenida);
        System.out.println("Porcentaje teorico y conceptual: " + TeoricoConceptual);
        System.out.println("Porcentaje Redaccion y ortografia: " + RedaccionOrtografia);
    }
}



