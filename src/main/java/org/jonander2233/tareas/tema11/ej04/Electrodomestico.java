package org.jonander2233.tareas.tema11.ej04;

import java.awt.*;
import java.util.Locale;

enum Consumo{
    A('A'),B('B'),C('C'),D('D'),E('E'),F('F');
    private final char letra;
    Consumo(char letra){
        this.letra = letra;
    }
    public char getLetra(){
        return letra;
    }
}


enum Colores{BLANCO,NEGRO,ROJO,AZUL,GRIS}


public class Electrodomestico {
    private static final double PRECIO_BASE = 100;
    private static final Colores COLOR_POR_DEFECTO = Colores.BLANCO;
    private static final Consumo CONSUMO_POR_DEFECTO = Consumo.F;
    private static final double PESO_POR_DEFECTO = 5;

    protected double precio;
    protected Colores color;
    protected Consumo consumo;
    protected double peso;

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        String consString = String.valueOf(consumo);
        consString = consString.toUpperCase();

        this.peso = peso;
        comprobarConsumoEnergetico(consumo);
        comprobarColor(color);

    }

    public Electrodomestico() {
//        this(PRECIO_BASE,COLOR_POR_DEFECTO,CONSUMO_POR_DEFECTO,PESO_POR_DEFECTO);
    }

    public Electrodomestico(double precio, double peso) {
        this.precio = precio;
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
