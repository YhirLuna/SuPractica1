import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class PrestamoUIPro extends JFrame {

    public PrestamoUIPro() {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf()); // Tema moderno
        } catch (Exception e) {
            e.printStackTrace();
        }

        setTitle("FLAVEM | Registro de Préstamos");
        setSize(1100, 650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel lateral estilizado
        JPanel sidebar = new JPanel();
        sidebar.setBackground(new Color(174, 145, 102));
        sidebar.setPreferredSize(new Dimension(220, getHeight()));
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBorder(new EmptyBorder(20, 10, 20, 10));
        add(sidebar, BorderLayout.WEST);

        // Logo y nombre
        JLabel logo = new JLabel("FLAVEM", SwingConstants.CENTER);
        logo.setFont(new Font("Serif", Font.BOLD, 28));
        logo.setForeground(Color.WHITE);
        logo.setAlignmentX(Component.CENTER_ALIGNMENT);
        sidebar.add(logo);

        sidebar.add(Box.createRigidArea(new Dimension(0, 10)));

        JLabel userLabel = new JLabel("<html><div style='text-align:center;'>👤<br><b>Super administrador</b><br>José Ángel Álvarez Flores</div></html>");
        userLabel.setForeground(Color.WHITE);
        userLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));
        userLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        sidebar.add(userLabel);

        sidebar.add(Box.createRigidArea(new Dimension(0, 20)));

        String[] items = {
                "Administradores", "Dashboard", "Usuarios", "Libros",
                "Préstamos", "Registrar", "Historial Prestamos",
                "Configuración", "Cerrar sesión"
        };

        for (String item : items) {
            JButton btn = new JButton(item);
            btn.setFocusPainted(false);
            btn.setBackground(new Color(143, 119, 85));
            btn.setForeground(Color.WHITE);
            btn.setFont(new Font("SansSerif", Font.PLAIN, 14));
            btn.setAlignmentX(Component.CENTER_ALIGNMENT);
            btn.setMaximumSize(new Dimension(180, 35));
            btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            sidebar.add(Box.createRigidArea(new Dimension(0, 6)));
            sidebar.add(btn);
        }

        // Panel central
        JPanel content = new JPanel(new GridBagLayout());
        content.setBackground(new Color(48, 48, 48));
        add(content, BorderLayout.CENTER);

        JPanel card = new JPanel(new GridBagLayout());
        card.setBackground(Color.WHITE);
        card.setPreferredSize(new Dimension(520, 420));
        card.setBorder(new CompoundBorder(
                new LineBorder(new Color(200, 200, 200), 2, true),
                new EmptyBorder(25, 35, 25, 35)
        ));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(12, 10, 12, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;

        JLabel title = new JLabel("Registrar Préstamo");
        title.setFont(new Font("SansSerif", Font.BOLD, 20));
        card.add(title, gbc);

        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_END;

        String[] labels = {
                "Id del usuario:", "Id del libro:", "Fecha del préstamo:",
                "Días permitidos:", "Fecha de devolución:"
        };

        JTextField[] campos = new JTextField[labels.length];

        for (int i = 0; i < labels.length; i++) {
            gbc.gridy = i + 1;
            gbc.gridx = 0;
            card.add(new JLabel(labels[i]), gbc);

            gbc.gridx = 1;
            campos[i] = new JTextField(18);
            card.add(campos[i], gbc);
        }

        // Botones
        gbc.gridy = labels.length + 2;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(Color.WHITE);

        JButton limpiar = new JButton("Limpiar");
        limpiar.setBackground(new Color(230, 230, 230));
        limpiar.setFont(new Font("SansSerif", Font.PLAIN, 14));

        JButton guardar = new JButton("Guardar");
        guardar.setBackground(new Color(40, 40, 40));
        guardar.setForeground(Color.WHITE);
        guardar.setFont(new Font("SansSerif", Font.BOLD, 14));

        panelBotones.add(limpiar);
        panelBotones.add(Box.createRigidArea(new Dimension(20, 0)));
        panelBotones.add(guardar);

        card.add(panelBotones, gbc);
        content.add(card);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PrestamoUIPro::new);
    }
}
