package org.jonander2233.lib_personal;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class consoleMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static final int CAPACIDAD_INICIAL = 5;
    private final String texto;
    private consoleMenu[] opciones;
    private int numOpciones;

    public consoleMenu(String titulo){
        this.texto = titulo;
        this.opciones = null;
        numOpciones = 0;
    }
    private void ampliarCapacidad(){
        consoleMenu[] copia = new consoleMenu[opciones.length *2];
        for (int i = 0; i < opciones.length; i++) {
            copia[i] = opciones [i];
        }
        opciones = copia;
    }
    public consoleMenu addOpcion(String opcion){
        if (opciones == null){
            opciones = new consoleMenu[CAPACIDAD_INICIAL];
        }
        if (numOpciones == opciones.length){ //El array está lleno
            ampliarCapacidad();
        }
        consoleMenu resultado = new consoleMenu(texto);
        opciones[numOpciones] = resultado;
        return  resultado;
    }
    public int mostrarMenu (){
        boolean valido;
        int opcion;
        do{
            System.out.println(this);
            opcion = Integer.parseInt(scanner.nextLine());
            valido = opcion >= 1 && opcion <= numOpciones;
        }while (!valido);
        return opcion;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("*** ").append(texto).append(" ***");
        for (int i = 0; i < numOpciones; i++) {
            sb.append(i+1).append(opciones[i].texto).append("\n");
        }
        sb.append("----------------------------------");
        sb.append("Elija una opcion: ");
        return sb.toString();
    }
}
