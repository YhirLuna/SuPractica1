package Model;

public class Estudiante extends Persona{
    private double promedio;

    public Estudiante(String nombre, String email, double promedio) {
        super(nombre, email);
        this.promedio = promedio;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + ", Email: " + email + ", Promedio: " + promedio);
    }

    public double getPromedio(){
        return promedio;
    }
}