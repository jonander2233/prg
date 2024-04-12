package org.jonander2233.tareas.tema09.ej03;

import org.jonander2233.lib_personal.GenericDynamicArray;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej03 {
    public static void ex() {
        GenericDynamicArray<Integer> array = new GenericDynamicArray<>();
        boolean valid = false;
        boolean salir = false;
        int numMayor = 0;
        System.out.println("ingrese numeros, para salir inserte una letra");
        do {
            try {
            salir = metodo(array);

            }catch (InputMismatchException){
                if(array.get(0) == null){
                    System.out.println("no has ingresado ningun numero");
                }else {
                    System.out.println(array.toString());
                }
            }

        } while (!salir);


        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) > numMayor) {
                numMayor = array.get(i);
            }

        }
    }
    public static boolean metodo (GenericDynamicArray array)throws InputMismatchException {
        Scanner lector = new Scanner(System.in);

        array.add(lector.nextInt());
        return true;
    }
}