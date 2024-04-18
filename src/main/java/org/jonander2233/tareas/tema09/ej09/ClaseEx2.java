package org.jonander2233.tareas.tema09.ej09;

public class ClaseEx2 extends NullPointerException {
    public ClaseEx2(String mensaje){
        super(mensaje);
    }

    public ClaseEx2() {
        super("el objeto referenciado no existe");
    }

}
