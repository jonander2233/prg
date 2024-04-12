package org.jonander2233.tareas.tema09.ej05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej05 {
    private static Scanner lector = new Scanner(System.in);

    public static void ex(){
        Alumno al1 = new Alumno();
        Alumno al2 = new Alumno();
        preguntarAl(al1,al2);
        System.out.println(al1.toString());
        System.out.println(al2.toString());
        if(al1.getAltura() > al2.getAltura()){
            System.out.println("El alumno"+ al1.getNombre() +" es mayor");
        }else {
            System.out.println("El alumno"+ al2.getNombre() +" es mayor");
        }
    }

    private static void preguntarAl (Alumno al1,Alumno al2){
        boolean valido = false;
        System.out.println("indica el nombre primer alumno");
        al1.setNombre(lector.nextLine());
        preguntarEdad(al1);
        preguntarAltura(al1);

        System.out.println("indica el nombre segundo alumno");
        al2.setNombre(lector.nextLine());
        preguntarEdad(al2);
        preguntarAltura(al2);

    }
    private static void preguntarEdad(Alumno al){

        boolean valido = false;
        int edad;
        System.out.println("ingrese la edad del alumno");
        do{
            try {
                edad = Integer.parseInt(lector.nextLine());
                al.setEdad(edad);
                valido = true;
            }catch (NumberFormatException nfe){
                System.out.println("caracter invalido");
            }
        }while (!valido);

    }
    private static void preguntarAltura(Alumno al){
        boolean valido = false;
        float altura;
        System.out.println("ingrese la altura del alumno");
        do{
            try {
                al.setAltura(Float.parseFloat(lector.nextLine()));
                valido = true;
            }catch (NumberFormatException nfe){
                System.out.println("caracter invalido");

            }
        }while (!valido);
    }
}
