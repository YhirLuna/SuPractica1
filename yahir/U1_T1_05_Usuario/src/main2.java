import model.UsuarioSeguro;

public class main2{
    public static void main(String[] args){

        UsuarioSeguro US = new UsuarioSeguro();
        System.out.println("" + US.setNombreUsuario("yahir"));
        US.setPassword("YahirLuna12");
        US.autenticar("YahirLuna12");


    }
}