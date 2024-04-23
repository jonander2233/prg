package org.jonander2233.tareas.tema10.ej05;

import java.util.Date;

public class Paciente {
    private int autoincrement=0;
    private int id;
    private String nombre;
    private Date fechaNacimiento;
    private char sexo;
    private double alturaEnMetros;
    private double pesoEnKg;

    public Paciente(String nombre, Date fechaNacimiento, char sexo, double alturaEnMetros, double pesoEnKg) {
        this.id = ++autoincrement;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.alturaEnMetros = alturaEnMetros;
        this.pesoEnKg = pesoEnKg;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public double getAlturaEnMetros() {
        return alturaEnMetros;
    }

    public double getPesoEnKg() {
        return pesoEnKg;
    }

    @Override
    public String toString() {
        EstadisticasPaciente ep = new EstadisticasPaciente();
        int edad = ep.calcularEdad(this);
        return "" + edad;
    }
}
