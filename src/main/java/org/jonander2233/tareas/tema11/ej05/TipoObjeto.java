package org.jonander2233.tareas.tema11.ej05;

public enum TipoObjeto {
    TIPO_64(64),TIPO_16(16),TIPO_1(1);
    private final int cantidad;
    TipoObjeto (int cantidad){
        this.cantidad = cantidad;
    }
    public int getCantidad(){
        return this.cantidad;
    }
}
