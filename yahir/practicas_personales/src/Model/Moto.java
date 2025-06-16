package Model;

public class Moto extends Vehiculo{

    @Override
    public void encender() {
        System.out.println("Encendido");
    }

    @Override
    public String obtenerTipo() {
        return "Moto";
    }
}