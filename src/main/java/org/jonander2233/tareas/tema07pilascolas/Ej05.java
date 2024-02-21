package org.jonander2233.tareas.tema07pilascolas;

import org.jonander2233.lib_personal.Pila;

import java.util.Scanner;

public class Ej05 {
    public void ej05(){
        StringBuilder sb = new StringBuilder();
        Scanner lector = new Scanner(System.in);
        String[] datos = new String[10];
        int tamanyo;
        String texto;
        System.out.println("introduce tu operacion");
        texto = lector.nextLine();

        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);
            if (Character.isDigit(caracter)){
                sb.append(caracter);
            } else if (comparadorOperadores(caracter)) {

            }
        }
        Pila pila = new Pila(tamanyo);
    }
    private static boolean comparadorOperadores(char car){
        return car == '+' && car == '-' && car == '*' && car == '/' && car == '%';
    }
}
