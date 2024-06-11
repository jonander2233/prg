package org.jonander2233.tareas.tema11.ej07;

public class Venta {
    private int nFYA; //numero de asientos y filas
    private int nZonas;
    private int nZonasVIP;
    Partido partido;
    Estadio estadio;

    public Venta(int nFYA, int nZonas, int nZonasVIP, Estadio estadio,Afluencia afluencia) {
        this.nFYA = nFYA;
        this.nZonas = nZonas;
        this.nZonasVIP = nZonasVIP;
        this.estadio = new Estadio(nZonas,nZonasVIP,nFYA);
    }

}
