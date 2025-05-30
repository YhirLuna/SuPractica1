package model;

public class UsuarioSeguro{

    private String nombreUsuario;
    private String password;


    public String setNombreUsuario(String nombreUsuario){

        if(nombreUsuario == null){
            System.out.println("Error: Nombre del usuario no puede ser nulo");
        }else{
            this.nombreUsuario = nombreUsuario;
        }

        return nombreUsuario;
    }

    public String setPassword(String password){

        if(password.length() < 8 ){
         System.out.println("Error tiene que ser mayor a 8 caracteres");
         return password;
        }

        boolean mayusculas = false;
        boolean minusculas = false;
        boolean dig = false;

        for(int i = 0; i < password.length(); i++){
            char caracter = password.charAt(i);
            if(Character.isUpperCase(caracter)){
                mayusculas = true;
            } else if (Character.isLowerCase(caracter)) {
                minusculas = true;
            } else if (Character.isDigit(caracter)) {
                dig = true;
            }
        }

        if(mayusculas == false) {
            System.out.println("Tiene que tener por lo menos una Mayuscula");
        } else if (minusculas == false) {
            System.out.println("Tiene que contener minusculas");
        } else if (dig == false) {
            System.out.println("Tiene que contener un digito");

        }

        if (mayusculas && minusculas && dig) {
            this.password = password;
        }
        return password;
    }

    public boolean autenticar(String intentPassword){
      if(this.password == null){
          System.out.println("No hay contraseña registrada");
          return false;
      }
      if(this.password.equals(intentPassword)){
          System.out.println("Acceso concedido");
          return true;
      }else{
          System.out.println("Acceso no concedido, no se guardo ninguna contraseña");
          return false;
      }


    }




}