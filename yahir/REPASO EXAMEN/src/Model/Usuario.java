package Model;
// Usuario.java
public class Usuario {
    private int id;
    private String nombre;
    private String correo;

    public Usuario(int id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return nombre + " - " + correo;
    }
}
