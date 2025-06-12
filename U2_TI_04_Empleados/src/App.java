import Model.*;

public class App {
    public static void main(String[] args) {
        Empleado em1 = new EmpleadoTiempoCompleto("34", "Yahir", 2000, "Ganaste un vieaje");
        System.out.println("Id: "+em1.getId());
        System.out.println("Nombre: "+em1.getNombre());
        System.out.println("Salario base: "+ em1.getSalarioBase());
        System.out.println("Empleado de tiempo completo: "+em1.calcularSalario());
        System.out.println(" ");
        System.out.println(" Suiguiente Empleado");
        System.out.println(" ");

        Empleado em2 = new EmpleadoPorHora("wre12", "Yahir", 1000, 45);
        System.out.println("Id: "+em2.getId());
        System.out.println("Nombre: "+em2.getNombre());
        System.out.println("Salario base: "+ em2.getSalarioBase());
        System.out.println("Empleado por hora: "+em2.calcularSalario());


    }
}