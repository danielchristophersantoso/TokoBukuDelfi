import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TambahKoleksiBaru extends JFrame implements ActionListener {
    private TokoBuku tokoBuku;
    private JMenuBar menuBar = new JMenuBar();
    private JMenu fileMenu = new JMenu("File");
    private JMenuItem[] menuItems = new JMenuItem[]{};
    private String[] Labels = new String[] {
            "Menu Utama", "Tambah Buku Baru", "Tambah Stok Buku", "Hapus Buku", "Tambah Koleksi Baru",
            "Hapus Koleksi", "Tambah Transaksi Baru",
            "Tampilkan Riwayat Transaksi", "Tambah Pelanggan Baru",
            "Keluar", "Akhiri Sesi"
    };

    private JPanel panel = new JPanel();
    private JLabel labelTambahKoleksi = new JLabel("Tambah Koleksi Baru");
    private JLabel labelNamaKoleksi = new JLabel("Nama Koleksi");
    private JTextField fieldNamaKoleksi = new JTextField();
    private JButton btnTambahKoleksi = new JButton("Tambah Koleksi");
    public TambahKoleksiBaru(TokoBuku tokoBuku) {
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

        labelTambahKoleksi.setFont(new Font("Arial", Font.BOLD, 30));
        labelTambahKoleksi.setHorizontalAlignment(SwingConstants.CENTER);
        labelTambahKoleksi.setBounds(-10,40,880,50);
        labelTambahKoleksi.setForeground(Color.BLACK);
//        labelTambahKoleksi.setBackground(new Color(92, 64, 51));
        labelTambahKoleksi.setBackground(Color.darkGray);
        labelTambahKoleksi.setOpaque(true);
        add(labelTambahKoleksi);

        labelNamaKoleksi.setFont(new Font("Arial", Font.BOLD, 15));

        fieldNamaKoleksi.setBounds(240, 35, 120, 20);

        panel.add(fieldNamaKoleksi);

        labelNamaKoleksi.setBounds(35, 20, 150, 50);
        labelNamaKoleksi.setForeground(Color.BLACK);

        panel.add(labelNamaKoleksi);

//        panel.setBackground(new Color(0,0,0,100));
        panel.setBackground(Color.GRAY);
        panel.setBounds(230, 110, 400,90);
        panel.setOpaque(true);
        panel.setLayout(null);
        add(panel);

        btnTambahKoleksi.setBounds(280, 230, 300, 25);
        btnTambahKoleksi.setForeground(Color.WHITE);
        btnTambahKoleksi.setBackground(Color.black);
        btnTambahKoleksi.addActionListener(this);
        btnTambahKoleksi.setFocusable(false);
        add(btnTambahKoleksi);

//        this.getContentPane().setBackground(new Color(92, 64, 51));
        this.getContentPane().setBackground(Color.darkGray);
        setTitle("Toko Buku Delfi");
        setLayout(null);
        setIconImage((new ImageIcon(this.getClass().getResource("icon.png"))).getImage());
        setVisible(true);
        setBounds(360,200,880,495);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnTambahKoleksi) {
            String namaKoleksi = fieldNamaKoleksi.getText();
            if (fieldNamaKoleksi.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
                return;
            } else if (tokoBuku.searchKoleksi(namaKoleksi) != -1) {
                JOptionPane.showMessageDialog(null, "Nama Koleksi sudah terdaftar");
                return;
            } else {
                Koleksi koleksi = new Koleksi(namaKoleksi);
                this.tokoBuku.getDaftarKoleksi().add(koleksi);

                JOptionPane.showInternalMessageDialog(null, "Data Berhasil Ditambahkan");
                int result = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menambahkan data lagi?",
                        "Konfirmasi", JOptionPane.YES_NO_OPTION);

                if (result == 1) {
                    new MenuUtama(tokoBuku);
                    dispose();
                } else if (result == 0) {
                    fieldNamaKoleksi.setText("");
                }
            }
        }

        if (e.getSource() instanceof JMenuItem item) {
            String option = item.getText();
            if (option.equals("Menu Utama")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new MenuUtama(tokoBuku);
                    dispose();
                }
            } else if (option.equals("Tambah Buku Baru")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new TambahBukuBaru(tokoBuku);
                    dispose();
                }
            } else if (option.equals("Tambah Stok Buku")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new TambahStokBuku(this.tokoBuku);
                    dispose();
                }
            } else if (option.equals("Hapus Buku")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new HapusBuku(tokoBuku);
                    dispose();
                }
            } else if (option.equals("Tambah Koleksi Baru")) {
                // do nothing karena sudah berada pada page yang dituju
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
    }
}
