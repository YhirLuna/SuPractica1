import javax.swing.*;

public class jav {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println(name);
        String x1 = JOptionPane.showInputDialog("Dame tu calificacion numero 1");
                String x2 = JOptionPane.showInputDialog("Dame tu calificacion numero 2");
                        String x3 = JOptionPane.showInputDialog("Dame tu calificacion numero 3");
                                System.out.println(Integer.parseInt(x1) + " " + x2 + " " + x3 );
        int suma  = Integer.parseInt(x1) + Integer.parseInt(x2) +
                Integer.parseInt(x3);
        float div = suma / 3;
        System.out.println("la calificacion es de: " + div);



    }


}
