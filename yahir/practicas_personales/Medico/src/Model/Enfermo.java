package Model;

public class Enfermo extends Empleado{
    boolean turnoNocturno;

    public Enfermo(String nombre, String area) {
        super(nombre, area);
    }

    public boolean getTurnoNocturno(){
        return turnoNocturno;
    }


    @Override
    public void mostrarInfo() {
        getArea();
        getNombre();

    }

}