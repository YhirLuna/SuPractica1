package Model;

public class Motocicleta extends Vehiculo{
    boolean tieneCaja;

    public Motocicleta(String placa, String marca, boolean tieneCaja) {
        super(placa, marca);
        this.tieneCaja = tieneCaja;
    }

    public boolean getTieneCaja() {
        return tieneCaja;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Placas: " + getPlaca() + "Marca: " + getMarca() + "Tiene caja? " + getTieneCaja());
    }
}