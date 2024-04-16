package org.jonander2233.tareas.tema09.ej09;

public class Ej09 {
    Ej09(){

        try {
            int a = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }

        try {
            int[] array = {1, 2, 3};
            System.out.println(array[7]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }

        try {
            String texto = null;
            texto.charAt(0);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

    }
}