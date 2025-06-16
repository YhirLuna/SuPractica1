package Model;

public class Doctor extends Empleado{
    double[] evaluaciones;

    public Doctor(String nombre, String area) {
        super(nombre, area);
    }

    public double calcularPromedio(){
        return 0;
    }

    @Override
    public void mostrarInfo() {
        getNombre();
        getArea();

    }
}