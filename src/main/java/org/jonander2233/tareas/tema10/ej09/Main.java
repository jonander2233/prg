package org.jonander2233.tareas.tema10.ej09;

import org.jonander2233.lib_personal.Eys;
import org.jonander2233.lib_personal.Menu;
import org.jonander2233.tareas.tema10.ej08.Diccionario;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static DiccionarioJuego dj = new DiccionarioJuego();
    public static void main (String[]args){
        String[] opciones = new String[]{"Anadir palabra","Modificar palabra","Eliminar palabra","Consultar palabra","Mostar diccionario","Jugar","Mejores puntuaciones"};

        boolean valido = false;

        do {
            int seleccion = Menu.mostrar("JUEGO DICCIONARIO",opciones,"Salir.");

            switch (seleccion){
                case 0:
                    valido = true;
                    break;
                case 1:
                    anadirPalabra();
                    break;
                case 2:
                    modificarPalabra();
                    break;
                case 3:
                    eliminarPalabra();
                    break;
                case 4:
                    consultarPalabra();
                    break;
                case 5:
                    mostarDiccionario();
                    break;
                case 6:
                    jugar();
                    break;
                case 7:
                    mejoresPuntuaciones();
                    break;

                default:
                    break;
            }
        }while (!valido);
    }

    private static void anadirPalabra(){
        String palabra;
        do{
            palabra = Eys.imprimirYLeer("introduce la palabra a anadir",1,15);
            if(dj.existe(palabra)){
                System.out.println("la palabra ya existe!");
            }else{
                break;
            }
        }while (true);
        String definicion = Eys.imprimirYLeer("introduce la definicion de la palabra",1,50);
        dj.addWord(palabra,definicion);
        System.out.println("palabra anadida con exito.");
    }

    private static void modificarPalabra(){
        String palabra;
        do{
            palabra = Eys.imprimirYLeer("introduce la palabra a modificar",1,15);
            if(!dj.existe(palabra)){
                System.out.println("la palabra no existe!");
            }else{
                break;
            }
        }while (true);
        String definicion = Eys.imprimirYLeer("introduce la definicion de la palabra introducida a modificar",1,50);
        dj.replace(palabra,definicion);
    }
    private static void eliminarPalabra(){
        String palabra;
        do{
            palabra = Eys.imprimirYLeer("introduce la palabra a eliminar",1,15);
            if(!dj.existe(palabra)){
                System.out.println("la palabra no existe!");
            }else{
                break;
            }
        }while (true);
        System.out.println("palabra eliminada con exito.");
    }
    private static void consultarPalabra(){
        String palabra;
        do{
            palabra = Eys.imprimirYLeer("introduce la palabra a buscar",1,15);
            if(!dj.existe(palabra)){
                System.out.println("la palabra no existe!");
            }else{
                break;
            }
        }while (true);
        System.out.println(dj.getWord(palabra));
    }
    private static void mostarDiccionario(){
        dj.toString();
    }
    private static void jugar(){
        if (dj.size() == 0){
            System.out.println("No hay palabras en el diccionario");
            return;
        }
        String palabraGanadora = dj.randomWord();
        String descripcion = dj.getWord(palabraGanadora);
        String respuesta = Eys.imprimirYLeer(descripcion,1,15);
        if (respuesta == palabraGanadora){

        }
    }
}
