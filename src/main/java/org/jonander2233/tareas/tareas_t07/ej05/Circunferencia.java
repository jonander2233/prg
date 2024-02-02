package org.jonander2233.tareas.tareas_t07.ej05;
import org.jonander2233.tareas.tareas_t07.ej04.*;
public class Circunferencia {
    private Punto centro = new Punto();
    private double radio;
    private double x;
    private double y;
//----------------Constructores----------------------------------------------------------------------
    public Circunferencia(double x,double y, double radio){
        centro.setX(x);
        centro.setY(y);
        this.radio = radio;
    }

    public Circunferencia() {
        radio=5;
    }

    public Circunferencia(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }
//----------------Metodos-----------------------------------------------------------------------------
    public double perimetro(){
        return 2 * Math.PI * radio;
    }
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double distancia (Punto posicion){
        double diferenciaX = posicion.getX() - centro.getX();
        double diferenciaY = posicion.getY() - centro.getY();

        return Math.sqrt(diferenciaX * diferenciaX + diferenciaY * diferenciaY);
    }

//----------------------------Getters & Setters--------------------------------------------------------------
    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
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

    @Override
    public String toString() {
        if(centro.getX()=0 && centro.getY()=0){

        }
        return "Circunferencia de radio: "+radio+" cm situada";
    }
}
