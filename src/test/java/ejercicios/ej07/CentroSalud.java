package ejercicios.ej07;

import net.datafaker.Faker;

import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class CentroSalud {
    private final Paciente [] pacientes;
    private int numPacientes;
    private final Atencion [] atenciones;
    private int numAtenciones;

    public CentroSalud(int capacidadInicialPacientes, int capacidadInicialAtenciones){
        pacientes = new Paciente[capacidadInicialPacientes];
        numPacientes=0;
        atenciones = new Atencion[capacidadInicialAtenciones];
        numAtenciones=0;
//        generarDatosAleatorios(nPacientes,nAtenciones);
    }
    private void generarDatosAleatorios(int cantidadPacientes, int cantidadAtenciones){
        generarPacientesAleatorios(cantidadPacientes);
        generarAtencionesAleatorias(cantidadAtenciones);
    }
    private void generarPacientesAleatorios(int cantidadPacientes){
        Faker faker = new Faker(new Locale("es"));
        for (int i = 0; i < cantidadPacientes; i++) {
            String sip = String.format("%05d", (i+1));                   //pendiente de consultar que hace
            String nombre = faker.name().fullName();
            Paciente.Genero[] valores = Paciente.Genero.values();
            Paciente.Genero genero = valores[faker.random().nextInt(0, valores.length-1)];
            Date fechaNacimiento = faker.date().birthday(0,99);
            pacientes[numAtenciones]= new Paciente(sip,nombre,genero,fechaNacimiento);
            numPacientes++;
        }
    }
    private void generarAtencionesAleatorias(int cantidadAtenciones){
        Faker faker = new Faker(new Locale("es"));
        for (int i = 0; i < cantidadAtenciones; i++) {
            Date fechaEntrada = faker.date().past(30,0, TimeUnit.DAYS);
            Paciente paciente = pacientes[faker.random().nextInt(0,numPacientes -1)];
            String sintomatologia = faker.medical().symptoms();
            Atencion atencion = new Atencion(paciente,fechaEntrada,sintomatologia);
            if (faker.random().nextInt(100) > 100 - 40) {
                double temperatura = faker.random().nextDouble(35, 41);
                double ppm = faker.random().nextDouble(50,110);
                double tensionSistolica = faker.random().nextDouble(50,150);
                double tensionDiastolica = faker.random().nextDouble(50,150);
                atencion.setConstantesVitales(temperatura,ppm,tensionSistolica,tensionDiastolica);
                if (faker.random().nextInt(100) > 100 - 50) {
                    Date fechaAlta = fechaEntrada;
                    String motivoAlta = faker.medical().diagnosisCode();
                    atencion.altaPaciente();
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pacientes: {\n");
        for (int i = 0; i < numPacientes; i++) {
            sb.append(pacientes[i]).append("\n");
        }
    }
}
