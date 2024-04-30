package org.jonander2233.tareas.tema10.ej10;

import org.jonander2233.lib_personal.Eys;
import org.jonander2233.lib_personal.Menu;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Main {

    public static void main (String[]args){
        Empresasa ep = new Empresasa(1134);
        String[] opciones = new String[]{"Nuevo empleado","Nuevo hijo","Modificar sueldo","Borrar empleado","Borrar hijo","Consultas"};
        Empleado test = new Empleado("999999999","joaquin","mendoza",new Date(80,10,22),1200);
        test.addHijo("carlos",new Date(107,10,19));
        ep.nuevoEmpleado(test);
        boolean salir = false;
        do{
            int seleccion = Menu.mostrar("GESTION EMPLEADOS",opciones,"Salir");
            switch (seleccion){
                case 0:
                    salir = true;
                    break;
                case 1:
                    ep.nuevoEmpleadoEyS();
                    break;
                case 2:
                    ep.nuevoHijo();
                    break;
                case 3:
                    ep.modificarSueldo();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
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


}
