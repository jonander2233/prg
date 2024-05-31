package org.jonander2233.tareas.tema11.ej06;

import java.util.Objects;

enum Formato{CD,DVD,BLURAY,ARCHIVO}
public class Multimedia {
    protected String titulo;
    protected String autor;
    protected Formato formato;
    protected int anyo;

    public Multimedia(String titulo, String autor, Formato formato, int anyo) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.anyo = anyo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato=" + formato +
                ", anyo=" + anyo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Multimedia that = (Multimedia) o;

        if (!Objects.equals(titulo, that.titulo)) return false;
        return Objects.equals(autor, that.autor);
    }

    @Override
    public int hashCode() {
        int result = titulo != null ? titulo.hashCode() : 0;
        result = 31 * result + (autor != null ? autor.hashCode() : 0);
        return result;
    }

}
