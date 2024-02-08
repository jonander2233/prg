package org.jonander2233.tareas.tareas_t07.ej06;
import java.util.HashSet;
import java.util.Set;
public class Bicicleta {
    private static int autoincrement = 0;
    private int referencia;
    private String marca;
    private String modelo;
    private String pesoKg;
    private String tamanoRuedasEnPulgadas;
    private boolean tieneMotor;
    private boolean nulo;
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

    public int getReferencia() {
        return referencia;
    }
    public void addExistencia(int cantidad){
        nExistencias += cantidad;
    }

    //    public Bicicleta1(){
//        this.referencia = ++autoincrement;
//        marca= "Scott";
//        modelo= "modeloCalle";
//        pesoKg= "17kg";
//        tamanoRuedasEnPulgadas="17";
//        tieneMotor= false;
//        fechaFabricacion = "3/2020";
//        precio= 500;
//        nExistencias=0;
//    }
}

