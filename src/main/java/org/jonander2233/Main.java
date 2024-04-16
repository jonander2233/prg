package org.jonander2233;
import org.jonander2233.tareas.tema09.ej05.Ej05;
import org.jonander2233.tareas.tema09.ej09.ClaseEx1;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        //Ej05.ex();
        throw new ClaseEx1();
        /*
        test();
        try {

        } catch (ClaseEx1 ce) {
            System.out.println(ce.getMessage());
            System.out.println("Excepción personalizada");
        }

         */
    }

    public static void test() throws ClaseEx1 {
        try {
            int x = 4 / 0;
        } catch (ArithmeticException ce) {
            throw new ClaseEx1("Se ha intentado dividir por 0");
        }
    }
} 