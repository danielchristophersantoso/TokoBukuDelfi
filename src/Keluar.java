import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Keluar extends JFrame implements ActionListener {
    private TokoBuku tokoBuku;
    private JLabel titleLabel = new JLabel("Berhasil Keluar!");
    private JPanel mainPanel = new JPanel();
    private JButton masukButton = new JButton("Masuk");
    private JButton akhiriSesiButton = new JButton("Akhiri Sesi");
    public Keluar(TokoBuku tokoBuku) {
        this.tokoBuku = tokoBuku;
        this.setTitle("Keluar");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setBounds(0, 140, 880, 40);
        add(titleLabel, BorderLayout.NORTH);
        masukButton.setForeground(Color.WHITE);
        masukButton.setBackground(Color.black);
        masukButton.addActionListener(this);
        masukButton.setFocusable(false);
        mainPanel.add(masukButton, BorderLayout.CENTER);
        mainPanel.setBounds(0, 240, 880, 295);
        mainPanel.setBackground(Color.LIGHT_GRAY);
        mainPanel.setFocusable(false);
        this.add(mainPanel, BorderLayout.CENTER);
        this.setFocusable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setSize(880, 495);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setIconImage((new ImageIcon(this.getClass().getResource("icon.png"))).getImage());
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == masukButton){
            new Masuk();
            dispose();
        }
    }
}
