package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombreMat;
    private List<Materia> correlativas;

    public Materia(String nombreMat) {
        this.nombreMat = nombreMat;
        this.correlativas = new ArrayList<>();
    }



    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public String getNombreMat() {
        return nombreMat;
    }

    public void setNombreMat(String nombreMat) {
        this.nombreMat = nombreMat;
    }

    public void agregarCorrelativas(Materia ... materias)
    {
        Collections.addAll(this.correlativas, materias);
    }
}
