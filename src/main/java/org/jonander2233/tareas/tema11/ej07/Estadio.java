package org.jonander2233.tareas.tema11.ej07;

import java.util.ArrayList;
import java.util.HashMap;

public class Estadio {
    private static final int N_ZONAS = 2;
    private static final int N_ZONAS_VIP = 1;
    private static final int N_ASIENTOS_Y_FILAS = 3;
    private ArrayList<Zona> zonas;

    public Estadio(int nZonas,int nZonasVip, int nFYA) {
        zonas = new ArrayList<>(nZonas);

        for (int i = 1; i < nZonas + 1; i++) {
            Zona zona = new Zona(nFYA,Categoria.NORMAL);
            zonas.add(zona);
            if(Test.codigoTest)
                System.out.printf("%szona "+ i +" creada%s\n", Colorinchis.BLUE, Colorinchis.RESET);
        }

        for (int i = 1; i < nZonasVip + 1; i++) {
            Zona zonaVip = new Zona(nFYA,Categoria.VIP);
            zonas.add(zonaVip);
            if(Test.codigoTest)
                System.out.printf("%szona vip "+ i +" creada%s\n", Colorinchis.GREEN, Colorinchis.RESET);
        }
    }

    public Estadio(){
        this(N_ZONAS,N_ZONAS_VIP,N_ASIENTOS_Y_FILAS);
    }

    public void verAsientos(){
        for (int i = 0; i < zonas.size(); i++) {
            if(zonas.get(i).getCategoria() == Categoria.NORMAL){
                System.out.printf("%szona "+ (i+1) +" id: "+ zonas.get(i).getId() +"%s\n", Colorinchis.BLUE, Colorinchis.RESET);
                zonas.get(i).verAsientos();
            }
        }
        for (int i = 0; i < zonas.size(); i++) {
            if(zonas.get(i).getCategoria() == Categoria.VIP){
                System.out.printf("%szona "+ (i+1) +" [VIP], id: "+ zonas.get(i).getId() +"%s\n", Colorinchis.RED, Colorinchis.RESET);
                zonas.get(i).verAsientos();
            }
        }
    }
}
