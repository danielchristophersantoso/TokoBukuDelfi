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
        this.setTitle("Toko Buku Delfi");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setBounds(0, 140, 880, 40);
        add(titleLabel, BorderLayout.NORTH);
        masukButton.setForeground(Color.WHITE);
        masukButton.setBackground(Color.black);
        masukButton.addActionListener(this);
        masukButton.setFocusable(false);
        mainPanel.add(masukButton, BorderLayout.CENTER);
        akhiriSesiButton.setForeground(Color.WHITE);
        akhiriSesiButton.setBackground(Color.black);
        akhiriSesiButton.addActionListener(this);
        akhiriSesiButton.setFocusable(false);
        mainPanel.add(akhiriSesiButton, BorderLayout.CENTER);
        mainPanel.setBounds(200, 240, 480, 35);
        mainPanel.setOpaque(false);
        mainPanel.setLayout(new GridLayout(1, 2, 20, 0));
        mainPanel.setFocusable(false);
        this.add(mainPanel, BorderLayout.CENTER);
        this.setFocusable(false);
        this.setLayout(null);
        this.setBounds(360, 200, 880, 495);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.darkGray);
        this.setIconImage((new ImageIcon(this.getClass().getResource("icon.png"))).getImage());
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == masukButton){
            new Masuk(this.tokoBuku);
            dispose();
        } else if (e.getSource() == akhiriSesiButton){
            int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin mengakhiri sesi ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (res == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }
}
