package org.jonander2233.tareas.tema09.ej06;

public class Ej06 {
    Ej06(){
        int[] array = {-2, -1, 0, 1, 2};
        dividirEntreArray(2, array);
        dividirEntreArray2(2, array);
    }

    public static void dividirEntreArray(int num, int[] array) {

        for (int i = 0; i < array.length; i++) {
            try {
                System.out.println(num + " / " + array[i] + " = " + num / array[i]);
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre 0");
            }
        }
    }

    public static void dividirEntreArray2(int num, int[] array) {

        for (int i : array){
            if (i == 0){
                System.out.println("Hay un 0 en el array");
                System.out.println("No se puede dividir entre 0");
                return;
            }
        }
        for (int j : array) {
            System.out.println(num + " / " + j + " = " + num / j);
        }
    }
}