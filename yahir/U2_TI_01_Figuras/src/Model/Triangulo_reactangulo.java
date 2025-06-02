package Model;

public class Triangulo_reactangulo extends FigureAbs{

    private double base, height;

    public Triangulo_reactangulo(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {
        double hipotenusa = Math.sqrt(base * base + height * height);
        return base + height + hipotenusa;
    }
}