package model;

public class CuentaBancaria{
    private String titular;
    private double saldo;

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depositaste: " + this.saldo);
            System.out.println("EXITOSO " + monto);
        }
    }
    public boolean retirar(double monto){
        if(monto > 0 && saldo >= monto){
            this.saldo -= monto;
            System.out.println("Retiraste: " + this.saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;

        }
    }



    public double getSaldo(){
        return saldo;

    }

    public String getTitular(){
        return titular;

    }

    public void setTitular(String titular){
        this.titular = titular;

    }



}
