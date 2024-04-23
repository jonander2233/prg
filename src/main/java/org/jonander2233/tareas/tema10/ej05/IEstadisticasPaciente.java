package org.jonander2233.tareas.tema10.ej05;
import java.util.List;

public interface IEstadisticasPaciente {
    int[] majorMenor(List<Paciente> pacientes);
    int[] pacientsPerSexe(List<Paciente> pacientes);
    double calcularIMC(Paciente paciente);
    String mensajeIMC(Paciente paciente); //this.calcularIMC
    int calcularEdad(Paciente paciente);
}
