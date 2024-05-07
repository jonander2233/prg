package org.jonander2233.tareas.tema10.ej11;

import java.util.ArrayList;
import java.util.List;

public class Centro {
    private List<Alumno> alumnos;
    private List<Asignatura> asignaturas;
    private List<Aula> aulas;
    private List<Grupo> grupos;
    private List<Profesor> profesores;

    public Centro() {
        alumnos = new ArrayList<Alumno>();
        profesores = new ArrayList<Profesor>();
    }
    public boolean addProfesor(Profesor profesorNuevo){
        profesores.add(profesorNuevo);
        return true;
    }
    public boolean addAlumno(Alumno alumnoNuevo){
        alumnos.add(alumnoNuevo);
        return true;
    }
    public boolean hayGrupos(){
        if(grupos.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
    public boolean hayAsignaturas(){
        if(asignaturas.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
}
