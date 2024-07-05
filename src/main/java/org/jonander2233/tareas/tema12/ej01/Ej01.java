package org.jonander2233.tareas.tema12.ej01;

import java.io.File;

public class Ej01 {
    public static void ejercicio(){
        String ruta = "D:\\PRG\\prg-jdk20\\src\\main\\java\\org\\jonander2233\\tareas\\tema12\\recursos";
        File directorio = new File(ruta);
        System.out.println("Existe: "+ directorio.exists()+" \nEs un directorio: "+ directorio.isDirectory());
    }
}
