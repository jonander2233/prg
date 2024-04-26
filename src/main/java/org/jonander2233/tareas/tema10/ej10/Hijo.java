package org.jonander2233.tareas.tema10.ej10;

import java.util.Date;

public class Hijo {
    private String nombre;
    private Date fechaNac;

    public Hijo(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }
}
