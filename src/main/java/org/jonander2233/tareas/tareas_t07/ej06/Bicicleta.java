package org.jonander2233.tareas.tareas_t07.ej06;
import java.util.HashSet;
import java.util.Set;
public class Bicicleta {
    private static  Set<String> ref1 = new HashSet<>();
    private String numeroDeReferencia;
    private String marca;
    private String modelo;
    private String pesoKg;
    private String tamanoRuedasEnPulgadas;
    private boolean tieneMotor;
    private String fechaFabricacion;
    private long precio;
    private int nExistencias;





    public Bicicleta(String numeroDeReferencia) {
        if (!ref1.add(numeroDeReferencia)) {
            throw new IllegalArgumentException("El número de referencia debe ser único");
        }
        this.numeroDeReferencia = numeroDeReferencia;
    }
    public String getNumeroDeReferencia() {
        return numeroDeReferencia;
    }
}
