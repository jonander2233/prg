package org.jonander2233.tareas.tema10.ej11;

public class Asignatura {
    private String id;
    private String nombre;
    private Profesor profesor;

    public Asignatura(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
