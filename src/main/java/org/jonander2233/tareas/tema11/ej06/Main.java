package org.jonander2233.tareas.tema11.ej06;

import org.jonander2233.lib_personal.Menu;

public class Main {
    public static void main(String[] args) {
        String[] opciones = new String[]{"Altas","Alquilar multimedia a socio","Devolver Multimedia","Listados"};
        int respuesta = Menu.mostrar("MENU ALQUILER",opciones,"Salir");
        switch (respuesta){
            case 0:
                break;
            case 1:
                altas();
                break;
            case 2:
                alquileres();
                break;
            case 3:
                devolver();
                break;
            case 4:
                listados();
                break;
            default:
                break;
        }
    }
    private static void altas(){
        String[] opciones = new String[]{"Alta de una nueva pelicula","Alta de un nuevo videojuego","Alta de un nuevo socio"};
        int respuesta = Menu.mostrar("ALTAS",opciones,"volver");
        switch (respuesta){
            case 0:
                return;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }
    private static void alquileres(){

    }
    private static void devolver(){

    }
    private static void listados(){
        String[] opciones = new String[]{"Objetos multimedia","Peliculas por titulo","Videojuegos por anyo",
                "Histórico de alquileres de un socio ordenados por fecha de alquiler","Alquileres actuales de un socio",
                "Socios con recargos pendientes"};

        int respuesta = Menu.mostrar("LISTADOS",opciones,"volver");
        switch (respuesta){
            case 0:
                return;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }
    }
}
