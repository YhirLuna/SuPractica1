import Model.*;

public class MainVehiculo{

    public static void main(String[] args){
        Garage garage = new Garage(4);
        Vehiculo v1 = new Coche("42345gft, ", "boge, ", 3);
        Vehiculo v2 = new Motocicleta("3423ref, ", "mote, ", false);
        Vehiculo v3 = new Coche("867, ", "cate, ", 4);
        Vehiculo v4 = new Motocicleta("gdf, ", "boge, ", true);
        Vehiculo v5 = new Coche("098, ", "coto, ", 1);

        System.out.println("Estacionando los vehiculos:");

        System.out.println(" ");

        garage.estacionar(v1);
        garage.retirar("42345gft, ");
        v1.mostrarInfo();

        garage.estacionar(v2);
        v2.mostrarInfo();
        garage.estacionar(v3);
        v3.mostrarInfo();
        garage.estacionar(v4);
        v4.mostrarInfo();

        System.out.println(" ");

        garage.estacionar(v5);
        v5.mostrarInfo();

    }

}