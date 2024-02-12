package org.jonander2233.tareas.tareas_t07.ej06;

public class Bicicleta {
    private static int autoincrement = 0;
    private int referencia;
    private String marca;
    private String modelo;
    private String pesoKg;
    private String tamanoRuedasEnPulgadas;
    private boolean tieneMotor;
    private String fechaFabricacion;
    private double precio;
    private int nExistencias;

    public Bicicleta(String marca, String modelo, String pesoKg, String tamanoRuedasEnPulgadas,
                     boolean tieneMotor, String fechaFabricacion, double precio, int nExistencias) {
        this.referencia = ++autoincrement;
        this.marca = marca;
        this.modelo = modelo;
        this.pesoKg = pesoKg;
        this.tamanoRuedasEnPulgadas = tamanoRuedasEnPulgadas;
        this.tieneMotor = tieneMotor;
        this.fechaFabricacion = fechaFabricacion;
        this.precio = precio;
        this.nExistencias=nExistencias;
    }

    public int getNExistencias() {
        return nExistencias;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getReferencia() {
        return referencia;
    }
    public void addExistencia(int cantidad){
        nExistencias += cantidad;
    }
    public boolean consultarExistencia(int cantidad){
        if (cantidad > nExistencias){
            return false;
        }
        return true;
    }
    public void subtractExistencia(int cantidad){
        nExistencias = nExistencias - cantidad;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "referencia=" + referencia +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pesoKg='" + pesoKg + '\'' +
                ", tamanoRuedasEnPulgadas='" + tamanoRuedasEnPulgadas + '\'' +
                ", tieneMotor=" + tieneMotor +
                ", fechaFabricacion='" + fechaFabricacion + '\'' +
                ", precio=" + precio +
                ", nExistencias=" + nExistencias +
                '}';
    }
    public String existenciasToString() {
        return "Bicicleta "+ marca + " " + modelo + " hay "+ nExistencias +" unidades.";
    }
}

