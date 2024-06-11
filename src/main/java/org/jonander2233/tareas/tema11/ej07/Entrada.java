package org.jonander2233.tareas.tema11.ej07;

public abstract class Entrada {
    private static int count=0;
    private int id;
    private Evento evento;
    private int zona;
    private int fila;
    private int asiento;

    public Entrada(Evento evento, int zona, int fila, int asiento) {
        id = ++count;
        this.evento = evento;
        this.zona = zona;
        this.fila = fila;
        this.asiento = asiento;
    }
}
