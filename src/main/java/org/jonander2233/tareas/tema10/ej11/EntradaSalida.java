package org.jonander2233.tareas.tema10.ej11;

import org.jonander2233.lib_personal.Eys;

public class EntradaSalida {
    private static final int NOMBRE_MIN = 1;
    private static final int NOMBRE_MAX = 10;
    public static Alumno agregarAlumno(){
        String nombre = Eys.imprimirYLeer("Dime el nombre del alumno",NOMBRE_MIN,NOMBRE_MAX);
        //todo funcion para elegir un grupo por nombre, en caso de no existir ninguno, informar y salir
        return null;
    }
    public static void errorAlumno(){
        System.out.println("No se puede crear el alumno");
    }
}

