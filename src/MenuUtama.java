import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUtama extends JFrame implements ActionListener {
    private JMenuBar menuBar = new JMenuBar();
    private JMenuItem keluarMenuItem = new JMenuItem("Keluar");
    private String[] btnLabels = new String[] {
            "Tambah Buku Baru", "Hapus Buku ", "Tambah Koleksi Baru",
            "Hapus Koleksi", "Tampilkan Riwayat Transaksi",
            "Tambah Transaksi Baru", "Tambah Pelanggan Baru", "Keluar"
    };
    private JButton[] buttons = new JButton[]{};
    public MenuUtama() {
        super("Menu Utama");
        menuBar.add(keluarMenuItem);
        keluarMenuItem.addActionListener(this);
        setJMenuBar(menuBar);

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
