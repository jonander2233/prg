package org.jonander2233.tareas.tareas_t07.ej03;

import org.jonander2233.lib_personal.Eys;
import org.jonander2233.lib_personal.Menu;

public class Ej03 {
    public static void ej03(){
        String [] opcionesMenu1 = new String[]{"Nuevo alumno","Baja de alumno","Consultas"};
        String [] opcionesMenu2 = new String[]{"Por grupo","Por edad","Por nia","Por apellidos"};
        int respuestamenu1=0;
        int respuestamenu2=0;
        do{
            respuestamenu1 = Menu.mostrar("GESTION ALUMNOS",opcionesMenu1);
            switch (respuestamenu1){
                case 1:
                    System.out.println("a");
                    break;
                case 2:
                    System.out.println("aa");
                    break;
                case 3:
                    do{
                    respuestamenu2 = Menu.mostrar("CONSULTAS",opcionesMenu2);

                    }while (respuestamenu2!=0);
                    break;
                default:
            }
        }while (respuestamenu1 !=0);

    }

}