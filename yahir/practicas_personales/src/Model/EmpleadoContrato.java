package Model;

public class EmpleadoContrato extends Empleado{

    private double pagoHora;
    private double cantidaHoras;

    public EmpleadoContrato(String nombre, int id, double pagoHora, double cantidaHoras) {
        super(nombre, id);
        this.pagoHora=pagoHora;
        this.cantidaHoras=cantidaHoras;
    }

    @Override
    public double calcularSueldo() {
        return pagoHora*cantidaHoras;
    }
}