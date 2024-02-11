package ejercicios.ej07;
import java.util.Date;


public class Paciente {
    public enum Genero{
        HOMBRE, MUJER, OTRO
    }
    private String sip;
    private final String nombre;
    private final Genero genero;
    private final Date fechaNacimiento;

    public Paciente(String sip, String nombre, Genero genero, Date fechaNacimiento) {
        this.sip = sip;
        this.nombre = nombre;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSip() {
        return sip;
    }

    public String getNombre() {
        return nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "sip='" + sip + '\'' +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paciente paciente = (Paciente) o;

        return sip.equals(paciente.sip);
    }

    @Override
    public int hashCode() {
        return sip.hashCode();
    }
}
