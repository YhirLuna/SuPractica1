package Model;

public class Triangulo_equilatero extends FigureAbs{
    private double side;

    public Triangulo_equilatero(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double getArea() {
        return (Math.sqrt(3)/4)*(side * side);
    }

    @Override
    public double getPerimeter() {
        return 3*side;
    }
}