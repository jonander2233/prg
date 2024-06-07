package org.jonander2233.tareas.tema11.ej07;

import java.util.ArrayList;
enum Categoria{NORMAL,VIP}
public class Zona {
    private ArrayList<Fila> filas;
    private Categoria categoria;
    private int id=0;


    public Zona(int nFYA,Categoria categoria) {
        filas = new ArrayList<>(nFYA);
        ++id;
        this.categoria = categoria;
        for (int i = 0; i < nFYA; i++) {
            Fila fila = new Fila(nFYA);
            filas.add(fila);
        }
    }
}
