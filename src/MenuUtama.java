import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUtama extends JFrame implements ActionListener {
    private TokoBuku tokoBuku;
    private JMenuBar menuBar = new JMenuBar();
    private JMenu fileMenu = new JMenu("File");
    private JMenuItem[] menuItems = new JMenuItem[]{};
    private JLabel titleLabel = new JLabel("Menu Utama");
    private JPanel panel = new JPanel();
    private JButton[] buttons = new JButton[]{};
    private String[] Labels = new String[] {
            "Tambah Buku Baru", "Hapus Buku", "Tambah Koleksi Baru",
            "Hapus Koleksi", "Tambah Transaksi Baru",
            "Tampilkan Riwayat Transaksi", "Tambah Pelanggan Baru",
            "Keluar", "Akhiri Sesi"
    };
    public MenuUtama(TokoBuku tokoBuku) {
        this.tokoBuku = tokoBuku;
        this.setTitle("Menu Utama");
        menuBar.add(fileMenu);
        this.setJMenuBar(menuBar);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setBounds(0, 20, 880, 40);
        this.add(titleLabel, BorderLayout.NORTH);
        panel.setBounds(240, 80, 400, 330);
        panel.setOpaque(false);
        panel.setLayout(new GridLayout(9, 1, 0, 3));

        for (String l: Labels){
            JButton btn = new JButton(l);
            btn.setForeground(Color.WHITE);
            btn.setBackground(Color.black);
            btn.addActionListener(this);
            btn.setFocusable(false);
            panel.add(btn);
            JMenuItem item = new JMenuItem(l);
            item.addActionListener(this);
            item.setFocusable(false);
            fileMenu.add(item);
            fileMenu.addSeparator();
        }

        this.add(panel);
        this.setFocusable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setSize(880, 495);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(92, 64, 51));
        this.setIconImage((new ImageIcon(this.getClass().getResource("icon.png"))).getImage());
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String option = null;
        Integer check = null;
        if(e.getSource() instanceof JMenuItem item){
            option = item.getText();
            check = 1;
        } else if (e.getSource() instanceof JButton btn){
            option = btn.getText();
            check = 1;
        }
        if(check == 1){
            if (option.equals("Tambah Buku Baru")) {
                new TambahBukuBaru(tokoBuku);
                dispose();
            } else if (option.equals("Hapus Buku")) {
                new HapusBuku(tokoBuku);
                dispose();
            } else if (option.equals("Tambah Koleksi Baru")) {
                new TambahKoleksiBaru(tokoBuku);
                dispose();
            } else if (option.equals("Hapus Koleksi")) {
                new HapusKoleksi(tokoBuku);
                dispose();
            } else if (option.equals("Tambah Transaksi Baru")) {
                new TambahTransaksiBaru(tokoBuku);
                dispose();
            } else if (option.equals("Tampilkan Riwayat Transaksi")) {
                new TampilkanRiwayatTransaksi(tokoBuku);
                dispose();
            } else if (option.equals("Tambah Pelanggan Baru")) {
                new TambahPelangganBaru(tokoBuku);
                dispose();
            } else if (option.equals("Keluar")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin keluar? Anda akan diminta untuk memasukkan id dan password anda kembali.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new Keluar(tokoBuku);
                    dispose();
                }
            } else if (option.equals("Akhiri Sesi")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin mengakhiri sesi ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        }
    }
}
