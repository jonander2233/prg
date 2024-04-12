package org.jonander2233.tareas.tema09.ej05;

public class Alumno {
    private String nombre;
    private int edad;
    private float altura;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                '}';
    }
}
