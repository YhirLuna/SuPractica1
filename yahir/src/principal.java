import model.Estudiante;
public class principal {

    public static void main(String[] args){

        Estudiante[] Estudiantes = new Estudiante[5];
        double[] notas1 = {7.0,8.7,9,7,5};
        double[] notas2 = {8,9,10,6,9};
        double[] notas3 = {7.0,6,5,6,10};
        double[] notas4 = {10,10,9,4,8.9};
        double[] notas5 = {7.9,7.9,9.9,7.9,5.9};

        Estudiantes[0] = new Estudiante("Jose Angel", "20243ds066", notas1);
        Estudiantes[1] = new Estudiante("Emiliano Galeana", "20243ds074", notas2);
        Estudiantes[2] = new Estudiante("Charbel Alixis", "20243ds075", notas3);
        Estudiantes[3] = new Estudiante("Yahir Luna", "20243ds067", notas4);
        Estudiantes[4] = new Estudiante("Josue Salvador", "20243ds060", notas5);

        for(int i = 0; i < Estudiantes.length; i++){
            Estudiante e = Estudiantes[i];
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Matricula: " + e.getMatricula());
            System.out.println("Promedio: " + e.calcularPromedio());
            System.out.println("Aprobo?" + e.aprobado());
            System.out.println(" ");


        }


    }


}
