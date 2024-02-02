package org.jonander2233.tareas.tareas_t07.ej04;

public class Punto {
    private double x;
    private double y;

    public Punto() {
        y = 0;
        x = 0;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distancia (Punto posicion){
        double diferenciaX = posicion.getX() - this.x;
        double diferenciaY = posicion.getY() - this.y;

        return Math.sqrt(diferenciaX * diferenciaX + diferenciaY * diferenciaY);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
