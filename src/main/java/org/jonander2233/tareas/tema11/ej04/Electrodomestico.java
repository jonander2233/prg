package org.jonander2233.tareas.tema11.ej04;

import java.awt.*;

enum Consumo{A,B,C,D,E,F}
enum Colores{BLANCO,NEGRO,ROJO,AZUL,GRIS}
public class Electrodomestico {
    private double PRECIO_BASE = 100;
    private Colores COLOR_POR_DEFECTO = Colores.BLANCO;
    private Consumo CONSUMO_POR_DEFECTO = Consumo.F;
    private double PESO_POR_DEFECTO = 5;

    protected double precio = PRECIO_BASE;
    protected Colores color = COLOR_POR_DEFECTO;
    protected Consumo consumo = CONSUMO_POR_DEFECTO;
    protected double peso = PESO_POR_DEFECTO;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, double peso) {
        this.precio = precio;
        this.peso = peso;
    }

    public Electrodomestico(double precio, Colores color, Consumo consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public Colores getColor() {
        return color;
    }

    public Consumo getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }
    public void comprobarConsumoEnergetico (char letra){

    }
    public void comprobarColor (String color){

    }
}
