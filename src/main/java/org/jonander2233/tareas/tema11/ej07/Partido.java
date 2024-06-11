package org.jonander2233.tareas.tema11.ej07;

import org.jonander2233.lib_personal.Eys;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

enum Afluencia{
    BAJA_AFLUENCIA(0.75),MEDIA_AFLUENCIA(1),ALTA_AFLUENCIA(1.30);
    private final double porcentaje;
    private Afluencia(double porcentaje) {
            this.porcentaje = porcentaje;
    }
    public double getPorcentaje(){
        return porcentaje;
    }
}
public class Partido {
    private static final String EQUIPO_LOCAL = "equipo 1";
    private static final String EQUIPO_VISITANTE = "equipo 2";
    private static final long tiempoUnix = 1623396000000L; // Por ejemplo, el 11 de junio de 2021
    private static final Date FECHA = new Date(tiempoUnix);



    private int id;
    private static int contador=0;
    private Afluencia afluencia;
    private String nombreVisitante;
    private String nombreLocal;
    private Date fechaPartido;

    public Partido(Afluencia afluencia, String nombreVisitante, String nombreLocal, Date fechaPartido) {
        this.id = ++contador;
        this.afluencia = afluencia;
        this.nombreVisitante = nombreVisitante;
        this.nombreLocal = nombreLocal;
        this.fechaPartido = fechaPartido;
    }
    public Partido() {
        this(Afluencia.MEDIA_AFLUENCIA,EQUIPO_VISITANTE,EQUIPO_LOCAL,FECHA);
    }

}
