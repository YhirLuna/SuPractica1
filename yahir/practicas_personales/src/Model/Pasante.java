package Model;

public class Pasante extends Empleado{

    private double apoyoEconomico;

    public Pasante(String nombre, int id) {
        super(nombre, id);
    }

    @Override
    public double calcularSueldo() {
        return 0;
    }
}