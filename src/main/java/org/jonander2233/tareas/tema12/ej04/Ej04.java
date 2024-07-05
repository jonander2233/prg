package org.jonander2233.tareas.tema12.ej04;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ej04 {
    public static void ejercicio(){
        File recursos = new File(new String("D:\\PRG\\prg-jdk20\\src\\main\\java\\org\\jonander2233\\tareas\\tema12\\recursos\\texto1.txt"));
        long fechaModificacion = recursos.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fecha = sdf.format(fechaModificacion);
        System.out.println(recursos.getName());
        System.out.println(recursos.getAbsolutePath());
        System.out.println("archivo oculto: " + recursos.isHidden());
        System.out.println("se puede leer: "+ recursos.canRead());
        System.out.println("se puede escribir: "+ recursos.canWrite());
        System.out.println("última modificación: " + fecha);
        long tamanoBytes = recursos.length();
        float tamanoKB = tamanoBytes / 1000.0f;
        float tamanoMB = tamanoBytes / 1000000.0f;
        System.out.println("pesa " + recursos.length() + " bytes \n " + tamanoKB + " kilobytes\n " + tamanoMB + " megabytes");
    }
}
