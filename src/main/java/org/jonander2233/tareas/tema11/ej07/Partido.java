package org.jonander2233.tareas.tema11.ej07;
enum Afluencia{
    BAJA_AFLUENCIA(0.75),MEDIA_AFLUENCIA(1),ALTA_AFLUENCIA(1.30);
    private final double porcentaje;
    private Afluencia(double porcentaje) {
            this.porcentaje = porcentaje;
    }
    public double getPorcentaje(){
        return porcentaje;
    }
}
public class Partido {
    private int id=0;
    private Afluencia afluencia;
    private String nombre;

    public Partido(Afluencia afluencia, String nombre) {
        id++;
        this.afluencia = afluencia;
        this.nombre = nombre;
    }
}
