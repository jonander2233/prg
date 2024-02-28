package org.jonander2233.tareas.tema07pilascolas;

public class Cola {
    private final DynamicArray data;

    public Cola(int initialCapacity){
        data = new DynamicArray(initialCapacity);
    }
    public int size(){
        return data.size();
    }
    public boolean add(double value){
       return data.add(value);
    }
    public boolean isEmpty(){
        return data.size() == 0;
    }
    public double remove() {
        if (isEmpty()){
            return Double.POSITIVE_INFINITY;
        }
        return data.remove(0);
    }
    public double peek(){
        if (isEmpty())
            return Double.POSITIVE_INFINITY;
        return data.get(0);
    }
}
