package org.jonander2233.tareas.tema10.ej01;

import java.util.ArrayList;

public class Test {
    public static void main(){
        Ej01 a = new Ej01();
        ArrayList ar;
        int[] nums = new int[]{1,2,16,39,13,56,23,43,34,10};
        ar = a.metodo1(nums);
        System.out.println(ar.toString());
    }
}
