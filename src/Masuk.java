import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Masuk extends JFrame implements ActionListener {
    private TokoBuku tokoBuku;
    private JLabel labelMasuk = new JLabel("Masuk");
    private JPanel panel = new JPanel();
    private JButton btnMasuk = new JButton("Masuk");
    private JLabel usernameLabel = new JLabel("Nama");
    private JTextField usernameField = new JTextField();
    private JLabel passwordLabel = new JLabel("Password");
    private JTextField passwordField = new JPasswordField();
    public Masuk(TokoBuku tokoBuku) {
        this.tokoBuku = tokoBuku;
        setTitle("Toko Buku Delfi");
        labelMasuk.setHorizontalAlignment(SwingConstants.CENTER);
        labelMasuk.setFont(new Font("Arial", Font.BOLD, 30));
        labelMasuk.setBounds(380,110,100,50);
        labelMasuk.setForeground(Color.BLACK);
        panel.add(labelMasuk);

//        panel.setBackground(new Color(92, 64, 51));
        panel.setBackground(Color.gray);
        usernameLabel.setBounds(285, 170, 70, 20);
        usernameLabel.setForeground(Color.BLACK);
        panel.add(usernameLabel);
        usernameField.setBounds(285, 189, 300, 28);
        panel.add(usernameField);
        passwordLabel.setBounds(285, 220, 70, 20);
        passwordLabel.setForeground(Color.BLACK);
        panel.add(passwordLabel);
        passwordField.setBounds(285, 239, 300, 28);
        panel.add(passwordField);
        panel.setBorder(new LineBorder(new Color(92, 64, 51)));

        btnMasuk.setBounds(285, 290, 300, 25);
        btnMasuk.setForeground(Color.WHITE);
        btnMasuk.setBackground(Color.black);
        btnMasuk.addActionListener(this);
        panel.add(btnMasuk);

        panel.setLayout(null);
        add(panel);

        setIconImage((new ImageIcon(this.getClass().getResource("icon.png"))).getImage());
        setVisible(true);
        setBounds(360,200,880,495);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (e.getSource() == btnMasuk) {
            if (username.equals(tokoBuku.getKasir().getNama()) && password.equals(tokoBuku.getKasir().getPassword())) {
                JOptionPane.showMessageDialog(null, "Berhasil Masuk!");
                new MenuUtama(tokoBuku);
                dispose();
            }
            else
                JOptionPane.showMessageDialog(null, "Nama atau Password salah!");
        }
    }
}
