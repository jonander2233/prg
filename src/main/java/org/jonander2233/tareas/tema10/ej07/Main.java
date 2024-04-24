package org.jonander2233.tareas.tema10.ej07;

import org.jonander2233.lib_personal.Eys;
import org.jonander2233.lib_personal.Menu;
import org.jonander2233.tareas.tema10.ej06.Traductor;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Traductor tr = new Traductor();
    public static void main (String[]args){
        Conversor cv = new Conversor();

        String[] opciones = new String[]{"ver cambio"};

        boolean valido = false;

        do {
            int seleccion = Menu.mostrar("MENU PRINCIPAL",opciones,"Salir de la aplicacion.");

            switch (seleccion){
                case 0:
                    valido = true;
                    break;
                case 1:
                    verCambio();
                    break;
                default:
                    break;
            }
        }while (!valido);
    }

    public static void verCambio(){





        String palabra = Eys.imprimirYLeer("introduce la moneda",1,10);
        if(tr.existe(palabra)){
            System.out.println(tr.getWord(palabra));
        }else{
            System.out.println("La palabra no existe.");
        }
    }
}
