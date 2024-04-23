package org.jonander2233.tareas.tema10.ej03;

import java.util.ArrayList;

public class Pila<T> implements IPila {

    private ArrayList array1;
    private int tope;

    public Pila(int capacidadInicial) {
       array1 = new ArrayList<T>(capacidadInicial);
       tope = -1;
    }

    @Override

    public Object push(Object e) {
        array1.add(e);
        tope++;
        return e;
    }

    @Override
    public Object pop() {
        int pos = array1.size() - 1;
        Object a = array1.remove(pos);
        return a;
    }

    @Override
    public int size() {

        return array1.size();
    }

    @Override
    public Object top() {
        return array1.get(array1.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return array1.isEmpty();
    }

    @Override
    public String toString() {
        return "Pila"+ array1;
    }
}
