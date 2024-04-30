package org.jonander2233.tareas.tema10.ej10;

import org.jonander2233.lib_personal.Eys;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Empresasa {
    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    private int sueldo_min = 1134;

    public Empresasa() {
    }

    public Empresasa(int sueldo_min) {
        this.sueldo_min = sueldo_min;
    }
    public Empleado borrarEmpleado(Empleado empleado){
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if(empleado == listaEmpleados.get(i)){
                empleado = listaEmpleados.remove(i);
                return empleado;
            }
        }
        return null;
    }
    public void modificarSueldo(Empleado empleado, double sueldo){
        empleado.setSueldo(sueldo);

    }
    public void nuevoHijo(Empleado empleado,String nombreHijo,Date fechanacHijo){
            empleado.addHijo(nombreHijo,fechanacHijo);
    }

    public Empleado empleadoExiste(String dni){
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if(dni.equals(listaEmpleados.get(i).getDni())){
                return listaEmpleados.get(i);
            }
        }
        return null;
    }

    public void nuevoEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }

    public boolean borrarHijo(Empleado empleado, Hijo hijo){
        return empleado.borrarHijo(hijo);
    }
    public Empleado buscarEmpleadoNombre(String nombre){
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if(listaEmpleados.get(i).getNombre().equals(nombre)){
                return listaEmpleados.get(i);
            }
        }
        return null;
    }
    public String datosEmpleado(Empleado empleado){
        return "Empleado " + empleado.getNombre() + " " + empleado.getApellidos() +": \n -DNI: " +
                empleado.getDni() + "\n -Sueldo: " + empleado.getSueldo() + "\n -Fecha nacimiento: " +
                empleado.getFechaNac() + "\n -Cantidad de hijos: " + empleado.getCantidadHijos();

    }
}
