package org.jonander2233.tareas.tema11.ej07;

import java.util.HashMap;

public class Evento {
    HashMap<Estadio,Partido> eventos;
    private Estadio estadio;
    private Partido partido;
    public void crear(Estadio estadio, Partido partido){
        this.estadio = estadio;
        this.partido = partido;
    }
    public int getZona(){
//        return estadio.getZona;
        return 1;
    }
    public void getFila(){

    }
    public void getAsiento(){

    }
}
