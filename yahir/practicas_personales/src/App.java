import Model.*;

public class App{
    public static void main(String[] args){

        Vehiculo v1 = new Carro();
        Vehiculo v2 = new Moto();
        Vehiculo v3 = new Bicicleta();

        v1.encender();
        v2.encender();
        v3.encender();

        System.out.println(v1.obtenerTipo());
        System.out.println(v2.obtenerTipo());
        System.out.println(v3.obtenerTipo());








    }
}
