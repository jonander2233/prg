package org.jonander2233.tareas.tema10.ej11;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private int id=0;
    private String nombre;
    private Grupo grupo;
    private List<Asignatura> asignaturas;

    public Alumno(String nombre) {
        ArrayList<Asignatura> asignaturas = new ArrayList<>();
        id++;
        this.nombre = nombre;

    }

    public boolean setGrupo(Grupo grupo){
        this.grupo = grupo;
        return true;
    }

    public boolean addAsignatura(Asignatura asignatura){
        if(asignaturas.contains(asignatura)){
            return false;
        }else{
            asignaturas.add(asignatura);
            return true;
        }
    }

    public int getId(){
        return this.id;
    }

}
