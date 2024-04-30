package org.jonander2233.tareas.tema10.tarea01;

import java.util.Iterator;
import java.util.Random;

public class RandomSeries implements Iterator<Double>,Iterable<Double>{
    private Random random = new Random();
    private double min;
    private double max;

    public RandomSeries() {
        this(0,1);
    }

    public RandomSeries(Long seed, double min, double max) {
        this.min = min;
        this.max = max;
    }

    public RandomSeries(double min, double max){
        this(Long.MIN_VALUE, min , max);
    }
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Double next() {
        random.nextDouble(min,max);
        return null;
    }

    @Override
    public Iterator<Double> iterator() {
        return this;
    }
}
