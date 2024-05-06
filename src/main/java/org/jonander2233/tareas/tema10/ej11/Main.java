package org.jonander2233.tareas.tema10.ej11;
import org.jonander2233.lib_personal.Menu;


public class Main {
    private static Centro centro = new Centro();
    public static void main(String[]args){
        String[] opciones = new String[]{"Gestion alumnos","Gestion profesores","Gestion asignaturas","Gestion grupos","Gestion aulas","Consultas"};
        boolean salir = false;
        do{
            int seleccion = Menu.mostrar("GESTIONES",opciones,"Salir");
            switch (seleccion){
                case 0:
                    salir = true;
                    break;
                case 1:
                    menuAlumnos();
                    break;
                case 2:
                    menuProfesores();
                    break;
                case 3:
                    menuAsignaturas();
                    break;
                case 4:
                    menuGrupos();
                    break;
                case 5:
                    menuAulas();
                    break;
                case 6:
                    menuConsultas();
                    break;
                default:
                    break;
            }
        }while (!salir);
    }
    private static void menuAlumnos(){
        String[] opciones = new String[]{"Alta Alumno","Baja Alumno"};
        boolean salir = false;
        do{
            int seleccion = Menu.mostrar("GESTION ALUMNOS",opciones,"Volver al menu principal");
            switch (seleccion){
                case 0:
                    salir = true;
                    break;
                case 1:
                    if(centro.hayGrupos() && centro.hayAsignaturas()){
                        Alumno alumnoNuevo = EntradaSalida.agregarAlumno();
                        centro.addAlumno(alumnoNuevo);
                    }else{
                        EntradaSalida.errorAlumno();
                    }
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
    private static void menuProfesores(){
        String[] opciones = new String[]{"Alta profesor","Baja profesor"};
        boolean salir = false;
        do{
            int seleccion = Menu.mostrar("GESTION PROFESORES",opciones,"Volver al menu principal");
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
    private static void menuAsignaturas(){
        String[] opciones = new String[]{"Alta asignatura","Baja asignatura"};
        boolean salir = false;
        do{
            int seleccion = Menu.mostrar("GESTION ASIGNATURAS",opciones,"Volver al menu principal");
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
    private static void menuGrupos(){
        String[] opciones = new String[]{"Alta grupo","Baja grupo"};
        boolean salir = false;
        do{
            int seleccion = Menu.mostrar("GESTION GRUPOS",opciones,"Volver al menu principal");
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
    private static void menuAulas(){
        String[] opciones = new String[]{"Alta aula","Baja aula"};
        boolean salir = false;
        do{
            int seleccion = Menu.mostrar("GESTION AULA",opciones,"Volver al menu principal");
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
    private static void menuConsultas(){
        String[] opciones = new String[]{"Por profesor","Por grupo"};
        boolean salir = false;
        do{
            int seleccion = Menu.mostrar("CONSULTAS",opciones,"Volver al menu principal");
            switch (seleccion){
                case 0:
                    salir = true;
                    break;
                case 1:
                    //consultar alumno por profesor
                    break;
                case 2:
                    //consultar alumno por grupo
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

