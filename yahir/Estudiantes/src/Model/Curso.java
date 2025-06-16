package Model;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Curso{

    private String codigo, nombre;
    private Estudiante[] inscritos;

    public Curso(String codigo, String nombre, int capacidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        inscritos = new Estudiante[capacidad];
    }

    public String getNombre(){
        return nombre;
    }

    public boolean inscribir(Estudiante e){
        for(int i = 0; i < inscritos.length; i++){
            if(inscritos[i] == null){
                inscritos[i] = e;
                return true;
            }

        }
        System.out.println("lleno para: ");
        return false;
}

    public double calcularPromedioGrupo(){
        double suma = 0;
        double contador = 0;
        double total =0 ;
        for(Estudiante e: inscritos){  //Para cada elemento de Estudiantes del arreglo inscritos haz:
            if(e != null){     // si es diferente de nulo
                suma += e.getPromedio(); // suma cada promedio de cada estudiante
                contador ++; // para acumularlos

            }
        }
        if(contador > 0){
            total = suma / contador;
        }
        return total;
    }

}

