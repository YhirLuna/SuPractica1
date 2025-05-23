import model.circulo;
import model.triangulo;

public class App {
    public static void main(String[] args) {
        circulo c = new circulo(5);
        System.out.println("Área del circulo: " + c.getArea());
        System.out.println("Perímetro del circulo: " + c.getPerimetro());
       System.out.println(" ");
        triangulo t = new triangulo(4, 3);
        System.out.println("El area del triangulo es:" + t.getArea());
        System.out.println("El perimetro del traingulo es:" + t.getPerimetro(3,4,7));
    }
}