package org.jonander2233.tareas.tema11.ej07;

import java.util.ArrayList;

public class Fila {
    ArrayList<Asiento> asientos;
    private int id=0;

    public Fila(int nAsientos) {
        ++id;
        this.asientos = new ArrayList<Asiento>(nAsientos);
    }
}
