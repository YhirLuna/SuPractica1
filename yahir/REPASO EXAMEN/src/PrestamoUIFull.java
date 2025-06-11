import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class PrestamoUIFull extends JFrame {

    public PrestamoUIFull() {
        setTitle("Registrar Préstamo - FLAVEM");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Fondo general oscuro
        JPanel fondo = new JPanel(new BorderLayout());
        fondo.setBackground(new Color(48, 48, 48)); // fondo gris oscuro
        add(fondo);

        // Panel lateral
        JPanel lateral = new JPanel();
        lateral.setBackground(new Color(174, 145, 102)); // marrón claro
        lateral.setPreferredSize(new Dimension(200, getHeight()));
        lateral.setLayout(new BoxLayout(lateral, BoxLayout.Y_AXIS));
        fondo.add(lateral, BorderLayout.WEST);

        // Logo
        JLabel logo = new JLabel("FLAVEM", SwingConstants.CENTER);
        logo.setFont(new Font("Serif", Font.BOLD, 24));
        logo.setForeground(Color.WHITE);
        logo.setBorder(new EmptyBorder(30, 10, 10, 10));
        lateral.add(logo);

        // Usuario
        JLabel usuario = new JLabel("<html><div style='text-align: center;'>Super administrador<br>José Ángel Álvarez Flores</div></html>");
        usuario.setForeground(Color.WHITE);
        usuario.setFont(new Font("SansSerif", Font.PLAIN, 11));
        usuario.setAlignmentX(Component.CENTER_ALIGNMENT);
        lateral.add(usuario);

        lateral.add(Box.createRigidArea(new Dimension(0, 15)));

        String[] menuItems = {
                "Administradores", "Dashboard", "Usuarios", "Libros",
                "Prestamos", "Registrar", "Historial Prestamos",
                "Configuración", "Cerrar sesión"
        };

        for (String item : menuItems) {
            JButton boton = new JButton(item);
            boton.setMaximumSize(new Dimension(180, 30));
            boton.setBackground(new Color(143, 119, 85));
            boton.setForeground(Color.WHITE);
            boton.setFocusPainted(false);
            boton.setBorder(new EmptyBorder(5, 10, 5, 10));
            lateral.add(Box.createRigidArea(new Dimension(0, 5)));
            lateral.add(boton);
        }

        // Panel central con sombra simulada
        JPanel panelCentral = new JPanel(new GridBagLayout());
        panelCentral.setBackground(new Color(48, 48, 48));
        fondo.add(panelCentral, BorderLayout.CENTER);

        JPanel sombra = new JPanel(new BorderLayout());
        sombra.setBackground(new Color(180, 180, 180)); // sombra simulada
        sombra.setBorder(new EmptyBorder(15, 15, 15, 15));
        sombra.setPreferredSize(new Dimension(550, 400));

        JPanel contenido = new JPanel(new GridBagLayout());
        contenido.setBackground(Color.WHITE);
        contenido.setBorder(new CompoundBorder(
                new LineBorder(new Color(210, 210, 210), 2, true),
                new EmptyBorder(20, 30, 20, 30)
        ));

        JLabel titulo = new JLabel("Registrar Prestamo");
        titulo.setFont(new Font("SansSerif", Font.BOLD, 18));
        titulo.setForeground(Color.BLACK);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 0, 20, 0);
        gbc.gridx = 0;
        gbc.gridy = 0;
        contenido.add(titulo, gbc);

        String[] etiquetas = {
                "Id del usuario:", "Id del libro:", "Fecha del préstamo:",
                "Días permitidos:", "Fecha de devolución:"
        };

        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridwidth = 1;
        for (int i = 0; i < etiquetas.length; i++) {
            gbc.gridx = 0;
            gbc.gridy = i + 1;
            contenido.add(new JLabel(etiquetas[i]), gbc);

            gbc.gridx = 1;
            contenido.add(new JTextField(20), gbc);
        }

        // Botones
        gbc.gridy = etiquetas.length + 2;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(Color.WHITE);

        JButton limpiar = new JButton("Limpiar");
        limpiar.setBackground(new Color(230, 230, 230));
        JButton guardar = new JButton("Guardar");
        guardar.setBackground(new Color(40, 40, 40));
        guardar.setForeground(Color.WHITE);

        panelBotones.add(limpiar);
        panelBotones.add(Box.createRigidArea(new Dimension(20, 0)));
        panelBotones.add(guardar);

        contenido.add(panelBotones, gbc);

        sombra.add(contenido, BorderLayout.CENTER);
        panelCentral.add(sombra);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PrestamoUIFull::new);
    }
}
