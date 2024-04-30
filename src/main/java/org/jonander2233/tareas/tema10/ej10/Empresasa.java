package org.jonander2233.tareas.tema10.ej10;

import org.jonander2233.lib_personal.Eys;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Empresasa {
    private ArrayList<Empleado> ep = new ArrayList<>();
    private int sueldo_min = 1134;

    public Empresasa() {
    }

    public Empresasa(int sueldo_min) {
        this.sueldo_min = sueldo_min;
    }
    public Empleado borrarEmpleado(Empleado empleado){
        for (int i = 0; i < ep.size(); i++) {
            if(empleado == ep.get(i)){
                empleado = ep.remove(i);
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
    public boolean borrarHijo(Empleado empleado, Hijo hijo){
        return empleado.borrarHijo(hijo);
    }
}
