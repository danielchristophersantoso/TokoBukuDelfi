import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Keluar extends JFrame implements ActionListener {
    private JMenuBar menuBar = new JMenuBar();
    private JMenuItem keluarMenuItem = new JMenuItem("Keluar");
    private JLabel titleLabel = new JLabel("Berhasil Keluar");
    private JPanel mainPanel = new JPanel();
    private JButton masukButton = new JButton("Masuk");
    public Keluar() {
        super("Keluar");
        menuBar.add(keluarMenuItem);
        keluarMenuItem.addActionListener(this);
        setJMenuBar(menuBar);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setBounds(0, 80, 880, 40);
        add(titleLabel, BorderLayout.NORTH);
        masukButton.setForeground(Color.WHITE);
        masukButton.setBackground(Color.black);
        mainPanel.add(masukButton, BorderLayout.CENTER);
        mainPanel.setBounds(0, 220, 880, 295);
        mainPanel.setBackground(Color.LIGHT_GRAY);
        add(mainPanel, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(880, 495);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setIconImage((new ImageIcon(this.getClass().getResource("icon.png"))).getImage());
        setVisible(true);
    }

    public static void main(String[] args) {
        new Keluar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == keluarMenuItem){
            int res = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin mengakhiri sesi ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (res == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
        if (e.getSource() == masukButton){
            new Masuk();
        }
    }
}
