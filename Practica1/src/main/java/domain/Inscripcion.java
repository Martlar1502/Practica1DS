package domain;

public class Inscripcion {
    //Atributos
    private Alumno alumno;
    private Materia materia;

    //Getters y setters
    public Alumno getAlumno() {
        return alumno;
    }
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    public Materia getMateria() {
        return materia;
    }
    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    //Metodos
    public Boolean aprobada()
    {
        return (this.alumno.getMateriasAprobadas().containsAll(this.materia.getCorrelativas()));
    }


}
