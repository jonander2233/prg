package org.jonander2233.tareas.tema10.ej02;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ArrayListEstadisticas extends ArrayList<Double> implements IEstadisticas{
    private static final int DEFAULT_CAPACITY = 10;

    //Constructor:
    // Extiende la clase ArrayList e implementa la interfaz IEstadisticas
    public ArrayListEstadisticas() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayListEstadisticas(int capacity){
        super();
    }
    public ArrayListEstadisticas(Collection<Double> collection){
        super(collection);
    }

    /**
     * Devuelve el valor m�nimo de la lista.
     * @return el valor m�nimo de la lista
     */

    @Override
    public double minimo() {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < size(); i++) {
            double value = get(i);
            if (value > min){
                min = value;
            }
        }
        return min;
    }

    /**
     * Devuelve el valor m�ximo de la lista.
     * @return el valor m�ximo de la lista
     */

    @Override
    public double maximo() {
        double max = Double.MIN_VALUE;
        for (int i =0; i < size(); i++){
            double value = get(i);
            if (value > max){
                max = value;
            }
        }
        return max;
    }

    /**
     * Devuelve la suma de todos los valores de la lista
     * @return la suma de todos los valores de la lista
     */

    @Override
    public double sumatorio() {
        double sum = 0;
        for (int i = 0; i < size(); i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Devuelve el promedio de todos los valores de la lista
     * @return el promedio de todos los valores de la lista
     */

    @Override
    public double media() {
        return sumatorio() / size();
    }

    /**
     * Devuelve el valor m�s repetido de la lista
     * @return el valor m�s repetido de la lista
     */

    @Override
    public double moda() {
        double moda = get(0);
        int contador = 0;
        for(double i : this){
            int contador2 = 0;
            for (double j : this){
                if (i == j) {
                    contador2++;
                }
            }
        }
        return moda;
    }
    @Override
    public String toString(){
        String str = "[";
        for (double i : this){
            str += String.format("%.3f", i) + ", ";
        }
        str = str.substring(0, str.length() - 2);
        str += "]";
        return str;
    }
}


// si queremos aumentar la capacidad del array debemos poner el this