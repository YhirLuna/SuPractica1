package Model;

public class EmpleadoTiempoCompleto extends Empleado{

    private double sueldoMes;

    public EmpleadoTiempoCompleto(String nombre, int id, double sueldoMes) {
        super(nombre, id);
        this.sueldoMes=sueldoMes;
    }

    @Override
    public double calcularSueldo() {
        return sueldoMes;
    }
}