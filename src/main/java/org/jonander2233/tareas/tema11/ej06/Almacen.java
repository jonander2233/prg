package org.jonander2233.tareas.tema11.ej06;

import java.util.HashMap;

public class Almacen {
    private HashMap<String,Multimedia> multimediaAlmacenada;

    public Almacen() {
        multimediaAlmacenada = new HashMap<>();
    }

    public boolean altaMultimedia(String titulo, String autor, Formato formato, int anyo){
        Multimedia multimedia = new Multimedia(titulo,autor,formato,anyo);
        return true;
    }

    public boolean altaPelicula(String titulo, String autor, Formato formato, int anyo,float duracionMinutos,String actorPrincipal,String actrizPrincipal){
        Pelicula pelicula = new Pelicula(titulo,autor,formato,anyo,duracionMinutos,actorPrincipal,actrizPrincipal);
        return true;
    }

    public boolean alquilarMultimedia(Multimedia multimedia){

        return false;
    }

    public Pelicula obtenerPelicula(String titulo){
         Multimedia multimedia =  multimediaAlmacenada.get(titulo);
        if (multimedia instanceof Pelicula){
            return (Pelicula) multimedia;
        }
        return null;
    }
}
