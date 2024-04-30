package org.jonander2233.tareas.tema10.ej10;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Empleado {
    ArrayList<Hijo> hijos;
    private String dni;
    private String nombre;
    private String apellidos;
    private Date fechaNac;
    private double sueldo;

    public Empleado(String dni, String nombre, String apellidos, Date fechaNac, double sueldo) {
        hijos = new ArrayList<>();
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.sueldo = sueldo;
    }

    public ArrayList<Hijo> getHijos() {
        return hijos;
    }
    public Hijo buscarHijo(String nombre){
        for (int i = 0; i < hijos.size(); i++) {
            if(hijos.get(i).getNombre() == nombre){
                return hijos.get(i);
            }
        }
        return null;
    }
    public boolean borrarHijo(Hijo hijo){
        boolean borrado = hijos.remove(hijo);
        return borrado;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public double getSueldo() {
        return sueldo;
    }

    public int cantidadHijos(){
        return hijos.size();
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void addHijo(String nombre,Date fechaNac){
        hijos.add(new Hijo(nombre,fechaNac));
    }
}
