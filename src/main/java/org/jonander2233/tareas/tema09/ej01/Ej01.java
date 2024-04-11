package org.jonander2233.tareas.tema09.ej01;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.jonander2233.lib_personal.GenericDynamicArray;
public class Ej01 {

    public static void ex (){
        GenericDynamicArray array = new GenericDynamicArray<Integer>();
        int num;
        boolean validate = false;
        System.out.println("ingresa un numero, para finalizar ingrese un numero negativo");

        do{
            try{
                bucleNums(array);
                validate = true;
            }catch (InputMismatchException ime){
                System.out.println("ingrese solo números");
                }
        } while (validate == false);
        System.out.println(array.toString());
    }


    private static void bucleNums(GenericDynamicArray array) throws InputMismatchException {
        Scanner lector = new Scanner(System.in);
        int num;
        do{
            num = lector.nextInt();
            if(num>0){
                array.add(num);
            }
        } while (num > 0);
    }
}
