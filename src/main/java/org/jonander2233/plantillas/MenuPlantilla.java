package org.jonander2233.plantillas;

import org.jonander2233.lib_personal.Menu;

public class MenuPlantilla {
    public static void main(String[] args) {
        String[] opciones = new String[]{"","","",""};
        boolean salir = false;
        do{
            int respuesta = Menu.mostrar("",opciones,"Salir");
            switch (respuesta) {
                case 0:
                    salir = true;
                    break;
                case 1:
                    caso1();
                    break;
                case 2:
                    caso2();
                    break;
                case 3:
                    caso3();
                    break;
                case 4:
                    caso4();
                    break;
                default:
                    break;
            }
        } while (!salir);
    }
    private static void caso1(){
        String[] opciones = new String[]{"","","",""};
        int respuesta = Menu.mostrar("",opciones,"volver");
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
    private static void caso2(){
        String[] opciones = new String[]{"","","",""};
        int respuesta = Menu.mostrar("",opciones,"volver");
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
        int respuesta = Menu.mostrar("",opciones,"volver");
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
        int respuesta = Menu.mostrar("",opciones,"volver");
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
