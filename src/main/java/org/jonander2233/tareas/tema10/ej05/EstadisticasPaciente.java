package org.jonander2233.tareas.tema10.ej05;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

public class EstadisticasPaciente implements IEstadisticasPaciente{
    @Override
    public int[] majorMenor(List<Paciente> pacientes) {
        int[] array = new int[2];
        int fechaPacienteAnterior=0;
        int edadPacienteActual;
        //bucle paciente más viejo
        for (int i = 0; i < pacientes.size(); i++) {
            edadPacienteActual = calcularEdad(pacientes.get(i));
            if(edadPacienteActual > fechaPacienteAnterior ){
                edadPacienteActual = fechaPacienteAnterior;
            }
        }
        array[1] = fechaPacienteAnterior;
        //bulce paciente más jóven
        for (int i = 0; i < pacientes.size(); i++) {
            edadPacienteActual = calcularEdad(pacientes.get(i));
            if(edadPacienteActual < fechaPacienteAnterior ){
                edadPacienteActual = fechaPacienteAnterior;
            }
        }
        array[0] = fechaPacienteAnterior;
        return array;
    }

    @Override
    public int[] pacientsPerSexe(List<Paciente> pacientes) {
        int[] array = new int[2];
        int mujeres=0;
        int hombres=0;
        char sexo;
        for (int i = 0; i < pacientes.size(); i++) {
            sexo = pacientes.get(i).getSexo();
            sexo=Character.toLowerCase(sexo);
            if(sexo == 'f'){
                mujeres++;
            } else if (sexo == 'm') {
                hombres++;
            }
        }
        array[0] = hombres;
        array[1] = mujeres;
        return array;
    }

    @Override
    public double calcularIMC(Paciente paciente) {
        double imc = paciente.getPesoEnKg() / (paciente.getAlturaEnMetros()* paciente.getAlturaEnMetros());
        return imc;
    }

    @Override
    public String mensajeIMC(Paciente paciente) {
        double num = calcularIMC(paciente);
        String mensaje;
        if(num >29.9){
            mensaje = "Sobrepeso grado III";
        } else if (num >27) {
            mensaje = "Sobrepeso grado II";
        } else if (num > 25) {
            mensaje = "Sobrepeso grado I";
        } else if (num > 18.5){
            mensaje = "Peso normal";
        } else if (num > 0) {
            mensaje = "Peso insuficiente";
        } else {
            mensaje = "Error";
        }
        return mensaje;
    }

    @Override
    public int calcularEdad(Paciente paciente) {
        Date fechaNac = paciente.getFechaNacimiento(); //obtengo Date del paciente
        LocalDate localDateFechaNac = fechaNac.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); //convierto el date del paciente en localDate
        LocalDate localDate = LocalDate.now(); //obtengo el LocalDate actual
        int edad = Period.between(localDateFechaNac,localDate).getYears(); //comparo los dos localDate para conseguir la edad en años
        return edad;
    }
}
