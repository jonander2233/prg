package org.jonander2233.tareas.tareas_t07.checker;

import org.jonander2233.lib_personal.Pila;

public class CodigoFuenteParser {
    private final String texto;
    private final Pila pila;
    private final String simbolosApertura;
    private final String simbolosCierre;
    public CodigoFuenteParser(String texto,String simbolosApertura, String simbolosCierre){
        this.texto = texto;
        this.simbolosApertura = simbolosApertura;
        this.simbolosCierre=simbolosCierre;
        pila = new Pila(20);
    }
    public boolean parse(){
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (simbolosApertura.indexOf(c) >=0){
                pila.push(String.valueOf(c));
                //TODO: jon 2024-02-20 Eliminar después de testing
                System.out.printf("push(%c)\n", c);
            } else {
                int indice = simbolosCierre.indexOf(c);
                if(indice >=0){
                    String dato = pila.pop();
                    if (dato == null) {
                        return false;
                    }
                    String apertura = simbolosApertura.substring(indice,indice + 1);
                    if(!dato.equals(apertura)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
