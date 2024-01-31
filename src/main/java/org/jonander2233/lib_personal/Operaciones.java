package org.jonander2233.lib_personal;

public class Operaciones {
    public static double descuento (double porcentaje,double num){
        double precioConDescuento = num - (num * (porcentaje/100));
        return precioConDescuento;
    }
}
