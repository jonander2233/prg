package org.jonander2233.tareas.tema10.ej10;

import org.jonander2233.lib_personal.Eys;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Empresasa {
    private ArrayList<Empleado> ep = new ArrayList<>();
    private int sueldo_min = 1134;
    private int sueldo_max = 999999999;

    public Empresasa() {
    }

    public Empresasa(int sueldo_min) {
        this.sueldo_min = sueldo_min;
    }

    public void modificarSueldo(){
        String dni = Eys.imprimirYLeer("Indique el DNI del empleado",8,10);
        Empleado empleado = empleadoExiste(dni);
        if (empleado == null){
            System.out.println("no existe");
            return;
        }
        empleado.setSueldo(Eys.imprimirYLeerDouble("Indique el nuevo sueldo"));
    }
    public void nuevoHijo(){
        String dni = Eys.imprimirYLeer("Indique el DNI del empleado",8,10);
        Empleado empleado = empleadoExiste(dni);
        if (empleado == null){
            System.out.println("El empleado no existe\n");
        }else {
            String nombreHijo = Eys.imprimirYLeer("Indique nombre del hijo",1,20);
            Date fechanacHijo = Eys.imprimirYLeerDate("Indique la fecha de nacimiento de" + nombreHijo,"dd-MM-yyyy");
            empleado.addHijo(nombreHijo,fechanacHijo);
        }
    }


    private Empleado empleadoExiste(String dni){
        for (int i = 0; i < ep.size(); i++) {
            if(dni.equals(ep.get(i).getDni())){
                return ep.get(i);
            }
        }
        return null;
    }
    public void nuevoEmpleado(Empleado empleado){
        ep.add(empleado);
    }

    public void nuevoEmpleadoEyS(){
        String dni = Eys.imprimirYLeer("Indique el DNI del empleado",9,9);
        boolean existe = false;
        if(!ep.isEmpty()){
            for (Empleado empleado : ep) {
                if (Objects.equals(empleado.getDni(), dni)) {
                    System.out.println("El empleado ya existe");
                    existe = true;
                    break;
                }
            }
        }
        if (existe){
            return;
        }
        String nombre = Eys.imprimirYLeer("Indique nombre del empleado",1,20);
        String apellidos = Eys.imprimirYLeer("Indique los apellidos del empleado",1,20);
        Date fechanac = Eys.imprimirYLeerDate("Indique la fecha de nacimiento del empleado","dd-MM-yyyy");
        int sueldo = Eys.imprimirYLeerInt("Indique el sueldo del empleado",sueldo_min,sueldo_max);
        boolean tieneHijos = Eys.ImprimirYleerCharSN("El empleado tiene hijos?");
        Empleado nuevo = new Empleado(dni,nombre,apellidos,fechanac,sueldo);

        if(!tieneHijos){
            ep.add(nuevo);
            return;
        }
        int cantidadHijos = Eys.imprimirYLeerInt("Cuantos hijos tiene el empleado?",0,10);
        if(cantidadHijos == 0){
            ep.add(nuevo);
            return;
        }
        for (int i = 1; i <= cantidadHijos ; i++) {
            String nombreHijo = Eys.imprimirYLeer("Indique nombre del hijo nº" + i,1,20);
            Date fechanacHijo = Eys.imprimirYLeerDate("Indique la fecha de nacimiento del hijo nº" + i,"dd-MM-yyyy");
            nuevo.addHijo(nombreHijo,fechanacHijo);
        }
        ep.add(nuevo);
    }
}
