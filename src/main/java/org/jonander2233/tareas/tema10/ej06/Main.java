package org.jonander2233.tareas.tema10.ej06;

import org.jonander2233.lib_personal.Eys;
import org.jonander2233.lib_personal.Menu;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Traductor tr = new Traductor();
    public static void main (String[]args){

        String[] opciones = new String[]{"introducir parejas de palabras.","Traducir palabras."};
        boolean valido = false;
        do {
            int seleccion = Menu.mostrar("MENU PRINCIPAL",opciones,"Salir de la aplicacion.");

            switch (seleccion){
                case 0:
                    valido = true;
                    break;
                case 1:
                    parejas();
                    break;
                case 2:
                    palabras();
                    break;
                default:
                    break;
            }
        }while (!valido);
    }
    public static void parejas(){
        System.out.println("¿Cuantas parejas deseas introducir?");
        int num = Eys.leerInt();
        for (int i = 0; i < num; i++) {
            String pIngles = Eys.imprimirYLeer("Introduce palabra en inglés:",1,10);
            String pValenciano = Eys.imprimirYLeer("Introduce la traduccion al valenciano:",1,10);
            tr.addWord(pIngles,pValenciano);

        }
    }
    public static void palabras(){
        String palabra = Eys.imprimirYLeer("introduce la palabra en inglés",1,10);
        if(tr.existe(palabra)){
            System.out.println(tr.getWord(palabra));
        }else{
            System.out.println("La palabra no existe.");
        }
    }
}
