package org.jonander2233.tareas.tema11.ej05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Inventario {
    private List<Item> inventario;
//    private Item[] inventario;
    private int CANT_CASILLAS = 7;


    public Inventario() {
//        this.inventario = new Item[CANT_CASILLAS];
        this.inventario = new ArrayList<>();
    }

    public Inventario(int capacidad) {
//        this.inventario = new Item[capacidad];
        this.CANT_CASILLAS = capacidad;
        this.inventario = new ArrayList<>();
    }
    public boolean addItem(Item item){
        for (int i = 0; i < inventario.size(); i++) {
            if(inventario.get(i).getNombre().equals(item.getNombre())){
                if(inventario.get(i).getCantidad() + item.getCantidad() > inventario.get(i).getMax()){

                //todo hacer que funcione

                }else{
                    item.addCantidad(inventario.get(i).getCantidad());
                    inventario.set(i,item);
                }
            }
        }
        return false;
    }
    public void replaceItem(){

    }
}
