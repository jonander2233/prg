package ejercicios.ej07;

import java.util.Arrays;
import java.util.Date;

public class Atencion {
    private static final int POSICION_TEMPERATURA = 0;
    private static final int POSICION_PPM = 1;
    private static final int POSICION_TENSION_SISTOLICA = 2;
    private static final int POSICION_TENSION_DIASTOLICA = 3;
    private final Date fechaEntrada;
    private final String sintomatologia;
    private double[] preRev;
    private Date fechaAlta;
    private String motivoAlta;
    private final Paciente paciente;

    public Atencion(Paciente paciente, Date fechaEntrada, String sintomatologia) {
        this.fechaEntrada = fechaEntrada;
        this.sintomatologia = sintomatologia;
        this.paciente = paciente;
        preRev = null;

    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }
    public void setConstantesVitales(double temperatura, double ppm, double tensionSistolica, double tensionDiastolica){
        preRev = new double[4];
        setTemeratura(temperatura);
        setPPM(ppm);
        setTensionSistolica(tensionSistolica);
        setTensionDiastolica(tensionDiastolica);

    }

    public String getSintomatologia() {
        return sintomatologia;
    }
//__________________________________________________________________________________________
    private double getTemperatura(){
        if (preRev == null)
            return -1;
        return preRev[POSICION_TEMPERATURA];
    }
    private void setTemeratura(double temperatura){

        preRev[POSICION_TEMPERATURA]= temperatura;

    }
    private double getPPM () {
        if (preRev == null)
            return -1;
        return preRev [POSICION_PPM];
    }
    private void setPPM (double ppm){
        preRev[POSICION_PPM] = ppm;
    }
    private double getTensionSistolica () {
        if (preRev == null)
            return -1;
        return preRev [POSICION_TENSION_SISTOLICA];
    }
    private void setTensionSistolica (double tensionSis){
        preRev[POSICION_TENSION_SISTOLICA] = tensionSis;
    }
    private double getTensionDiastolica () {
        if (preRev == null)
            return -1;
        return preRev [POSICION_TENSION_DIASTOLICA];
    }
    private void setTensionDiastolica (double tensionDia){
        preRev[POSICION_TENSION_DIASTOLICA] = tensionDia;
    }
//______________________________________________________________________________

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public String getMotivoAlta() {
        return motivoAlta;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    public void altaPaciente(Date fechaAlta,String motivoAlta){
        this.fechaAlta = fechaAlta;
        this.motivoAlta = motivoAlta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Atencion atencion = (Atencion) o;

        if (!fechaEntrada.equals(atencion.fechaEntrada)) return false;
        return paciente.equals(atencion.paciente);
    }

    @Override
    public int hashCode() {
        int result = fechaEntrada.hashCode();
        result = 31 * result + paciente.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Atencion{" +
                "fechaEntrada=" + fechaEntrada +
                ", sintomatologia='" + sintomatologia + '\'' +
                ", preRev=" + Arrays.toString(preRev) +
                ", fechaAlta=" + fechaAlta +
                ", motivoAlta='" + motivoAlta + '\'' +
                ", paciente=" + paciente +
                '}';
    }

}
