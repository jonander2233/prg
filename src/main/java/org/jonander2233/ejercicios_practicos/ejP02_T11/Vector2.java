package org.jonander2233.ejercicios_practicos.ejP02_T11;

public class Vector2 {
    private double posX;
    private double posY;

    public Vector2(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public Vector2() {
        posX = 0;
        posY = 0;
    }

    public double distancia (Vector2 punto){
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
