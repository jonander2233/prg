package org.jonander2233.tareas.tema11.ej07;
enum Colorinchis {
    RESET("\u001B[0m"),
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    MAGENTA("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m");

    private final String code;

    Colorinchis(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}

public class Test {

    public static boolean codigoTest=false; //imprime la creacion de los asientos,zonas y filas

    public static void main(String[] args) {
        Partido partido = new Partido();        //se crea el partido
        Estadio estadio = new Estadio(4,1,5);        //se crea el estadio
//        estadio.verAsientos();      //se imprimen los asientos del estadio
        Zona zona1 = estadio.getZona(1);
        for (int i = 0; i < 2; i++) {
            zona1.venderAsiento();
        }
        int[]test = zona1.venderAsiento();
        System.out.println(test[0]+" "+ test[1]);











//        Evento evento = new Evento(estadio,partido);        //se crea el evento con el estadio y el partido
//        EntradaNormal entrada = evento.venderEntrada();
    }
}
