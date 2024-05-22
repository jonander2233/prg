package org.jonander2233.tareas.tema11.ej02;

import java.util.List;

public class Poligono {
    List<Punto> vertices;

    public Poligono(List<Punto> lados) {
        vertices = lados;
    }
    public void traslada(double posX, double posY){
        for (int i = 0; i < vertices.size(); i++) {
            vertices.get(i).moverPunto(posX,posY);
        }
    }
    public int numVertices(){
        return vertices.size();
    }
    public double getPerimetro (){
        double distancia;
        double contador=0;

        for (int i = 0; i < vertices.size(); i++) {
            if(i+1 == vertices.size()){
                distancia = vertices.get(i).distancia(vertices.get(0));
            } else {
                distancia = vertices.get(i).distancia(vertices.get(i+1));
            }
            contador += distancia;
        }
        return contador;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vertices.size(); i++) {
            sb.append("Vertice " + i + " " + vertices.get(i).toString() +"\n");
        }
        sb.append("Perimetro: " + getPerimetro());
        return sb.toString();
    }
}
