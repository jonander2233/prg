package org.jonander2233.tareas.tema10.ej10;

import org.jonander2233.lib_personal.Eys;
import org.jonander2233.lib_personal.Menu;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Main {
    private static Empresasa empr = new Empresasa(1134);
    private static final int SUELDO_MIN = 1134;
    private static final int SUELDO_MAX = 999999999;
    private static String dni;
    private static String nombreHijo;
    public static void main (String[]args){
        String[] opciones = new String[]{"Nuevo empleado","Nuevo hijo","Modificar sueldo","Borrar empleado","Borrar hijo","Consultas"};
        Empleado test = new Empleado("999999999","joaquin","mendoza",new Date(80,10,22),1200);
        test.addHijo("carlos",new Date(107,10,19));
        empr.nuevoEmpleado(test);
        boolean salir = false;
        do{
            int seleccion = Menu.mostrar("GESTION EMPLEADOS",opciones,"Salir");
            switch (seleccion){
                case 0:
                    salir = true;
                    break;
                case 1:
                    nuevoEmpleado();
                    break;
                case 2:
                    nuevoHijo();
                    break;
                case 3:
                    modificarSueldo();
                    break;
                case 4:
                    borrarEmpleado();
                    break;
                case 5:
                    borrarHijo();
                    break;
                case 6:
                    menu2();
                    break;
                default:
                    break;
            }
        }while (!salir);
    }
    private static void menu2(){
        String[] opciones = new String[]{"Buscar por NIF","Buscar por nombre","Buscar por rango de edad","Buscar por rango de sueldo","Buscar por hijos menores de edad"};
        boolean salir = false;
        do{
            int seleccion = Menu.mostrar("CONSULTAS EMPLEADOS",opciones,"Volver al menu principal");
            switch (seleccion){
                case 0:
                    salir = true;
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }while (!salir);
    }

    private static Empleado verificarEmpleado(){
        dni = Eys.imprimirYLeer("Indique el DNI del empleado",8,10);
        Empleado empleado = empr.empleadoExiste(dni);
        if( empleado == null){
            System.out.println("El empleado no existe!");
            return null;
        }else {
            return empleado;
        }
    }

    private static Hijo verificarHijo(Empleado empleado){
        nombreHijo = Eys.imprimirYLeer("Indique el nombre del hijo",1,20);
        if(empleado.buscarHijo(nombreHijo)!= null){
            return empleado.buscarHijo(nombreHijo);
        }
        System.out.println("El hijo no existe!\n");
        return null;
    }

    private static void borrarHijo(){
        Empleado empleado = verificarEmpleado();
        if(empleado == null){
            return;
        }else {

            if(verificarHijo(empleado)==null){
                return;
            }else{
                empleado.borrarHijo(empleado.buscarHijo(nombreHijo));
                System.out.println("hijo borrado con exito!\n");
            }
        }
    }

    private static void borrarEmpleado(){
        Empleado empleado = verificarEmpleado();
        if(empleado == null){
            return;
        }else {
            empr.borrarEmpleado(empleado);
            System.out.println("Empleado borrado con exito!\n");
        }

    }

    private static void nuevoHijo(){
        Empleado empleado = verificarEmpleado();
        if(empleado != null){
            String nombreHijo = Eys.imprimirYLeer("Indique nombre del hijo",1,20);
            Date fechanacHijo = Eys.imprimirYLeerDate("Indique la fecha de nacimiento de" + nombreHijo,"dd-MM-yyyy");
            empr.nuevoHijo(empleado,nombreHijo,fechanacHijo);
        }
    }

    private static void modificarSueldo(){
            Empleado empleado = verificarEmpleado();
            if(empleado != null){
                double sueldo = Eys.imprimirYLeerDouble("Indique el nuevo sueldo");
                empr.modificarSueldo(empleado,sueldo);
            }

    }

    public static void nuevoEmpleado(){
        Empleado empleado = verificarEmpleado();
        if(empleado != null){
            return;
        }

        String nombre = Eys.imprimirYLeer("Indique nombre del empleado",1,20);
        String apellidos = Eys.imprimirYLeer("Indique los apellidos del empleado",1,20);
        Date fechanac = Eys.imprimirYLeerDate("Indique la fecha de nacimiento del empleado","dd-MM-yyyy");
        int sueldo = Eys.imprimirYLeerInt("Indique el sueldo del empleado",SUELDO_MIN,SUELDO_MAX);
        boolean tieneHijos = Eys.ImprimirYleerCharSN("El empleado tiene hijos?");

        Empleado empleadoNuevo = new Empleado(dni,nombre,apellidos,fechanac,sueldo);

        int cantidadHijos = Eys.imprimirYLeerInt("Cuantos hijos tiene el empleado?",0,10);
        dni = null;
        if(cantidadHijos == 0){
            return;
        }

        for (int i = 1; i <= cantidadHijos ; i++) {
            String nombreHijo = Eys.imprimirYLeer("Indique nombre del hijo nº" + i,1,20);
            Date fechanacHijo = Eys.imprimirYLeerDate("Indique la fecha de nacimiento del hijo nº" + i,"dd-MM-yyyy");
            empleadoNuevo.addHijo(nombreHijo,fechanacHijo);
        }
        empr.nuevoEmpleado(empleadoNuevo);
    }
}
