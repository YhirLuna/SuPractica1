package Model;
 public class EmpleadoPorHora extends Empleado{

     private int horasTrabajadas;

     public EmpleadoPorHora(String id, String nombre, double salarioBase, int horasTrabajadas) {
         super(id, nombre, salarioBase);
         this.horasTrabajadas = horasTrabajadas;
     }

     public int getHorasTrabajadas() {
         return horasTrabajadas;
     }


     @Override
     public double calcularSalario()
     {
         System.out.println("Horas trabajadas: "+ horasTrabajadas);
         return getSalarioBase()*horasTrabajadas;
     }
 }