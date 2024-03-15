package org.jonander2233.tareas.tema08.ej05;

public class Logic {
    public static int decrementar(int num){
        num--;
        return num;
    }
    public static int comprobar (int num,int solucion){
        if (num > solucion){
            return 1;
        } else if (num < solucion){
            return 2;
        }else
            return 0;
    }
}

