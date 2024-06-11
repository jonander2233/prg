package org.jonander2233.tareas.tema11.ej07;

import java.util.HashSet;
import java.util.Objects;

public class Asiento {
    private static int contador=0;
    private int id;
    private final String nombre = "asiento " + id;
    private boolean vendido = false;

    public Asiento() {
        this.id = ++contador;
    }
    public void vender(){
        vendido = true;
    }

    public int getId() {
        return id;
    }
    public boolean isVendido(){
        return vendido;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Asiento asiento = (Asiento) o;

        if (id != asiento.id) return false;
        return Objects.equals(nombre, asiento.nombre);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }
}
