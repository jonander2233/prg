package org.jonander2233.tareas.tema11.ej05;

import org.jonander2233.lib_personal.Menu;

public class Main {
    public static void main(String[] args) {
        Item espada = new Item(TipoObjeto.TIPO_1,"Espada",1);
        Item piedra = new Item(TipoObjeto.TIPO_64,"Piedra",33);

        String[] opciones = new String[]{"Anyadir al inventario","Eliminar del inventario","Mostrar inventario"};
        int respuesta = Menu.mostrar("INVENTARIO",opciones,"Salir");
        switch (respuesta){
            case 0:
                break;
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
