package Model;

public class EmpleadoTiempoCompleto extends Empleado {

    private String beneficios;


    public EmpleadoTiempoCompleto(String id, String nombre, double salarioBase, String beneficios) {
        super(id, nombre, salarioBase);
        this.beneficios = beneficios;
    }

    public String getBeneficios() {
        return beneficios;
    }


    @Override
    public double calcularSalario() {
        System.out.println("" + beneficios);
        return getSalarioBase();
    }

}