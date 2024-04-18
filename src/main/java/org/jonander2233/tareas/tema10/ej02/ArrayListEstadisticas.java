package org.jonander2233.tareas.tema10.ej02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEstadisticas<T> extends ArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayListEstadisticas(){
        this(DEFAULT_CAPACITY);
    }
    public ArrayListEstadisticas(int capacity){
        super(capacity);
    }
}
