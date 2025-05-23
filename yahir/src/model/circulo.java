package model;

public class circulo {
    private double radio;

    public circulo(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }
}