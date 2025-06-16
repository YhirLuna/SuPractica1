package Model;

import javax.swing.tree.VariableHeightLayoutCache;
import java.sql.SQLOutput;

public class Garage{
    private Vehiculo[] espacios;

    public Garage(int numEspacios) {
        espacios = new Vehiculo[numEspacios];
    }

    public boolean estacionar(Vehiculo v){
        for(int i = 0; i < espacios.length; i++){
            if(espacios[i] == null){
                espacios[i] = v;
                return true;
            }
        }
        System.out.println("Sin espacios para estacionarse ");
        return false;
    }

    public boolean retirar(String placa){
        for(int i = 0; i < espacios.length; i++){
            if(espacios[i] != null && espacios[i].getPlaca().equals(placa)){
                espacios[i] = null;
                System.out.println("Retirado con exito ");
                return true;
            }
        }
        System.out.println("No se encontro la placa del vehiculo con la placa proposionada "); return false;
    }

    public int contarVehiculo(){
        int contador = 0;
        for(int i = 0; i < espacios.length; i++){
            if(espacios[i] != null){
                contador ++;
            }
        }
        return contador;
    }
}