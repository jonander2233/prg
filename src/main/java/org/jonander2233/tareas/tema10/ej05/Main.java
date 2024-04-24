package org.jonander2233.tareas.tema10.ej05;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main (String[]args){
        EstadisticasPaciente ep = new EstadisticasPaciente();
        ArrayList<Paciente> arrayP = new ArrayList<>();

        Paciente paciente1 = new Paciente("marta",new Date(1980,02,12),'F',1.63,57);
        Paciente paciente2 = new Paciente("carla",new Date(1990,03,07),'F',1.74,60.5);
        Paciente paciente3 = new Paciente("lucia",new Date(1967,03,20),'F',1.62,50.8);
        Paciente paciente4 = new Paciente("pedro",new Date(1972,04,20),'M',1.78,72.5);
        Paciente paciente5 = new Paciente("julio",new Date(1960,02,29),'M',1.8,85.2);

        arrayP.add(paciente1);
        arrayP.add(paciente2);
        arrayP.add(paciente3);
        arrayP.add(paciente4);
        arrayP.add(paciente5);

        int[] mm  = ep.majorMenor(arrayP);

        Paciente pacienteMayor = arrayP.get(mm[1]);
        Paciente pacienteMenor = arrayP.get(mm[0]);

        System.out.println("PACIENTE MAYOR Edad: " + ep.calcularEdad(pacienteMayor) + " Sexo: " + pacienteMayor.getSexo());
        System.out.println("PACIENTE MENOR Edad: " + ep.calcularEdad(pacienteMenor) + " Sexo: " + pacienteMenor.getSexo());
        System.out.println("cantidad de pacientes por sexos:");
        int[] ps = ep.pacientsPerSexe(arrayP);

        System.out.println("Hombres: " + ps[0] + " Mujeres: "+ ps[1]);

        for (int i = 0; i < arrayP.size(); i++) {
            System.out.println("Paciente numero " + (i+1) + ": " + ep.mensajeIMC(arrayP.get(i)));
        }

    }
}
