package org.jonander2233.tareas.tareas_t08.ej01;

public class DynamicArray {
    private double[] arrayDeDoubles;
    private int  nElementos;

    public DynamicArray(int tamano) {
        arrayDeDoubles = new double[tamano];
        nElementos = 0;
    }
    public boolean add (double value){
        if(nElementos < arrayDeDoubles.length){
            arrayDeDoubles[nElementos] = value;
            nElementos++;
        } else if ( nElementos == arrayDeDoubles.length){
            double[] arrayExpandido = new double[arrayDeDoubles.length * 2];
            for (int i = 0; i < arrayDeDoubles.length; i++) {
                arrayExpandido[i] = arrayDeDoubles [i];
            }

            arrayDeDoubles = arrayExpandido;
            arrayDeDoubles[nElementos] = value;
            nElementos++;
        }
        return true;
    }
//    public

}
