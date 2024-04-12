package org.jonander2233.tareas.tema09.ej03;

import org.jonander2233.lib_personal.GenericDynamicArray;

public class Ej03 {
    public static void ex(){
        GenericDynamicArray<Integer> array = new GenericDynamicArray<>();
        boolean valid=false;
        int numMayor =0;

        for (int i = 1; i < array.size(); i++) {
            if(array.get(i)>numMayor){
                numMayor = array.get(i);
            }
    }
}
