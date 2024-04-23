package org.jonander2233.tareas.tema10.ej04;

import org.jonander2233.tareas.tema10.ej03.IPila;

import java.util.ArrayList;

public class Cola <T> implements ICola{
    private ArrayList array1;
    private int capacidad;

    public Cola(int capacidad) {
        array1 = new ArrayList<T>(capacidad);
        this.capacidad = capacidad;
    }

    @Override
    public boolean add(Object e) {
        if(array1.size() < capacidad){
            array1.add(e);
            return true;
        }else{
        return false;
        }
    }

    @Override
    public Object remove() {
        Object a = array1.remove(0);
        return a;
    }

    @Override
    public int size() {
        return this.capacidad;
    }

    @Override
    public Object peek() {
        return array1.get(0);
    }

    @Override
    public boolean isEmpty() {
        return array1.isEmpty();
    }

    @Override
    public String toString() {
        return "Cola: " + array1;
    }
}
