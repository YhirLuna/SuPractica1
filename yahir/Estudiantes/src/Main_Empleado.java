import Model.*;

public class Main_Empleado{

    public static void main(String[] args){
    Curso cr = new Curso("532", "curso de ingles", 3);
    Estudiante es1 = new Estudiante("Yahir", "plm@eg.com", 9);
    Estudiante es2 = new Estudiante("Emi", "fiyu@eg.com", 7);
    Estudiante es3 = new Estudiante("Angel", "rewr@eg.com", 5);
    Estudiante es4 = new Estudiante("Vaneza", "tdgfg@eg.com", 10);
    System.out.println("Inscritos:");
    cr.inscribir(es1);
    es1.mostrarInfo();
    cr.inscribir(es2);
    es2.mostrarInfo();
    cr.inscribir(es3);
    es3.mostrarInfo();
    cr.inscribir(es4);
    es4.mostrarInfo();

    System.out.println(" ");

    System.out.println("Grupo: " + cr.getNombre() + "\nPromedio grupal: " + cr.calcularPromedioGrupo());
    }
}