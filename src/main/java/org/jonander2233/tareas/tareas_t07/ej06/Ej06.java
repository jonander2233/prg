package org.jonander2233.tareas.tareas_t07.ej06;
import org.jonander2233.lib_personal.Eys;
import org.jonander2233.lib_personal.Menu;

public class Ej06 {
    private static int MAXIMA_REFERENCIA = 999999999;
    private static Almacen almacen = new Almacen(50);
    public static void ej06(){
        int seleccionMenu1;
        int seleccionMenu2;
        String [] opcionesMenu1 = new String[]{"Anadir bicicleta","Vender bicicleta","Consultar bicicleta","Mostrar stock"};
        String [] opcionesMenu2 = new String[]{"Consultar por referencia","Consultar por marca","Consultar por modelo"};

        do{
            seleccionMenu1 = Menu.mostrar("GESTION DE BICICLETAS",opcionesMenu1,"salir");
            switch (seleccionMenu1){
                case 1:
                    anyadirBicicleta();
                    break;
                case 2:
                    venderBicicleta();
                    break;
                case 3:
                    do{
                        seleccionMenu2 = Menu.mostrar("CONSULTA BICICLETA",opcionesMenu2,"volver al menu principal");
                        switch (seleccionMenu2){
                            case 1:
                                consultarBicicletaRef();
                                break;
                            case 2:
                                consultarBicicletaMarca();
                                break;
                            case 3:
                                consultarBicicletaModelo();
                                break;
                        }
                    }while (seleccionMenu2 !=0);
                    break;
                case 4:
                    mostrarStock();
                    break;
                default:
                    break;
            }
        }while (seleccionMenu1 !=0);
    }

    private static void mostrarStock(){
        almacen.mostrarStockBicicletas();
    }

    private static void consultarBicicletaMarca(){
        String marca = Eys.imprimirYLeer("introduce la marca o escribe salir.", 0, 10);
        if (!marca.equals("salir")) {
            Bicicleta[] arrayBicicletasDeEstaMarca = almacen.buscarPorMarca(marca);
            if (arrayBicicletasDeEstaMarca == null || arrayBicicletasDeEstaMarca.length == 0) {
                Eys.imprimir("No se encontraron bicicletas con la marca introducida.");
            } else {
                for (int i = 0; i < arrayBicicletasDeEstaMarca.length; i++) {
                    System.out.println(arrayBicicletasDeEstaMarca[i].toString());
                }
            }
        }
    }
    private static void consultarBicicletaModelo(){
        String modelo = Eys.imprimirYLeer("introduce el modelo o escribe salir.", 0, 10);
        if (!modelo.equals("salir")) {
            Bicicleta[] arrayBicicletasDeEstaModelo = almacen.buscarPorModelo(modelo);
            if (arrayBicicletasDeEstaModelo == null || arrayBicicletasDeEstaModelo.length == 0) {
                Eys.imprimir("No se encontraron bicicletas con el modelo introducido.");
            } else {
                for (int i = 0; i < arrayBicicletasDeEstaModelo.length; i++) {
                    System.out.println(arrayBicicletasDeEstaModelo[i].toString());
                }
            }
        }
    }

    private static void venderBicicleta(){
        int ref;
        do {
            ref = Eys.imprimirYLeerInt("introduce el numero de referencia o presione 0 para salir.", 0, MAXIMA_REFERENCIA);
            if (ref != 0){
                if (almacen.buscarPorRef(ref) == null) {
                    Eys.imprimir("la referencia no existe!");
                }
            }
        }while ( ref != 0 && almacen.buscarPorRef(ref)== null );
        if ( ref !=0 ) {
            int cantidad;
            cantidad = Eys.imprimirYLeerInt("cuantas se van a vender?(max: " + almacen.getExistencias(ref) + ")", 1, almacen.getExistencias(ref));
            boolean correcto = almacen.venderBicicleta(ref, cantidad);
            Eys.imprimir("bicicleta vendida correctamente");
        }
    }



    private static void consultarBicicletaRef() {
        int ref = Eys.imprimirYLeerInt("introduce la referencia o presione 0 para salir",0,MAXIMA_REFERENCIA);
        if (ref!=0){
            Bicicleta bicicleta = almacen.buscarPorRef(ref);
            if(bicicleta == null){
                Eys.imprimir("la referencia introducida no es valida");
            }else {
                System.out.println(bicicleta.toString());
            }
        }

    }


    private static void anyadirBicicleta() {
        char seleccion;
        int ref = Eys.imprimirYLeerInt("Introduzca la referencia",1,MAXIMA_REFERENCIA);
        Bicicleta bicicleta  = almacen.buscarPorRef(ref);
        if(bicicleta == null){
            System.out.println("la referencia introducida no existe, añadir ahora? S/N");
            seleccion = Eys.leerChar();
            if (seleccion == 'S'){
                // Solicitar y validar datos de la bicicleta
                String marca = Eys.imprimirYLeerConExclusion("¿Que marca es?", 2, 20,"salir");
                String modelo = Eys.imprimirYLeer("¿Que modelo es?",2,20);
                String pesoKg = Eys.imprimirYLeer("¿Cuanto pesa?",2,20);
                String tamanoRuedas = Eys.imprimirYLeer("¿Que tamano tienen las ruedas (en pulgadas)?",2,10);
                boolean tieneMotor;
                tieneMotor = Eys.ImprimirYleerCharSN("¿Tiene motor?");
                String fechaFabr = Eys.imprimirYLeer("¿Cuando se ha fabricado?",2,10);
                double precio = Eys.imprimirYLeerDouble("¿Que precio tiene?");
                int nExistencias = Eys.imprimirYLeerInt("cuantas quieres añadir?",1,9999);
                almacen.crearBicicleta(marca,modelo,pesoKg,tamanoRuedas,tieneMotor,fechaFabr,precio,nExistencias);
            }
        } else {
            int cantidad = Eys.imprimirYLeerInt("Cuantas quieres añadir?",1,9999999);
            bicicleta.addExistencia(cantidad);
        }
    }
}
