package org.jonander2233.tareas.tema09.ej02;

import org.jonander2233.lib_personal.GenericDynamicArray;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej02 {
    public static void ex(){
        GenericDynamicArray<Float> array = new GenericDynamicArray<>();
        int cantidadErr=0;

        adfasdf(array);

        float numMayor = 0;
        for (int i = 1; i < array.size(); i++) {
            if(array.get(i)>numMayor){
                numMayor = array.get(i);
            }
        }
        System.out.println(cantidadErr);
    }

    private static int adfasdf (GenericDynamicArray array)throws InputMismatchException {
        Scanner lector = new Scanner(System.in);
        int cantidadErr=0;
        float num;
        for (int i = 0; i < 9; i++) {
            System.out.println("ingrese 10 numeros con decimales");
            boolean valid = false;

            do {
                try {
                    lector.nextLine();
                    num = lector.nextFloat();
                    array.add(num);
                    valid = true;
                }catch (InputMismatchException ime){
                    cantidadErr++;
                    System.out.println("ingrese solo numeros");
                }
            }while (!valid);
        }
        return cantidadErr;
    }
}
