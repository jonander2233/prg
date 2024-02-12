package org.jonander2233.tareas.tareas_t07.ej06;

public class Almacen {
    private Bicicleta[] bicicletas;
    private int numReferencias;

    public Almacen(int capacidad) {
        bicicletas = new Bicicleta[capacidad];
        numReferencias = 0;
        crearBicicleta("Stanley","pro3","13kg","17",false,"2020",3000,20);
        crearBicicleta("Stanley","pro5","15kg","17",false,"2020",2500,15);
        crearBicicleta("pepetour","max6","12kg","17",false,"2021",3500,5);
        crearBicicleta("goku","max6","16kg","17",false,"2021",3500,55);
    }

    public Bicicleta buscarPorRef(int referencia) {
        for (int i = 0; i < numReferencias; i++) {
            if (bicicletas[i].getReferencia() == referencia)
                return bicicletas[i];
        }
        return null;
    }
    public Bicicleta [] buscarPorMarca(String marca) {
        int contador=0;
        for (int i = 0; i < numReferencias; i++) {
            if (bicicletas[i].getMarca().equals(marca)) {
                contador++;
            }
        }
        Bicicleta[] bicicletasDeXMarca = new Bicicleta[contador];
        int index = 0;
        for (int i = 0; i < numReferencias; i++) {
            if (bicicletas[i].getMarca().equals(marca)) {
                bicicletasDeXMarca[index] = bicicletas[i];
                index++;
            }
        }
        if (numReferencias == 0 ){
        return null;
        }
        return bicicletasDeXMarca;
    }
    public void mostrarStockBicicletas() {
        for (int i = 0; i < numReferencias; i++) {
            System.out.println(bicicletas[i].existenciasToString());
        }
    }

    public Bicicleta [] buscarPorModelo(String modelo) {
        int contador=0;
        for (int i = 0; i < numReferencias; i++) {
            if (bicicletas[i].getModelo().equals(modelo)) {
                contador++;
            }
        }
        Bicicleta[] bicicletasDeXModelo = new Bicicleta[contador];
        int index = 0;
        for (int i = 0; i < numReferencias; i++) {
            if (bicicletas[i].getModelo().equals(modelo)) {
                bicicletasDeXModelo[index] = bicicletas[i];
                index++;
            }
        }
        if (numReferencias == 0 ){
        return null;
        }
        return bicicletasDeXModelo;
    }
    public void crearBicicleta (String marca,String modelo, String pesoKg, String tamanoRuedasEnPulgadas,
                                boolean tieneMotor, String fechaFabricacion, double precio, int nExistencias ){
        Bicicleta biciNueva = new Bicicleta(marca,modelo,pesoKg,tamanoRuedasEnPulgadas,
                                    tieneMotor,fechaFabricacion,precio,nExistencias);
        bicicletas[numReferencias] = biciNueva;
        numReferencias++;
    }
    public int getExistencias (int ref){
        for (int i = 0; i < bicicletas.length; i++) {
            if (bicicletas[i].getReferencia() == ref) {
                return bicicletas[i].getNExistencias();
            }
        }
            return -1;
    }
    public boolean venderBicicleta(int ref,int cantidad){
        for (int i = 0; i < bicicletas.length; i++) {
            if (bicicletas[i].getReferencia() == ref) {
                if (bicicletas[i].consultarExistencia(cantidad) == false){
                    return false;

                } else if (bicicletas[i].consultarExistencia(cantidad) == true) {
                    bicicletas[i].subtractExistencia(cantidad);
                    return true;
                }
            }else {
                return false;
            }
        }
        return false;
    }
}
