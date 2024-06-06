package org.jonander2233.tareas.tema11.ej05;

import org.jonander2233.lib_personal.Eys;
import org.jonander2233.lib_personal.Menu;

public class Main {
    private static Inventario inventario = new Inventario();
    public static void main(String[] args) {


        String[] opciones = new String[]{"Anyadir al inventario","Eliminar del inventario","Mostrar inventario"};
        int respuesta = Menu.mostrar("INVENTARIO",opciones,"Salir");
        switch (respuesta){
            case 0:
                break;
            case 1:
                anadir();
                break;
            case 2:
                eliminar();
                break;
            case 3:
                mostrar();
                break;
            case 4:
                break;
            default:
                break;
        }
    }
    private static void anadir(){
        int cantidad;
        String[] opciones = new String[]{"Anyadir pico","Anyadir espada","Anyadir piedra","Anyadir madera","Anyadir huevo","Anyadir perla"};
        int respuesta = Menu.mostrar("INVENTARIO",opciones,"Volver");
        switch (respuesta){
            case 0:
                break;
            case 1:
                cantidad = anadirCantidad();
                Item pico = new Item(TipoObjeto.TIPO_1,"Pico",1);
                cantidadBucle(pico,cantidad);
                break;
            case 2:
                cantidad = anadirCantidad();
                Item espada = new Item(TipoObjeto.TIPO_1,"Espada",1);
                cantidadBucle(espada,cantidad);
                break;
            case 3:
                cantidad = anadirCantidad();
                Item piedra = new Item(TipoObjeto.TIPO_64,"Piedra",1);
                cantidadBucle(piedra,cantidad);
                break;
            case 4:
                cantidad = anadirCantidad();
                Item madera = new Item(TipoObjeto.TIPO_64,"Madera",1);
                cantidadBucle(madera,cantidad);
                break;
            case 5:
                cantidad = anadirCantidad();
                Item huevo = new Item(TipoObjeto.TIPO_16,"Huevo",1);
                cantidadBucle(huevo,cantidad);
                break;
            case 6:
                cantidad = anadirCantidad();
                Item perla = new Item(TipoObjeto.TIPO_16,"Perla",1);
                cantidadBucle(perla,cantidad);
                break;
            default:
                break;
        }
    }

    private static int anadirCantidad(){
        int cantidad = Eys.imprimirYLeerInt("Cuantos quieres añadir?",1,100);
        return cantidad;
    }

    private static void cantidadBucle(Item item,int cantidad){ /*cantidad =33 max 10*/
        Item item1 = new Item(item);
        while (cantidad != 0){
            if(cantidad > item.getCapacidadMax()){
                cantidad = cantidad - item.getCapacidadMax(); /*cantidad =3*/
                if(item.getCantidad() != item.getCapacidadMax()){
                    item.addCantidad(item.getCapacidadMax());
                }
                inventario.addItem(item);
            } else {
                item1.addCantidad(cantidad);
                inventario.addItem(item1);
                cantidad = 0;
            }
        }
    }

    private static void eliminar(){

    }
    private static void mostrar(){

    }
}
