package org.jonander2233.tareas.tema07pilascolas;

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
        if (index > arrayDeDoubles.length)

        if ( nElementos == arrayDeDoubles.length) {
            arrayExpand();
            nElementos++;
            for (int i = nElementos; i > index; i--) {
                arrayDeDoubles[i] = arrayDeDoubles [i+1];
            }
            arrayDeDoubles[index] = value;
        }else{
            nElementos++;
            for (int i = nElementos; i > index; i--) {
                arrayDeDoubles[i] = arrayDeDoubles [i+1];
            }
            arrayDeDoubles[index] = value;
        }
        return true;
    }
    public double remove (double value){
        int index;
        for (int i = 0; i < arrayDeDoubles.length; i++) {
            if(value == arrayDeDoubles [i]){
                index = i;
                for (int j = index; j < arrayDeDoubles.length; j++) {
                    arrayDeDoubles[j] = arrayDeDoubles [j+1];
                }
                nElementos--;
                return 1;
            }
        }
        return -1;
    }
    public double remove (int index){
        if (index > arrayDeDoubles.length)
            return -1;

        double nEliminado = arrayDeDoubles[index];
        for (int i = index; i < arrayDeDoubles.length; i++) {
            arrayDeDoubles[i] = arrayDeDoubles [i+1];
        }
        nElementos--;
        return nEliminado;
    }

    public double get (int index){
        double num = arrayDeDoubles[index];
        return num;
    }

    public boolean set (int index, double value){
        arrayDeDoubles[index] = value;
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
