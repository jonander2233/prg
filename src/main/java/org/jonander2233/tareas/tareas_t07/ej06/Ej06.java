package org.jonander2233.tareas.tareas_t07.ej06;

import org.jonander2233.lib_personal.Menu;

public class Ej06 {
    public static void ej06(){
        int seleccionMenu1;
        int seleccionMenu2;
        String [] opcionesMenu1 = new String[]{"Anadir bicicleta","Vender bicicleta","Consultar bicicleta","Mostrar stock"};
        String [] opcionesMenu2 = new String[]{"Consultar por referencia","Consultar por marca","Consultar por modelo"};

        do{
            seleccionMenu1 = Menu.mostrar("GESTION DE BICICLETAS",opcionesMenu1);
            switch (seleccionMenu1){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    do{
                        seleccionMenu2 = Menu.mostrar("CONSULTA BICICLETA",opcionesMenu2);
                        switch (seleccionMenu2){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                    }while (seleccionMenu2 !=0);
                    break;
                default:
                    break;
            }
        }while (seleccionMenu1 !=0);
    }

}
