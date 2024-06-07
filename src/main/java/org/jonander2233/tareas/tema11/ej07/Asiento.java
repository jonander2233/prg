package org.jonander2233.tareas.tema11.ej07;

import java.util.HashSet;
import java.util.Objects;

public class Asiento {
    private int id=0;
    private final String nombre = "asiento " + id;

    public Asiento() {
        ++id;
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
