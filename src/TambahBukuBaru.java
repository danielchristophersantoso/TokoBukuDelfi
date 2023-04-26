import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;

public class TambahBukuBaru extends JFrame implements ActionListener {
    private TokoBuku tokoBuku;
    private JLabel labelTambahBuku = new JLabel("Tambah Buku Baru");
    private JLabel labelJudulBuku = new JLabel("Judul Buku");
    private JLabel labelPenulis = new JLabel("Penulis Buku");
    private JLabel labelJumlahHalaman = new JLabel("Jumlah Halaman Buku");
    private JLabel labelKoleksi = new JLabel("Koleksi Buku");
    private JTextField fieldJudulBuku = new JTextField();
    private JTextField fieldPenulis = new JTextField();
    JTextField fieldJumlahHalaman = new JTextField();
    private JTextField fieldKoleksi = new JTextField();
    private JPanel panel = new JPanel();
    private JButton btnTambahBuku = new JButton("Tambah Buku");
    private JMenuBar menuBar = new JMenuBar();
    private JMenu fileMenu = new JMenu("File");
    private JMenuItem[] menuItems = new JMenuItem[]{};
    private String[] Labels = new String[] {
            "Tambah Buku Baru", "Hapus Buku", "Tambah Koleksi Baru",
            "Hapus Koleksi", "Tambah Transaksi Baru",
            "Tampilkan Riwayat Transaksi", "Tambah Pelanggan Baru",
            "Keluar", "Akhiri Sesi"
    };

    public TambahBukuBaru(TokoBuku tokoBuku) {
        this.tokoBuku = tokoBuku;
        menuBar.add(fileMenu);
        this.setJMenuBar(menuBar);
        for (String l: Labels){
            JMenuItem item = new JMenuItem(l);
            item.addActionListener(this);
            item.setFocusable(false);
            fileMenu.add(item);
            fileMenu.addSeparator();
        }
        labelTambahBuku.setFont(new Font("Arial", Font.BOLD, 30));
        labelTambahBuku.setHorizontalAlignment(SwingConstants.CENTER);
        labelTambahBuku.setBounds(-10,40,880,50);
        labelTambahBuku.setForeground(Color.BLACK);
        labelTambahBuku.setBackground(new Color(92, 64, 51));
        labelTambahBuku.setOpaque(true);
        add(labelTambahBuku);

        labelJudulBuku.setFont(new Font("Arial", Font.BOLD, 15));
        labelPenulis.setFont(new Font("Arial", Font.BOLD, 15));
        labelJumlahHalaman.setFont(new Font("Arial", Font.BOLD, 15));
        labelKoleksi.setFont(new Font("Arial", Font.BOLD, 15));

        fieldJudulBuku.setBounds(240, 35, 120, 20);
        fieldPenulis.setBounds(240, 85, 120, 20);
        fieldJumlahHalaman.setBounds(240, 135, 120, 20);
        fieldKoleksi.setBounds(240, 185, 120, 20);

        panel.add(fieldJudulBuku);
        panel.add(fieldPenulis);
        panel.add(fieldJumlahHalaman);
        panel.add(fieldKoleksi);

        labelJudulBuku.setBounds(35, 20, 150, 50);
        labelJudulBuku.setForeground(Color.BLACK);
        labelPenulis.setBounds(35, 70, 150, 50);
        labelPenulis.setForeground(Color.BLACK);
        labelJumlahHalaman.setBounds(35, 120, 200, 50);
        labelJumlahHalaman.setForeground(Color.BLACK);
        labelKoleksi.setBounds(35, 170, 150, 50);
        labelKoleksi.setForeground(Color.BLACK);

        panel.add(labelJudulBuku);
        panel.add(labelPenulis);
        panel.add(labelJumlahHalaman);
        panel.add(labelKoleksi);

        panel.setBackground(new Color(0,0,0,100));
        panel.setBounds(230, 110, 400,240);
        panel.setOpaque(true);
        panel.setLayout(null);
        add(panel);

        btnTambahBuku.setBounds(280, 380, 300, 25);
        btnTambahBuku.setForeground(Color.WHITE);
        btnTambahBuku.setBackground(Color.black);
        btnTambahBuku.addActionListener(this);
        btnTambahBuku.setFocusable(false);
        add(btnTambahBuku);

        this.getContentPane().setBackground(new Color(92, 64, 51));
        setTitle("Toko Buku Delfi");
        setLayout(null);
        setIconImage((new ImageIcon(this.getClass().getResource("icon.png"))).getImage());
        setVisible(true);
        setLocationRelativeTo(null);
        setBounds(360,200,880,495);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String halaman = fieldJumlahHalaman.getText();

        if(e.getSource() instanceof JMenuItem item){
            String option = item.getText();
            if (option.equals("Tambah Buku Baru")) {
                // do nothing karena sudah berada pada page yang dituju
            } else if (option.equals("Hapus Buku")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new HapusBuku(tokoBuku);
                    dispose();
                }
            } else if (option.equals("Tambah Koleksi Baru")) {
//                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
//                if (res == JOptionPane.YES_OPTION) {
//                    new TambahKoleksiBaru(tokoBuku);
//                    dispose();
//                }
            } else if (option.equals("Hapus Koleksi")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new HapusKoleksi(tokoBuku);
                    dispose();
                }
            } else if (option.equals("Tambah Transaksi Baru")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new TambahTransaksiBaru(tokoBuku);
                    dispose();
                }
            } else if (option.equals("Tampilkan Riwayat Transaksi")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new TampilkanRiwayatTransaksi(tokoBuku);
                    dispose();
                }
            } else if (option.equals("Tambah Pelanggan Baru")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new TambahPelangganBaru(tokoBuku);
                    dispose();
                }
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
        else if (!halaman.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Input Angka!");
        } else {
            if (Integer.parseInt(halaman) <= 0) {
                JOptionPane.showMessageDialog(null, "Input Angka Lebih dari 0!");
            }
        }
    }
}
