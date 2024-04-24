package org.jonander2233.tareas.tema10.ej07;

import java.util.HashMap;
import java.util.Map;

public class Conversor {
    private final Map<String,Double> diccionario;

    public Conversor() {
        this.diccionario = new HashMap<>();
    }
    public void addWord(String moneda,double precio){
        diccionario.put(moneda,precio);
    }
    public Double getWord(String w1){
        return diccionario.get(w1);
    }
    public boolean existe(String word){
        boolean aaa = diccionario.containsKey(word);
        return aaa;
    }
}
