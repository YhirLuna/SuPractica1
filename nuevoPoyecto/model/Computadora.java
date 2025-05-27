package model;
public class Computadora {
    private String marca;
    private String modelo;
    private boolean encendida;

    public Computadora(String marca){
        this.marca=marca;
        this.encendida=false;

    }

    public void encender(){
        if(!encendida){
            encendida=true;
            System.out.println("Encendiendo");
        }
        else{
            System.out.println("Ya esta Encendida");
        }
    }

    public void apagar(){
        if(encendida){
            encendida=false;
            System.out.println("Apagando");
        }
        else{
            System.out.println("Ya esta apagada");
        }
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo=modelo;
    }

    public String getMarca(){
        return marca;
    }

    public boolean getEncendida(){
        return this.encendida;
    }



}