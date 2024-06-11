package org.jonander2233.tareas.tema11.ej07;

import java.util.ArrayList;

public class Fila {
    ArrayList<Asiento> filaAsientos;
    private static int contador=0;
    private int id=0;


    public Fila(int nAsientos) {
        this.id = ++contador;
        this.filaAsientos = new ArrayList<Asiento>(nAsientos);
        for (int i = 1; i <= nAsientos; i++) {
            Asiento asiento = new Asiento();
            if(Test.codigoTest)
                System.out.printf("%screado asiento " + i +" id: " + asiento.getId() + "%s\n", Colorinchis.CYAN, Colorinchis.RESET);

            filaAsientos.add(asiento);

        }
    }
    public void verAsientos(){
        for (int i = 0; i < filaAsientos.size(); i++) {
            System.out.printf("%sasiento " + (i+1) +" id: " + filaAsientos.get(i).getId() +" isVendido: "+filaAsientos.get(i).isVendido() + "%s\n", Colorinchis.CYAN, Colorinchis.RESET);
        }
    }
    public int getId() {
        return id;
    }
}
