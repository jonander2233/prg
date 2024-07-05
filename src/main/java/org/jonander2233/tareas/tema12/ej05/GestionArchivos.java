package org.jonander2233.tareas.tema12.ej05;

import java.io.File;
import java.io.IOException;

public class GestionArchivos {

    public static boolean crearArchivo(String directorio,String archivo) throws IOException {
        File dir = new File(directorio);
        if(dir.exists() && dir.canWrite() && dir.isDirectory()){
            File nuevoArchivo = new File(dir,archivo);
            if(!nuevoArchivo.exists()){
                nuevoArchivo.createNewFile();
            } else {
                return false;
            }
        }else {
            return false;
        }
        return true;
    }

    public static void listarDirectorio(String directorio){
        String tipo;
        StringBuilder leerYEscribir = new StringBuilder();
        File dir = new File(directorio);
        File[] contenido = dir.listFiles();
        for (int i = 0; i < contenido.length; i++) {
            if(contenido[i].isDirectory())
                tipo = "D";
            else
                tipo = "F";

            if(contenido[i].canRead())
                leerYEscribir.append("r");
            if(contenido[i].canWrite())
                leerYEscribir.append("w");
            System.out.println(contenido[i].getName() + " " + tipo + " "+ contenido[i].length() +" bytes " + leerYEscribir.toString());
            leerYEscribir.setLength(0);
        }
    }
    public static void verInfo(String directorio,String archivo){

    }

}

