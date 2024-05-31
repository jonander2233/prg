package org.jonander2233.tareas.tema11.ej06;
enum Plataforma{PLAYSTATION5,XBOX,NINTENDOSWITCH,PC}
public class Videojuego extends Multimedia{
    private Plataforma plataforma;

    public Videojuego(String titulo, String autor, Formato formato, int anyo, Plataforma plataforma) {
        super(titulo, autor, formato, anyo);
        this.plataforma = plataforma;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Videojuego that = (Videojuego) o;

        return plataforma == that.plataforma;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (plataforma != null ? plataforma.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "plataforma=" + plataforma +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato=" + formato +
                ", anyo=" + anyo +
                '}';
    }
}

