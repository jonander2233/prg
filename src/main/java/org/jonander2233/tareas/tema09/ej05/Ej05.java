package org.jonander2233.tareas.tema09.ej05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej05 {
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
        preguntarEdad(al1);
        preguntarAltura(al1);

        System.out.println("indica el nombre segundo alumno");
        preguntarAltura(al2);
        preguntarEdad(al2);

    }
    private static void preguntarEdad(Alumno al){
        Scanner lector = new Scanner(System.in);
        boolean valido = false;
        System.out.println("ingrese la edad del alumno");
        do{
            try {
                al.setEdad(lector.nextInt());
                valido = true;
            }catch (InputMismatchException ime){
                System.out.println("caracter invalido");
            }
        }while (!valido);

        lector.close();
    }
    private static void preguntarAltura(Alumno al){
        Scanner lector = new Scanner(System.in);
        boolean valido = false;
        float altura;
        System.out.println("ingrese la altura del alumno");
        do{
            try {
                al.setAltura(lector.nextFloat());
                valido = true;
            }catch (InputMismatchException ime){
                System.out.println("caracter invalido");

            }
        }while (!valido);

        lector.close();
    }
}
