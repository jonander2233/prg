package org.jonander2233.tareas.tareas_t07.ej07;
import java.util.Date;

public class Paciente {
    public enum Sexo{V,M,OTRO}

    private String sip;
    private String nombre;
    private Date fechaNacimiento;
    private Sexo sexo;
    public Paciente(String sip, String nombre, Date fechaNacimiento,Sexo sexo) {
        this.sip = sip;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }
}
