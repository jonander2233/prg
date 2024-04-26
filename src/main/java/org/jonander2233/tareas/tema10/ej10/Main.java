package org.jonander2233.tareas.tema10.ej10;

import org.jonander2233.lib_personal.Menu;

public class Main {
    public static void main (String[]args){
        String[] opciones = new String[]{"Nuevo empleado","Nuevo hijo","Modificar sueldo","Borrar empleado","Borrar hijo","Consultas"};
        int seleccion = Menu.mostrar("GESTION EMPLEADOS",opciones,"Salir");
        boolean salir = false;
        do{
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
                case 6:
                    break;
                default:
                    break;
            }
        }while (!salir);
    }
    private static void menu2(){
        String[] opciones = new String[]{"Buscar por NIF","Buscar por nombre","Buscar por rango de edad","Buscar por rango de sueldo","Buscar por hijos menores de edad"};
        int seleccion = Menu.mostrar("CONSULTAS EMPLEADOS",opciones,"Volver al menu principal");
        boolean salir = false;
        do{
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

    public static void nuevoEmpleado(){

    }
}
