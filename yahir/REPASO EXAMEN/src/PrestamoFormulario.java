import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import Model.Usuario;
import Model.Libro;

public class PrestamoFormulario extends JFrame {

    private JComboBox<Usuario> comboUsuarios;
    private JComboBox<Libro> comboLibros;
    private JTextField txtFechaPrestamo;
    private JTextField txtFechaDevolucion;
    private JTextArea txtObservaciones;

    public PrestamoFormulario() {
        setTitle("Registrar Préstamo");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // Simulación de datos
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(1, "José Ángel Álvarez Flores", "jose12@gmail.com"));
        usuarios.add(new Usuario(2, "José Ángel Álvarez Flores", "jose27@gmail.com"));

        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro(101, "Cien años de soledad", "Gabriel García Márquez"));
        libros.add(new Libro(102, "1984", "George Orwell"));

        comboUsuarios = new JComboBox<>(usuarios.toArray(new Usuario[0]));
        comboLibros = new JComboBox<>(libros.toArray(new Libro[0]));
        txtFechaPrestamo = new JTextField("2025-06-07");
        txtFechaDevolucion = new JTextField();
        txtObservaciones = new JTextArea(3, 20);
        JScrollPane scrollObs = new JScrollPane(txtObservaciones);

        panel.add(new JLabel("Usuario:"));
        panel.add(comboUsuarios);

        panel.add(new JLabel("Libro:"));
        panel.add(comboLibros);

        panel.add(new JLabel("Fecha de préstamo:"));
        panel.add(txtFechaPrestamo);

        panel.add(new JLabel("Fecha de devolución:"));
        panel.add(txtFechaDevolucion);

        panel.add(new JLabel("Observaciones:"));
        panel.add(scrollObs);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(e -> guardarPrestamo());

        panel.add(new JLabel()); // vacío
        panel.add(btnGuardar);

        add(panel);
    }

    private void guardarPrestamo() {
        Usuario usuario = (Usuario) comboUsuarios.getSelectedItem();
        Libro libro = (Libro) comboLibros.getSelectedItem();

        String fechaPrestamo = txtFechaPrestamo.getText();
        String fechaDevolucion = txtFechaDevolucion.getText();
        String observaciones = txtObservaciones.getText();

        System.out.println("=== REGISTRO DE PRÉSTAMO ===");
        System.out.println("ID Usuario: " + usuario.getId());
        System.out.println("ID Libro: " + libro.getId());
        System.out.println("Fecha préstamo: " + fechaPrestamo);
        System.out.println("Fecha devolución: " + fechaDevolucion);
        System.out.println("Observaciones: " + observaciones);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PrestamoFormulario().setVisible(true));
    }
}
