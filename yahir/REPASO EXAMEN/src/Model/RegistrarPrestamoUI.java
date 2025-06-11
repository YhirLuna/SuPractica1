package Model;

import javax.swing.*;
import java.awt.*;

public class RegistrarPrestamoUI extends JFrame {

    public RegistrarPrestamoUI() {
        setTitle("Sistema FLAVEM - Registrar Préstamo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel lateral
        JPanel panelLateral = new JPanel();
        panelLateral.setBackground(new Color(161, 128, 87)); // marrón
        panelLateral.setPreferredSize(new Dimension(200, getHeight()));
        panelLateral.setLayout(new BoxLayout(panelLateral, BoxLayout.Y_AXIS));

        JLabel logo = new JLabel("FLAVEM", SwingConstants.CENTER);
        logo.setFont(new Font("Serif", Font.BOLD, 22));
        logo.setForeground(Color.WHITE);
        logo.setAlignmentX(Component.CENTER_ALIGNMENT);
        logo.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));

        JLabel admin = new JLabel("<html><center>Super administrador<br>José Ángel Álvarez Flores</center></html>");
        admin.setForeground(Color.WHITE);
        admin.setFont(new Font("SansSerif", Font.PLAIN, 12));
        admin.setAlignmentX(Component.CENTER_ALIGNMENT);

        panelLateral.add(logo);
        panelLateral.add(admin);

        String[] opciones = {
                "Administradores", "Dashboard", "Usuarios", "Libros",
                "Prestamos", "Registrar", "Historial Prestamos",
                "Configuración", "Cerrar sesión"
        };

        for (String opcion : opciones) {
            JButton boton = new JButton(opcion);
            boton.setMaximumSize(new Dimension(180, 30));
            boton.setFocusPainted(false);
            panelLateral.add(Box.createRigidArea(new Dimension(0, 5)));
            panelLateral.add(boton);
        }

        add(panelLateral, BorderLayout.WEST);

        // Panel principal
        JPanel panelCentral = new JPanel(new GridBagLayout());
        panelCentral.setBackground(Color.DARK_GRAY);

        JPanel formulario = new JPanel(new GridBagLayout());
        formulario.setBackground(Color.WHITE);
        formulario.setPreferredSize(new Dimension(400, 300));
        formulario.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;

        formulario.add(new JLabel("Id del usuario:"), gbc);
        gbc.gridx = 1;
        formulario.add(new JTextField(15), gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formulario.add(new JLabel("Id del libro:"), gbc);
        gbc.gridx = 1;
        formulario.add(new JTextField(15), gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formulario.add(new JLabel("Fecha del préstamo:"), gbc);
        gbc.gridx = 1;
        formulario.add(new JTextField(15), gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formulario.add(new JLabel("Días permitidos:"), gbc);
        gbc.gridx = 1;
        formulario.add(new JTextField(15), gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formulario.add(new JLabel("Fecha de devolución:"), gbc);
        gbc.gridx = 1;
        formulario.add(new JTextField(15), gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        JPanel botones = new JPanel();
        botones.setBackground(Color.WHITE);
        JButton limpiar = new JButton("Limpiar");
        JButton guardar = new JButton("Guardar");
        botones.add(limpiar);
        botones.add(guardar);
        formulario.add(botones, gbc);

        panelCentral.add(formulario);
        add(panelCentral, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RegistrarPrestamoUI::new);
    }
}
