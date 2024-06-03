package org.jonander2233.tareas.tema11.ej05;

public class Item {
    private TipoObjeto tipoObjeto;
    private String nombre;
    private int cantidad;


    public Item(TipoObjeto tipoObjeto, String nombre, int cantidad) {
        this.tipoObjeto = tipoObjeto;
        this.nombre = nombre;
        if(cantidad <= tipoObjeto.getCantidad()){
            this.cantidad = cantidad;
        }else {
            this.cantidad = 1;
        }
    }
    public int getMax(){
        return this.tipoObjeto.getCantidad();
    }
    public int getCantidad(){
        return cantidad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public boolean addCantidad(int cantidad){
        if(this.cantidad + cantidad > this.tipoObjeto.getCantidad()){
            return false;
        } else {
            this.cantidad = this.cantidad + cantidad;
        }
        return true;
    }
}
