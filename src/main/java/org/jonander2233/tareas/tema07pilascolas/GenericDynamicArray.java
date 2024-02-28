package org.jonander2233.tareas.tema07pilascolas;

import java.util.Arrays;

public class GenericDynamicArray <T>{
    private Object[] arrayDeDoubles;
    private int  nElementos;

    public GenericDynamicArray(int tamano) {
        arrayDeDoubles = new Object[tamano];
        nElementos = 0;
    }

    private boolean isFull(){
        return nElementos == arrayDeDoubles.length;
    }
    public int size(){
        return nElementos;
    }
    private void arrayExpand (){
        Object[] arrayExpandido = new Object[arrayDeDoubles.length * 2];
        for (int i = 0; i < arrayDeDoubles.length; i++) {
            arrayExpandido[i] = arrayDeDoubles [i];
        }
        arrayDeDoubles = arrayExpandido;
    }

    public boolean add (T value){
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
    public boolean add (int index,T value) {
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



    @SuppressWarnings("unchecked")
    public T remove (T value){
        int index;
        for (int i = 0; i < nElementos; i++) {
            if(value == arrayDeDoubles [i]){
                index = i;
                moverIzquierda(index);

                return (T)arrayDeDoubles[i];
            }
        }
        return null;
    }
    @SuppressWarnings("unchecked")
    public T remove (int index){
        if (index > nElementos)
            return null;

        T nEliminado = (T)arrayDeDoubles[index];
        moverIzquierda(index);
        return nEliminado;
    }



    public T get (int index){
        T num =(T) arrayDeDoubles[index];
        return num;
    }

    public boolean set (int index, double value){
        arrayDeDoubles[index] = value;
        return true;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append ("{");
//        for (int i = 0; i < ; i++) {
            
//        }
        return "GenericDynamicArray{" +
                "arrayDeDoubles=" + Arrays.toString(arrayDeDoubles) +
                ", nElementos=" + nElementos +
                '}';
    }
}
