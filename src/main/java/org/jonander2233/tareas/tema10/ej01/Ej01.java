package org.jonander2233.tareas.tema10.ej01;

import java.util.ArrayList;

public class Ej01 {
    public ArrayList metodo1(int[] nums){
        ArrayList<Integer> ar = new ArrayList<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){  //impares
                ar.add(nums[i]);
            }

        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0){  //pares
                ar.add(nums[i]);
            }
        }
        return ar;
    }
}
