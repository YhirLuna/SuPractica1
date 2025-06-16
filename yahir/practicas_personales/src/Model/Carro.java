package Model;

public class Carro extends Vehiculo{


    @Override
    public void encender() {
        System.out.println("Encendido");
    }

    @Override
    public String obtenerTipo() {
        return "Auto";
    }
}