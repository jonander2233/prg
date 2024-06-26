package org.jonander2233.tareas.tema11.ej03;

import java.util.Arrays;

public class Coche {
    private String matricula;
    private int velocidad;
    private int marcha;
    private int[] nMarchas = new int[]{60,90,120,150,180};

    public Coche(String matricula) {
        this.matricula = matricula;
        velocidad = 0;
        marcha = 0;
    }
    public boolean acelerar(int valor){
        if(valor < 1){
            return false;
        } else {

            velocidad += valor;
        }
        return true;
    }
    public boolean frenar(int valor){
        if(valor < 1){
            return false;
        } else {
            if((velocidad -= valor) < 0){
                velocidad = 0;
            }else {
                velocidad -= valor;
            }
        }
        return true;
    }
    protected boolean cambiarMarcha(int valor){
        if(valor < 0 || valor > nMarchas.length ){
            return false;
        } else {
            marcha = valor;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", velocidad=" + velocidad +
                ", marcha=" + marcha +
                ", nMarchas=" + Arrays.toString(nMarchas) +
                '}';
    }
}
