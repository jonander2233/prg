package org.jonander2233.tareas.tema11.ej07;

import java.util.HashMap;

public class Evento {
    HashMap<Estadio,Partido> eventos;
    private Estadio estadio;
    private Partido partido;
    public Evento(Estadio estadio, Partido partido){
        this.estadio = estadio;
        this.partido = partido;
        eventos.put(estadio,partido);
    }
//    public Evento (Estadio estadio){
//        return eventos.get(estadio);
//    }
}
