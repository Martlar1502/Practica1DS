package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombreAlum;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombreAlum) {
        this.nombreAlum = nombreAlum;
        this.materiasAprobadas = new ArrayList<>();
    }

    public String getNombreAlum() {
        return nombreAlum;
    }

    public void setNombreAlum(String nombreAlum) {
        this.nombreAlum = nombreAlum;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public void aprobarMaterias(Materia ... materiaAprobadas)
    {
        Collections.addAll(this.materiasAprobadas,materiaAprobadas);

    }

}
