package model;

public class Estudiante {

   private String nombre;
   private String matricula;
   private double[] notas = new double[5];

   public Estudiante(String nombre, String matricula, double[] notas) {
       this.nombre = nombre;
       this.matricula = matricula;
       this.notas = notas;
   }

   public String getNombre(){
       return nombre;

   }

   public void setNombre(String nombre){
       this.nombre = nombre;
   }

   public String getMatricula(){
       return matricula;
   }

   public void setMatricula(String matricula){
       this.matricula = matricula;
   }

   public double[] getNota(){
       return notas;
   }
   public double getNota(int i){
       return notas[i];
   }

   public void setNota(int i, double nota){
       notas[i] = nota;
   }

   public double calcularPromedio(){
       double total = 0;
       double suma = 0.0;
       for(int i = 0; i < notas.length; i++ ){
           suma += notas[i];
       }
       total = suma / notas.length;

       return total;
   }

   public boolean aprobado(){
       return calcularPromedio() >= 7.0;
   }

}