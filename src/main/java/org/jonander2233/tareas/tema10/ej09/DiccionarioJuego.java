package org.jonander2233.tareas.tema10.ej09;

import java.util.*;

public class DiccionarioJuego {
    private final Map<String,String> diccionario;
    private Random random = new Random();
    public DiccionarioJuego() {
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
    public String randomWord(){
        int nRandom = randomPos();
//        ArrayList<String> valores = new ArrayList<>(diccionario.values());
//        valores.get(1);
        ArrayList<String> claves = new ArrayList<>(diccionario.keySet());
        return claves.get(nRandom);
    }

    private int randomPos(){
        int randomPos = random.nextInt(diccionario.size()+1);
        return randomPos;
    }
    public int size(){
        return diccionario.size();
    }
    @Override
    public String toString() {
        return "Diccionario{" +
                "diccionario=" + diccionario +
                '}';
    }
}
