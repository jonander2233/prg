package org.jonander2233.tareas.tema12.ej02;

import java.io.File;

public class Ej02 {
    public static void ejercicio(){
        File recursos = new File(new String("D:\\PRG\\prg-jdk20\\src\\main\\java\\org\\jonander2233\\tareas\\tema12\\recursos"));

        String[] contenido = recursos.list();

        for (int i = 0; i < contenido.length; i++) {
            System.out.println(contenido[i]);
        }
    }
}
