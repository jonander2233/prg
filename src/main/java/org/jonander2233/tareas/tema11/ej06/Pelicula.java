package org.jonander2233.tareas.tema11.ej06;

public class Pelicula extends Multimedia {
    private float duracionMinutos;
    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String titulo, String autor, Formato formato, int anyo, float duracionMinutos, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, formato, anyo);
        this.duracionMinutos = duracionMinutos;
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public float getDuracionMinutos() {
        return duracionMinutos;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "duracionMinutos=" + duracionMinutos +
                ", actorPrincipal='" + actorPrincipal + '\'' +
                ", actrizPrincipal='" + actrizPrincipal + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato=" + formato +
                ", anyo=" + anyo +
                '}';
    }
}
