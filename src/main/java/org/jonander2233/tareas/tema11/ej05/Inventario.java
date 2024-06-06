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
    public int addItem(Item item){
        for (int i = 0; i < inventario.size(); i++) {
            if(inventario.get(i).getNombre().equals(item.getNombre())){
                    int restante = -1;
                    Item item1 = new Item(item);
                while (restante != 0){
                    if(inventario.get(i).getCantidad() + item.getCantidad() > inventario.get(i).getCapacidadMax()){
                        restante = (inventario.get(i).getCantidad() + item.getCantidad()) - inventario.get(i).getCapacidadMax();
                        inventario.get(i).setCantidad(inventario.get(i).getCapacidadMax());
                    }else{
                        item.addCantidad(inventario.get(i).getCantidad());
                        inventario.set(i,item);
                    }
                }
            }
        }
        return -1;
    }

    private void cantidadBucle(Item item,int cantidad){
        Item item1 = new Item(item);
        while (cantidad != 0){
            if(cantidad > item.getCapacidadMax()){
                cantidad = cantidad - item.getCapacidadMax();
                if(item.getCantidad() != item.getCapacidadMax()){
                    item.addCantidad(item.getCapacidadMax());
                }
                this.addItem(item);
            } else {
                item1.addCantidad(cantidad);
                this.addItem(item1);
                cantidad = 0;
            }
        }
    }
    public void replaceItem(){

    }
}
