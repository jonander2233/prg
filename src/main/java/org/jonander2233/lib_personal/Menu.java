package org.jonander2233.lib_personal;
import java.util.Scanner;
public class Menu {
    public static int mostrar(String titulo, String[] opciones){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("*********************");
            System.out.println("**" + titulo + "**");
            System.out.println("*********************");
            for (int i = 0; i < opciones.length; i++) {

                System.out.println(opciones[i]);
            }
            System.out.println("-----------------------");
            System.out.println("0.Salir");
            opcion = scanner.nextInt();
            if (opcion < 0 || opcion > opciones.length){
                System.out.println("error, el numero introducido no es valido");
            }
        }while (opcion<0 );
        return opcion;
    }
}