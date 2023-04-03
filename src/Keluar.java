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
        titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setBounds(0, 80, 880, 40);
        add(titleLabel, BorderLayout.NORTH);
        setLocationRelativeTo(null);
        setLayout(null);
        mainPanel.add(masukButton, BorderLayout.CENTER);
        mainPanel.setBounds(0, 220, 880, 295);
        add(mainPanel, BorderLayout.CENTER);
        setJMenuBar(menuBar);
        setSize(880, 495);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        mainPanel.setBackground(Color.LIGHT_GRAY);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Keluar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == keluarMenuItem){
            System.exit(0);
        }
    }
}
