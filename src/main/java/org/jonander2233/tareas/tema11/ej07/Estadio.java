package org.jonander2233.tareas.tema11.ej07;

import java.util.ArrayList;
import java.util.HashMap;

public class Estadio {
    private static final int N_ZONAS = 3;
    private static final int N_ZONAS_VIP = 1;
    private static final int N_ASIENTOS_Y_FILAS = 5;

    private ArrayList<Zona> zonas;

    public Estadio(int nZonas,int nZonasVip, int nFYA) {

        zonas = new ArrayList<>(nZonas);

        for (int i = 1; i < nZonas + 1; i++) {
            Zona zona = new Zona(nFYA,Categoria.NORMAL);
            zonas.add(zona);
            System.out.println("zona " + i + " creada");
        }

        for (int i = 1; i < nZonasVip + 1; i++) {
            Zona zonaVip = new Zona(nFYA,Categoria.VIP);
            zonas.add(zonaVip);
            System.out.println("zona vip " + i + " creada");

        }

        System.out.println(zonas.toString());
    }
    public Estadio(){
        this(N_ZONAS,N_ZONAS_VIP,N_ASIENTOS_Y_FILAS);
    }
}
