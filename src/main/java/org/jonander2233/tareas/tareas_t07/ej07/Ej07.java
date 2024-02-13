package org.jonander2233.tareas.tareas_t07.ej07;

import org.jonander2233.lib_personal.Menu;

public class Ej07 {
    public static void ej06() {
        String[] opcionesmenu1 = new String[]{"Nuevo paciente", "Atender paciente", "Consultas", "Alta medica"};
        String[] opcionesmenu2 = new String[]{"Por Sip", "Por fechas", "Estadisticas", "Mostrar historico mensual"};
        int seleccionMenu1;
        do {
            seleccionMenu1 = Menu.mostrar("URGENCIAS", opcionesmenu1, "Salir");
            switch (seleccionMenu1) {
                case 1:
                    nuevoPaciente();
                    break;
                case 2:
                    break;
                case 3:
                    int seleccionMenu2 = Menu.mostrar("CONSULTAS", opcionesmenu2, "Volver al menu principal");
                    metodoSwtichCaseMenu2(seleccionMenu2);
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        } while (seleccionMenu1 != 0);
    }

    private static void metodoSwtichCaseMenu2 (int opcion){
        do{
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        } while (opcion != 0);
    }
    private static void nuevoPaciente(){
        String[] sexo = new String[]{"", "Por fechas", "Estadisticas", "Mostrar historico mensual"};

        //        Paciente.sexo sexo = new Paciente.sexo();
        String sip;
        String nombre;

    }
}
