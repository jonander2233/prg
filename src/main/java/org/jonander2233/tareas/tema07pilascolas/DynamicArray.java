package org.jonander2233.tareas.tema07pilascolas;

public class DynamicArray {
    private double[] arrayDeDoubles;
    private int  nElementos;

    public DynamicArray(int tamano) {
        arrayDeDoubles = new double[tamano];
        nElementos = 0;
    }

    public int size(){
        return nElementos;
    }

    public boolean add (double value){
        if ( isFull()){
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
        if (index > nElementos)
            return false;
        if (isFull()) {
            arrayExpand();
            moverDerecha(index);
            arrayDeDoubles[index] = value;
        }else{
            moverDerecha(index);
            arrayDeDoubles[index] = value;
        }
        return true;
    }



    public double remove (double value){
        int index;
        for (int i = 0; i < nElementos; i++) {
            if(value == arrayDeDoubles [i]){
                index = i;
                moverIzquierda(index);
                return arrayDeDoubles[i];
            }
        }
        return Double.POSITIVE_INFINITY;
    }
    public double remove (int index){
        if (index > nElementos)
            return Double.POSITIVE_INFINITY;

        double nEliminado = arrayDeDoubles[index];
        moverIzquierda(index);
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




    private boolean isFull(){
        return nElementos == arrayDeDoubles.length;
    }

    private void arrayExpand (){
        double[] arrayExpandido = new double[arrayDeDoubles.length * 2];
        for (int i = 0; i < arrayDeDoubles.length; i++) {
            arrayExpandido[i] = arrayDeDoubles [i];
        }
        arrayDeDoubles = arrayExpandido;
    }
    private void moverDerecha(int index){
        for (int i = nElementos; i > index ; i--) {
            arrayDeDoubles[i] = arrayDeDoubles[i-1];
        }
        nElementos++;
    }
    private void moverIzquierda(int index){
        for (int i = index; i < nElementos-1 ; i++) {
            arrayDeDoubles[i] = arrayDeDoubles[i+1];
        }
        nElementos--;
    }

}
