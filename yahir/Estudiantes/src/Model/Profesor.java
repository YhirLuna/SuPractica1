package Model;

public class Profesor extends Persona{


    public Profesor(String nombre, String email) {
        super(nombre, email);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + ", Email: " + email);
    }

}