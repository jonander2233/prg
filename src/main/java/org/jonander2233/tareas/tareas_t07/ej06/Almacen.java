package org.jonander2233.tareas.tareas_t07.ej06;

import org.jonander2233.lib_personal.Eys;

public class Almacen {
    private Bicicleta[] bicicletas;
    private int numReferencias;

    public Almacen(int capacidad) {
        bicicletas = new Bicicleta[capacidad];
        numReferencias = 0;
    }

    public Bicicleta buscarPorRef(int referencia) {
        for (int i = 0; i < numReferencias; i++) {
            if (bicicletas[i].getReferencia() == referencia)
                return bicicletas[i];
        }
        return null;
    }
    public void crearBicicleta (String marca,String modelo, String pesoKg, String tamanoRuedasEnPulgadas,
                                boolean tieneMotor, String fechaFabricacion, double precio, int nExistencias ){
        Bicicleta biciNueva = new Bicicleta(marca,modelo,pesoKg,tamanoRuedasEnPulgadas,
                                    tieneMotor,fechaFabricacion,precio,nExistencias);
        bicicletas[numReferencias] = biciNueva;
        numReferencias++;
    }
}
