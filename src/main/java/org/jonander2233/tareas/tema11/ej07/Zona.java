package org.jonander2233.tareas.tema11.ej07;

import java.util.ArrayList;
enum Categoria{NORMAL,VIP}
public class Zona {
    private ArrayList<Fila> filas;
    private Categoria categoria;
    private int id;
    private int idVIP;
    private static int contador=0;
    private static int contadorVIP=0;


    public Zona(int nFYA,Categoria categoria) {
        filas = new ArrayList<>(nFYA);
        if(categoria == Categoria.NORMAL){
            this.id = ++contador;
        }else {
            this.idVIP = ++contadorVIP;
        }
        this.categoria = categoria;
        for (int i = 1; i <= nFYA; i++) {
            Fila fila = new Fila(nFYA);
            if(Test.codigoTest)
                System.out.printf("%screada fila " + i + " id: " + fila.getId() + "%s\n", Colorinchis.YELLOW, Colorinchis.RESET);
            filas.add(fila);
        }
    }
    public void verAsientos(){
        for (int i = 0; i < filas.size(); i++) {
            System.out.printf("%sfila " + (i+1) + " id: " + filas.get(i).getId() + "%s\n", Colorinchis.YELLOW, Colorinchis.RESET);
            filas.get(i).verAsientos();
        }
    }

    public int getId() {
        if(this.categoria == Categoria.NORMAL){
            return id;
        }
        return idVIP;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
