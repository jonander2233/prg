package org.jonander2233.tareas.tema10.ej08;

import java.util.HashMap;
import java.util.Map;

public class Diccionario {
    private final Map<String,String> diccionario;

    public Diccionario() {
        this.diccionario = new HashMap<>();
    }
    public void addWord(String word,String definition){
        diccionario.put(word,definition);
    }
    public String getWord(String word){
        return diccionario.get(word);
    }
    public boolean existe(String word){
        boolean aaa = diccionario.containsKey(word);
        return aaa;
    }
    public void replace(String word,String definition){
        diccionario.replace(word,definition);
    }

    @Override
    public String toString() {
        return "Diccionario{" +
                "diccionario=" + diccionario +
                '}';
    }
}
