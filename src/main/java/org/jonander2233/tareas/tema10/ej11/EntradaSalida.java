package org.jonander2233.tareas.tema10.ej11;

import org.jonander2233.lib_personal.Eys;

public class EntradaSalida {
    private static final int NOMBRE_MIN = 1;
    private static final int NOMBRE_MAX = 10;
    private static final int DNI_MAX = 10;
    private static final int DNI_MIN = 8;
    private static final int SUELDO_MIN = 1050;
    private static final int SUELDO_MAX = 999999999;
    private static final int IDENTIFICADOR_MIN = 8;
    private static final int IDENTIFICADOR_MAX = 10;

    public static Asignatura agregarAsignatura() {
        String id = Eys.imprimirYLeer("Indique el identificador de la asignatura",IDENTIFICADOR_MIN,IDENTIFICADOR_MAX);
        String nombre = Eys.imprimirYLeer("Dime el nombre de la asignatura",NOMBRE_MIN,NOMBRE_MAX);
        return new Asignatura(id,nombre);
    }
    public static Alumno agregarAlumno(){
        String nombre = Eys.imprimirYLeer("Dime el nombre del alumno",NOMBRE_MIN,NOMBRE_MAX);
        return new Alumno(nombre);
    }
    public static Profesor agregarProfesor(){
        String nombre = Eys.imprimirYLeer("Dime el nombre del profesor",NOMBRE_MIN,NOMBRE_MAX);
        String dni = Eys.imprimirYLeer("Dime el dni del profesor",DNI_MIN,DNI_MAX);
        int sueldo = Eys.imprimirYLeerInt("Indica el Sueldo del profesor",SUELDO_MIN,SUELDO_MAX);
        return new Profesor(dni,nombre,sueldo);
    }

    public static boolean borrarAlumno(){
        return true;
    }

    public static void errorCrearAlumno(){
        System.out.println("No se puede crear el alumno");
    }

    public static void errorBorrarAlumno(){
        System.out.println("No se puede borrar el alumno");
    }
}

