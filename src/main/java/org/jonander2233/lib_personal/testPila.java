//package org.jonander2233.lib_personal;
//import java.util.Random;
//import java.util.Scanner;
//
//public class testPila {
//    public static void main(String[] args) {
//        Pila pila = new Pila(5);
//        Random rnd = new Random();
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < 80; i++) {
//            String dato = String.valueOf(rnd.nextInt(65, 90));
//            if (rnd.nextBoolean()) {
//                System.out.print(dato);
//                pila.push(dato);
//            } else {
//                dato = pila.pop();
//                if(dato != null) {
//                    sb.append(dato);
//                }
//            }
//        }
//        System.out.println();
//        System.out.println(sb.toString());
//    }
//    Pila pila = new Pila(5);
//    Scanner lector = new Scanner(System.in);
//    StringBuilder sb = new StringBuilder();
//
//        while (lector.hasNext()){
//        sb.append(lector.nextLine());
//    }
//    String texto = sb.toString();
//    texto = texto.replaceAll("\\s+","");
//        System.out.println(texto);
//        for (int i = 0; i < texto.length(); i++) {
//        StringBuilder sb1 = new StringBuilder();
//        String dato;
//        char llaveAbrir = '{';
//        char llaveCerrar = '}';
//        if(texto.charAt(i)== llaveAbrir){
//            pila.push(String.valueOf(llaveAbrir));
//        }else if (texto.charAt(i)==llaveCerrar){
//            dato = pila.pop();
//            sb1.append(dato);
//        }
//    }
//        System.out.println();
//        System.out.print(sb1.toString());
//}
