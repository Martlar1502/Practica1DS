package domain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;


public class CumpleCorrelativas {
    @Test
    public void cumpleCorrelativas() {
        Materia materia1 = new Materia("DDS");
        Materia materia2 = new Materia("ADS");
        Materia materia3 = new Materia("Paradigmas");
        Materia materia4 = new Materia("Algoritmos");
        materia1.agregarCorrelativas(materia2, materia3);
        materia3.agregarCorrelativas(materia4);
        Alumno alumno = new Alumno("Martin Larrart");
        alumno.aprobarMaterias(materia2, materia3, materia4);
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        inscripcion.setMateria(materia1);
        Assert.assertTrue(inscripcion.aprobada());
    }
    @Test
    public void nocumpleCorrelativas()
    {
        Materia materia1 = new Materia("DDS");
        Materia materia2 = new Materia("ADS");
        Materia materia3 = new Materia("Paradigmas");
        Materia materia4 = new Materia("Algoritmos");

        materia1.agregarCorrelativas(materia2, materia3);
        materia3.agregarCorrelativas(materia4);

        Alumno alumno = new Alumno("Martin Larrart");
        alumno.aprobarMaterias(materia3, materia4);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        inscripcion.setMateria(materia1);

        Assert.assertFalse(inscripcion.aprobada());

    }
}
