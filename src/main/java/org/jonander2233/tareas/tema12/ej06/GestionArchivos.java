package org.jonander2233.tareas.tema12.ej06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
        File dir = new File(directorio);
        if(dir.exists() && dir.isDirectory()){
            File file = new File(dir,archivo);
            if(file.exists()){
                String tipo;
                if(file.isDirectory())
                    tipo = "D";
                else
                    tipo = "A";
                System.out.println(
                        file.getName() + " " + file.getAbsolutePath() + "\nPermisos de escritura: " + file.canWrite() + "\nPermisos de lectura: " + file.canRead()
                                +"\nTamano: "+ file.length() + "\ntipo: " + tipo
                );
            }
        }
    }
    public static void leerContenido (String ruta) throws IOException {
        FileReader lector = new FileReader(ruta);
        
    }
}

