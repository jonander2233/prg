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

    public Item buscarItem(Item item){
        for (int i = 0; i < inventario.size(); i++) {
            if(inventario.get(i).getNombre().equals(item.getNombre())){
                    return inventario.get(i);
            }
        }
        return null;
    }
    public int addItem(Item item){
        Item item_inventario = buscarItem(item);
        int restante = -1;
        if(item.getCantidad() + item_inventario.getCantidad() > item.getCapacidadMax()){

        }

    }

    public void replaceItem(){

    }
}
