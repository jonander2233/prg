package org.jonander2233.tareas.tema09.ej09;

public class ClaseEx1 extends ArithmeticException {
    public ClaseEx1(String mensaje){
        super(mensaje);
    }

    public ClaseEx1() {
        super("División por 0!!!!!");
    }

}
