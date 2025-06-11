import com.formdev.flatlaf.intellijthemes.FlatNordIJTheme;

import javax.swing.*;
import java.awt.*;

public class PrestamoUIProPlusV2 extends JFrame {
    public PrestamoUIProPlusV2() {
        setTitle("FLAVEM | Registrar Libro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 650);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Sidebar
        JPanel sideBar = new JPanel();
        sideBar.setBackground(new Color(177, 143, 96));
        sideBar.setPreferredSize(new Dimension(200, 0));
        sideBar.setLayout(new BorderLayout());

        // Logo
        JLabel logo = new JLabel("FLAVEM", SwingConstants.CENTER);
        logo.setFont(new Font("Segoe UI", Font.BOLD, 16));
        logo.setForeground(Color.WHITE);
        logo.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));

        // Menu
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(0, 1));
        menuPanel.setBackground(new Color(177, 143, 96));

        String[] menuItems = {"Administradores", "Dashboard", "Usuarios", "Libros", "Registrar", "Prestamos",
                "Historial Prestamos", "Configuración", "Cerrar sesión"};

        for (String item : menuItems) {
            JButton btn = new JButton(item);
            btn.setFocusPainted(false);
            btn.setBorderPainted(false);
            btn.setBackground(new Color(177, 143, 96));
            btn.setForeground(Color.WHITE);
            btn.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            btn.setHorizontalAlignment(SwingConstants.CENTER);
            btn.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(120, 90, 60)));
            menuPanel.add(btn);
        }

        sideBar.add(logo, BorderLayout.NORTH);
        sideBar.add(menuPanel, BorderLayout.CENTER);

        // Main panel
        JPanel mainPanel = new JPanel(null);
        mainPanel.setBackground(new Color(40, 40, 40));

        // White base
        JPanel whiteBase = new JPanel();
        whiteBase.setBackground(Color.WHITE);
        whiteBase.setBounds(220, 40, 740, 540);
        whiteBase.setLayout(null);
        whiteBase.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));

        // Gray Layer
        JPanel grayLayer = new JPanel();
        grayLayer.setBackground(new Color(235, 235, 235));
        grayLayer.setBounds(30, 30, 680, 480);
        grayLayer.setLayout(null);
        grayLayer.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

        // Vertical Field Panel
        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridLayout(7, 2, 10, 10));
        fieldPanel.setBackground(Color.WHITE);
        fieldPanel.setBounds(100, 70, 480, 300);
        fieldPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1),
                BorderFactory.createEmptyBorder(15, 15, 15, 15)));

        String[] labels = {"Título:", "Autor:", "Editorial:", "ISBN:", "Categoría:", "Ejemplares:", "Portada del libro:"};
        for (int i = 0; i < labels.length; i++) {
            fieldPanel.add(new JLabel(labels[i]));
            if (i == labels.length - 1) {
                fieldPanel.add(new JButton("[Tomar foto]"));
            } else {
                fieldPanel.add(new JTextField());
            }
        }

        // Title
        JLabel title = new JLabel("Registrar Libro", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 20));
        title.setBounds(0, 20, 680, 30);

        // Buttons
        JButton limpiarBtn = new JButton("Limpiar");
        JButton guardarBtn = new JButton("Guardar");
        limpiarBtn.setBounds(180, 400, 120, 30);
        guardarBtn.setBounds(340, 400, 120, 30);

        grayLayer.add(title);
        grayLayer.add(fieldPanel);
        grayLayer.add(limpiarBtn);
        grayLayer.add(guardarBtn);

        whiteBase.add(grayLayer);
        mainPanel.add(whiteBase);

        add(sideBar, BorderLayout.WEST);
        add(mainPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatNordIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            PrestamoUIProPlusV2 ui = new PrestamoUIProPlusV2();
            ui.setVisible(true);
        });
    }
}
