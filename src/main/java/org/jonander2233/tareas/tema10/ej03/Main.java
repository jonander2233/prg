package org.jonander2233.tareas.tema10.ej03;
import java.util.Stack;
public class Main {
    public static void main(String[]args){
        Pila <Integer> pila = new Pila<>(10);
        pila.push(5);
        pila.push(8);
        pila.push(7);
        pila.push(3);
        int num = (int)pila.pop();

        System.out.println(pila.toString());
        System.out.println(pila.top());
        System.out.println(num);
    }
}
