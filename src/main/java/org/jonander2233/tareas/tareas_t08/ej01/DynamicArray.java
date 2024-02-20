package org.jonander2233.tareas.tareas_t08.ej01;

public class DynamicArray {
    private double[] arrayDeDoubles;
    private int  nElementos;

    public DynamicArray(int tamano) {
        arrayDeDoubles = new double[tamano];
        nElementos = 0;
    }
    public boolean add (double value){
        if ( nElementos == arrayDeDoubles.length){
            arrayExpand();
            arrayDeDoubles[nElementos] = value;
            nElementos++;
        } else {
            arrayDeDoubles[nElementos] = value;
            nElementos++;
        }
        return true;
    }

    public boolean add (int index,double value) {

        return true;
    }
    private void arrayExpand (){
        double[] arrayExpandido = new double[arrayDeDoubles.length * 2];
        for (int i = 0; i < arrayDeDoubles.length; i++) {
            arrayExpandido[i] = arrayDeDoubles [i];
        }
        arrayDeDoubles = arrayExpandido;
    }
}
