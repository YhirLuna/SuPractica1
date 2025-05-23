package model;

public class triangulo{

    private double base;
    private double altura;

    public triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getArea(){
        return (base*altura)/2;
    }

    public double getPerimetro(double lado1, double lado2, double lado3){
        return lado1+lado2+lado3;
    }

}