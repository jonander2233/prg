package org.jonander2233.tareas.tema11.ej07;

import java.util.HashMap;

public class Evento {
    private static int count=0;
    private int id;
    private Estadio estadio;
    private Partido partido;
    public Evento(Estadio estadio, Partido partido){
        id = ++count;
        this.estadio = estadio;
        this.partido = partido;
    }

    public int getId() {
        return id;
    }

//    public EntradaNormal venderEntradaNormal(){
//        estadio.venderAsiento();
//        EntradaNormal entrada = new EntradaNormal(this,);
//        return entrada;
//    }

//    public EntradaVIP venderEntradaVIP(){
//        EntradaVIP entrada = new EntradaVIP();
//        return entrada;
//    }

}
