package org.jonander2233.tareas.tema09.ej09;

public class ClaseEx3 extends IndexOutOfBoundsException {
    public ClaseEx3(String mensaje){
        super(mensaje);
    }

    public ClaseEx3() {
        super("el indice se sale del array");
    }

}
