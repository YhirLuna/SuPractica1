package Model;
// Libro.java
public class Libro {
    private int id;
    private String titulo;
    private String autor;

    public Libro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor;
    }
}
