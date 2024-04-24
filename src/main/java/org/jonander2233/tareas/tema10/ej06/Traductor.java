package org.jonander2233.tareas.tema10.ej06;

import java.util.HashMap;
import java.util.Map;

public class Traductor {
    private final Map<String,String> diccionario;

    public Traductor() {
        this.diccionario = new HashMap<>();
    }
    public void addWord(String w1,String w2){
        diccionario.put(w1,w2);
    }
    public String getWord(String w1){
        return diccionario.get(w1);
    }
    public boolean existe(String word){
        boolean aaa = diccionario.containsKey(word);
        return aaa;
    }
}
