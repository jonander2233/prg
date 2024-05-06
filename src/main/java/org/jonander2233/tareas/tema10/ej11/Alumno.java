package org.jonander2233.tareas.tema10.ej11;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private int id=0;
    private String nombre;
    private Grupo grupo;
    private List<Asignatura> asignaturas;

    public Alumno( String nombre, Grupo grupo, List<Asignatura> asignaturas) {
        this.id = ++id;
        this.nombre = nombre;
        this.grupo = grupo;
        this.asignaturas = asignaturas;
    }

    public boolean setGrupo(){
        return true;
    }


}
