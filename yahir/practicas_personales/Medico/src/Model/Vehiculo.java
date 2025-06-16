package Model;

public abstract class Vehiculo{
    private String placa;
    private String marca;

    public Vehiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public abstract void mostrarInfo();

}