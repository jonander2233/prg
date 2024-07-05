package org.jonander2233.tareas.tema12.ej03;

import java.io.File;

public class Ej03 {
    public static void ejercicio(){
        File recursos = new File(new String("D:\\PRG\\prg-jdk20\\src\\main\\java\\org\\jonander2233\\tareas\\tema12\\recursos"));
        System.out.println("El nombre es: " + recursos.getName());
        System.out.println("la ruta es: "+ recursos.getAbsolutePath());
        System.out.println("Se puede leer: " + recursos.canRead());
        System.out.println("Se puede escribir : " + recursos.canWrite());
    }
}
