package org.jonander2233.lib_personal;

public class Pila {
    private String[] datos;
    private int tope;
    public Pila(int capacidadInicial){
        datos = new String[capacidadInicial];
        tope = -1;
    }
    public void push (String elemento){
        if(isFull()){
            ampliarArray();
        }
        datos[++tope] = elemento;
    }
    public String pop(){
        String resultado = null;
        if(!isEmpty()){
            resultado = datos[tope];
            datos[tope] = null;
            tope--;
        }
        return null;
    }
    private boolean isFull() {
        return tope == datos.length - 1;
    }
    public int size() {
        if(isEmpty()) {
            return 0;
        }
        return tope + 1;
    }

    public String top() {
        if(isEmpty()) {
            return "No hay elementos";
        }
        return datos[tope];
    }
    public boolean isEmpty() {
        return tope == -1;
    }

    private void ampliarArray() {
        String[] nuevoArray = new String[datos.length * 2];
        for(int i = 0; i < datos.length; i++) {
            nuevoArray[i] = datos[i];
        }
        datos = nuevoArray;
    }
}
