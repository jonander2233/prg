package org.jonander2233.tareas.tema10.ej05;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main (String[]args){
        EstadisticasPaciente ep = new EstadisticasPaciente();
        ArrayList<Paciente> arrayP = new ArrayList<>();
        try{
            Paciente paciente1 = new Paciente("marta","12/02/1980",'F',1.63,57);
            Paciente paciente2 = new Paciente("carla","07/03/1990",'F',1.74,60.5);
            Paciente paciente3 = new Paciente("lucia","20/03/1967",'F',1.62,50.8);
            Paciente paciente4 = new Paciente("pedro","20/04/1972",'M',1.78,72.5);
            Paciente paciente5 = new Paciente("julio","29/02/1960",'M',1.8,85.2);
            arrayP.add(paciente1);
            arrayP.add(paciente2);
            arrayP.add(paciente3);
            arrayP.add(paciente4);
            arrayP.add(paciente5);

        }catch (ParseException pe){
            System.out.println("error");
        }

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
