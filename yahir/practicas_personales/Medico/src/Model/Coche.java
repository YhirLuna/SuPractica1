package Model;

public class Coche extends Vehiculo{
    private int numeroPuertas;

    public Coche(String placa, String marca, int numeroPuertas) {
        super(placa, marca);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Placas: " + getPlaca() + "Marca: " + getMarca() + "Numero de puertas: " + getNumeroPuertas());
    }
}