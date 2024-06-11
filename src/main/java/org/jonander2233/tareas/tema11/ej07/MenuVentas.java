package org.jonander2233.tareas.tema11.ej07;

import org.jonander2233.lib_personal.*;

import java.util.Date;

public class MenuVentas {
    public static void main(String[] args) {
        String[] opciones = new String[]{"Nuevo partido","Gestion de entradas"};
        int respuesta = Menu.mostrar("VENTA DE ENTRADAS",opciones,"Salir");
        switch (respuesta) {
            case 0:
                break;
            case 1:
                nuevoPartido();
                break;
            case 2:
                gestionEntradas();
                break;
            default:
                break;
        }
        System.out.println("adios");
    }
    private static void nuevoPartido(){
        Date fechaPartido = Eys.imprimirYLeerDate("Introduce la fecha del partido");
        Afluencia tipoPartido = Eys.imprimirYLeerEnum("Elige el tipo de partido",Afluencia.class);
        String local = Eys.imprimirYLeer("Indica el equipo local",1,20);
        String visitante = Eys.imprimirYLeer("Indica el equipo visitante",1,20);

    }
    private static void gestionEntradas(){
        String[] opciones = new String[]{"","","",""};
        int respuesta = Menu.mostrar("",opciones,"");
        switch (respuesta) {
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
            default:
                break;
        }
    }
    private static void caso3(){
        String[] opciones = new String[]{"","","",""};
        int respuesta = Menu.mostrar("",opciones,"");
        switch (respuesta) {
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
            default:
                break;
        }
    }
    private static void caso4(){
        String[] opciones = new String[]{"","","",""};
        int respuesta = Menu.mostrar("",opciones,"");
        switch (respuesta) {
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
            default:
                break;
        }
    }
}
