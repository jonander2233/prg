package org.jonander2233.tareas.tareas_t07.ej07;

import java.util.Date;

public class Centro {
    private int indice;
    Paciente[] pacientes;

    public Centro(int cantidadPacientes) {
        this.indice = 0;
        pacientes = new Paciente[cantidadPacientes];
    }

    public void anyadirPaciente(String sip, String nombre, Date fechaNacimiento, Paciente.Sexo sexo){
        Paciente nuevo = new Paciente(sip,nombre,fechaNacimiento,sexo);

    }
}
