package Model;

public class Bicicleta extends Vehiculo{

    @Override
    public void encender() {
        System.out.println("Encendido");

    }

    @Override
    public String obtenerTipo() {
        return "Bicicleta";
    }
}