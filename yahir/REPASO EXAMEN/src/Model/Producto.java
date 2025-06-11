package Model;
public class Producto{
    private String codigo, nombre;
    private int cantidad;

    public Producto(String codigo, String nombre, int cantidad){
        if(codigo.isEmpty() || cantidad < 0){
            System.out.println("Codigo vacio o cantidad negativa");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }
    public int getCantidad() {
        return cantidad;
    }



}
