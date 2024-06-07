package org.jonander2233.tareas.tema11.ej05;

public class Item {
    private TipoObjeto tipoObjeto;
    private String nombre;
    private int cantidad;


    public Item(TipoObjeto tipoObjeto, String nombre, int cantidad) {
        this.tipoObjeto = tipoObjeto;
        this.nombre = nombre;
        if(cantidad <= tipoObjeto.getCapacidad()){
            this.cantidad = cantidad;
        }else {
            this.cantidad = 1;
        }
    }

    public Item(Item item) {
        this.tipoObjeto = item.tipoObjeto;
        this.cantidad = item.cantidad;
        this.nombre = item.nombre;
    }

    public boolean setCantidad(int cantidad){
        if(cantidad > this.getCapacidadMax()){
            return false;
        } else {
            this.cantidad = cantidad;
        }
        return true;
    }
    public int getCantidad(){
        return cantidad;
    }

    public int getCapacidadMax(){
        return tipoObjeto.getCapacidad();
    }

    public int subCantidad(int cantidad){
        if (this.cantidad > cantidad){
            this.cantidad = this.cantidad - cantidad;
            return this.cantidad;
        }
        return -1;
    }

    public String getNombre(){
        return this.nombre;
    }

    public boolean addCantidad(int cantidad){
        if(this.cantidad + cantidad > this.tipoObjeto.getCapacidad()){
            return false;
        } else {
            this.cantidad = this.cantidad + cantidad;
        }
        return true;
    }

}
