package org.jonander2233.tareas.tema10.ej07;

import org.jonander2233.lib_personal.Eys;
import org.jonander2233.lib_personal.Menu;
import org.jonander2233.tareas.tema10.ej07.Conversor;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Conversor cv = new Conversor();
    public static void main (String[]args){
        Conversor cv = new Conversor();
        cv.addCoin("USD",0.94);
        cv.addCoin("GBP",1.16);
        cv.addCoin("INR",0.011);
        cv.addCoin("AUD",0.61);
        cv.addCoin("CAD",0.68);
        cv.addCoin("ARS",0.0011);
        cv.addCoin("BOB",0.14);
        cv.addCoin("CLP",0.00098);
        cv.addCoin("VEZ",0.00024);
        cv.addCoin("CRC",0.0019);
        cv.addCoin("CUP",0.039);
        cv.addCoin("DOP",0.016);
        cv.addCoin("MXN",0.055);
        String[] opciones = new String[]{"conversion de moneda"};

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

    private static void verCambio(){

        String moneda = Eys.imprimirYLeer("introduce la moneda,ej: USD ",3,3);
        double cantidad = Eys.imprimirYLeerDouble("introduce la cantidad de euros");

        if(cv.exists(moneda)){
            double res = cantidad * cv.getCoin(moneda);
            System.out.println(cantidad + " son: " + res + "" + moneda );
        }else{
            System.out.println("La moneda no existe.");
        }
    }
}
