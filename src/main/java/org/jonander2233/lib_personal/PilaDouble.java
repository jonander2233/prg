package org.jonander2233.lib_personal;

public class PilaDouble {
    private Double[] datos;
    private int indice;

    public PilaDouble(int capacidadInicial) {
        datos = new Double[capacidadInicial];
        indice = -1;
    }

    public void push(Double elemento) {
        if(isFull()) {
            ampliarArray();
        }
        datos[++indice] = elemento;
    }

    public Double pop() {
        if(isEmpty()) {
            return null;
        }
        return datos[indice--];
    }

    private boolean isFull() {
        return indice == datos.length - 1;
    }

    public int size() {
        return indice + 1;
    }

    public Double top() {
        if(isEmpty()) {
            return null;
        }
        return datos[indice];
    }

    public boolean isEmpty() {
        return indice == -1;
    }

    private void ampliarArray() {
        Double[] nuevoArray = new Double[datos.length * 2];
        for(int i = 0; i < datos.length; i++) {
            nuevoArray[i] = datos[i];
        }
        datos = nuevoArray;
    }
}