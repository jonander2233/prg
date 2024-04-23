package org.jonander2233.tareas.tema10.ej04;

public class Main {
    public static void main(String[]args){
        Cola<Integer> cola = new Cola<>(10);
        cola.add(5);
        cola.add(8);
        cola.add(7);
        cola.add(3);
        int num = (int)cola.remove();

        System.out.println(cola.toString());
        System.out.println(cola.peek());
        System.out.println(num);
    }
}