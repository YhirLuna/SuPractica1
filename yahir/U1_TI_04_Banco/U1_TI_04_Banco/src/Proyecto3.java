import model.CuentaBancaria;

public class Proyecto3 {

    public static void main(String[] args) {

        CuentaBancaria CB = new CuentaBancaria();
        CB.setTitular("Angel");
        System.out.println("Titular: " + CB.getTitular());
        CB.depositar(1000);
        CB.retirar(200);
        CB.retirar(10000);









    }
}
