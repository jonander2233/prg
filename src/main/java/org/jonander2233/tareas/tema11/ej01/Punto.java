package org.jonander2233.tareas.tema11.ej01;

public class Punto {
    private double posX;
    private double posY;

    public Punto(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public Punto() {
        posX = 0;
        posY = 0;
    }

    public double distancia (Punto punto){
        double deltaX = posX - punto.posX;
        double deltaY = posY - punto.posY;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    public void moverPunto(double x, double y){
        posX = posX + x;
        posY = posY + y;
    }
    @Override
    public String toString() {
        return "(" + posX + "," + posY + ')';
    }
}
