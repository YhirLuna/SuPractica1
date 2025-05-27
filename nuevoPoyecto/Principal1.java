import model.Computadora;

public class Principal1
{
    public static void main(String[] args)
    {
        Computadora compu = new Computadora("HP");
        compu.encender();
        System.out.println("Esta encendida?\n"+compu.getEncendida());
        compu.setModelo("FLUVEM");
        System.out.println("El modelo es:" + compu.getModelo());
        System.out.println("La marca es:" + compu.getMarca());
        compu.apagar();



    }
}