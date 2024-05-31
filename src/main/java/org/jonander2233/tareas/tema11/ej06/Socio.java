package org.jonander2233.tareas.tema11.ej06;

import java.time.LocalDate;
import java.util.Date;

public class Socio {
    private String nif;
    private String nombre;
    private LocalDate fechaNac;
    private String poblacion;

    public Socio(String nif, String nombre, LocalDate fechaNac, String poblacion) {
        this.nif = nif;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.poblacion = poblacion;
    }

}
