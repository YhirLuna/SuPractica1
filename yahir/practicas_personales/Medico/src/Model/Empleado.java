package Model;

public abstract class Empleado{
    protected String nombre, area;

    public Empleado(String nombre, String area) {
        this.nombre = nombre;
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArea() {
        return area;
    }

    public abstract void mostrarInfo();
}