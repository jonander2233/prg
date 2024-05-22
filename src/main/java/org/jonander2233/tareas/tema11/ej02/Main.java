package org.jonander2233.tareas.tema11.ej02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Punto> puntos = new ArrayList<Punto>();
        puntos.add(new Punto(0,0));
        puntos.add(new Punto(2,0));
        puntos.add(new Punto(2,2));
        puntos.add(new Punto(0,2));

        Poligono poligono = new Poligono(puntos);

        System.out.println(poligono.toString());
        poligono.traslada(4,-3);
        System.out.println(poligono.toString());
    }
}
