
package laboratoriopractico;

import java.time.LocalDate;


public class Prueba {

    public static void main(String[] args) {
      
   
        
        Asignatura asignatura1 = new Asignatura("010", "fisica mecanica",
                "La física mecánica es la rama de la física que estudia el movimiento y el equilibrio de los cuerpos. ",
                7, 2025, 3, "AM - 6:00 - 8:30 ");
        Asignatura asignatura2 = new Asignatura("342", "filosofia",
                "La filosofía es una rama del conocimiento que estudia la realidad, el ser humano y el conocimiento que se crea.",
                8, 2025, 2, "AM - 10:30 - 12:30");
        Tema tema1 = new Tema("010", "Calculo diferencial",
                "La física mecánica es la rama de la física que estudia el movimiento y el equilibrio de los cuerpos.",
                7, 2025, 3, "AM - 6:00 - 8:30 ",
                133, "MRU", "Se trata de un movimiento en el que un objeto se desplaza en línea recta, a una velocidad constante y sin aceleración. .", 3);
        Tema tema2 = new Tema("342", "Fisiologia",
                "La filosofía es una rama del conocimiento que estudia la realidad, el ser humano y el conocimiento que se crea.",
                8, 2025, 2, "AM - 11:10 - 12:45", 2229, "pitagoras",
                "pitágoras fue un filósofo y matemático griego que vivió entre los siglos VI y V a.C. Sus aportes a la filosofía y las matemáticas influyeron en pensadores posteriores como Aristóteles y Platón. ",
                2);
        /////////////////////////////////////
Evaluacion evaluacion1 = new Evaluacion(1166, "Practica",
                LocalDate.of(2025, 3, 11), asignatura1, tema1);
        Evaluacion evaluacion2 = new Evaluacion(3339, "Control escrito",
                LocalDate.of(2025, 7, 20), asignatura2, tema2);
        ////////////////////////////////////////////
Practica practica1 = new Practica(123, "Practica", LocalDate.of(2025, 3, 11),
                asignatura1, tema1, false, "003", "Practico filosofia de pitagoras", 3, 70, 30);
        //////////////////////////////////////////////////////
ControlEscrito control1 = new ControlEscrito(2244, "Control escrito", LocalDate.of(2025, 5, 20),
                asignatura1, tema1, 113, 10, 4, 80, 20);
        /////////////////////////
Alumno alumno1 = new Alumno(10455663, "leonel lambis", "3B", null);
        alumno1.AddEvaluacion(evaluacion1);
        /////////////////////////
Profesor profe1 = new Profesor("1156983467", "esteban alvarez", "estebanal12@colfest.edu.co", "3214576342", "filosofia", "Docente filosofia",
                LocalDate.of(2025, 1, 10), LocalDate.of(2026, 1, 10),
                LocalDate.of(2025, 3, 12), null, null);
        profe1.Asignatura(asignatura1);
        profe1.EvaluacionesDiseño(evaluacion1);
        Profesor profe2 = new Profesor("11892074", "juan jimenez", "juan2528@colfest.edu.co", "3145672980", " filosofi", "Docente de fisica mecanica",
                LocalDate.of(2025, 1, 8), LocalDate.of(2026, 1, 6),
                LocalDate.of(2025, 8, 15), null, null);
        profe2.Asignatura(asignatura2);
        profe2.EvaluacionesDiseño(evaluacion2);

        System.out.println("Alumno: ");
        alumno1.mostrarAlumno();
        System.out.println("\nProfesores: ");
        profe1.mostrarProfesor();
        System.out.println("\n");
        profe2.mostrarProfesor();
        System.out.println("\nAsignatura: ");
        asignatura1.mostrarAsignatura();
        System.out.println("\tTemas de la asignatura: ");
        tema1.mostrarTema();
        System.out.println("\n");
        System.out.println("\nAsignatura: ");
        asignatura2.mostrarAsignatura();
        System.out.println("\tTemas de la asignatura: ");
        tema2.mostrarTema();
        System.out.println("\nControles: ");
        practica1.mostrarPractica();
        System.out.println("\n");
        control1.mostrarEscrito();

        }
}


