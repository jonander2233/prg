package org.jonander2233.tareas.tema10.ej07;

import java.util.HashMap;
import java.util.Map;

public class Conversor {
    private final Map<String,Double> conversor;

    public Conversor() {
        this.conversor = new HashMap<>();
    }
    public void addCoin(String coin,double price){
        conversor.put(coin,price);
    }
    public Double getCoin(String coin){
        return conversor.get(coin);
    }
    public boolean exists(String coin){
        boolean aaa = conversor.containsKey(coin);
        return aaa;
    }
}
