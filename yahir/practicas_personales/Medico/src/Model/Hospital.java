package Model;

public class Hospital{
    private Empleado[] empleados;

    public void agregarEmpleado(Empleado e){
        for(int i = 0; i < empleados.length; i++){
            if(empleados == null){
                empleados[i] = e;
                return;
            }else{
                System.out.println("No hay espacios para mas empleados");
            }

        }
    }

    public void mostrarRendimiento(){
        for(int i = 0; i < empleados.length; i++){
            System.out.println("Empleados: " + empleados[i]);
        }

    }
    public void mostrarRendimientoBajo(){

    }
}