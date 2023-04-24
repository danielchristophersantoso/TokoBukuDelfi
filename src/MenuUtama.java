import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUtama extends JFrame implements ActionListener {
    private JMenuBar menuBar = new JMenuBar();
    private JMenuItem keluarMenuItem = new JMenuItem("Keluar");
    private JLabel titleLabel = new JLabel("Menu Utama");
    private JPanel panel = new JPanel();
    private String[] btnLabels = new String[] {
            "Tambah Buku Baru", "Hapus Buku ", "Tambah Koleksi Baru",
            "Hapus Koleksi", "Tampilkan Riwayat Transaksi",
            "Tambah Transaksi Baru", "Tambah Pelanggan Baru", "Keluar"
    };
    private JButton[] buttons = new JButton[]{};
    public MenuUtama() {
        this.setTitle("Menu Utama");
        menuBar.add(keluarMenuItem);
        keluarMenuItem.addActionListener(this);
        setJMenuBar(menuBar);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setBounds(0, 35, 880, 40);
        add(titleLabel, BorderLayout.NORTH);
        panel.setBounds(290, 100, 300, 300);
        panel.setBackground(Color.gray);
        panel.setLayout(new GridLayout(8, 1));

        for (String l: btnLabels){
            JButton btn = new JButton(l);
            btn.addActionListener(this);
            btn.setFocusable(false);
            panel.add(btn);
        }

        this.add(panel);
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

    public static void main(String[] args) {
        new MenuUtama();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == keluarMenuItem){
            int res = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin mengakhiri sesi ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (res == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }
}
