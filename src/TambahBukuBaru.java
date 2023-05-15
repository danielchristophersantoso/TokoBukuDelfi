import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TambahBukuBaru extends JFrame implements ActionListener {
    private TokoBuku tokoBuku;
    private JLabel labelTambahBuku = new JLabel("Tambah Buku Baru");
    private JLabel labelJudulBuku = new JLabel("Judul Buku");
    private JLabel labelPenulis = new JLabel("Penulis Buku");
    private JLabel labelJumlahHalaman = new JLabel("Jumlah Halaman Buku");
    private JLabel labelKoleksi = new JLabel("Koleksi Buku");
    private JLabel labelJumlahBuku  = new JLabel("Jumlah Buku");
    private JTextField fieldJudulBuku = new JTextField();
    private JTextField fieldPenulis = new JTextField();
    private JTextField fieldJumlahHalaman = new JTextField();
    private JTextField fieldJumlahBuku = new JTextField();
    private JPanel panel = new JPanel();
    private JButton btnTambahBuku = new JButton("Tambah Buku");
    private JMenuBar menuBar = new JMenuBar();
    private JMenu fileMenu = new JMenu("File");
    private JMenuItem[] menuItems = new JMenuItem[]{};
    private String[] Labels = new String[] {
            "Menu Utama", "Tambah Buku Baru", "Tambah Stok Buku", "Hapus Buku", "Tambah Koleksi Baru",
            "Hapus Koleksi", "Tambah Transaksi Baru",
            "Tampilkan Riwayat Transaksi", "Tambah Pelanggan Baru",
            "Keluar", "Akhiri Sesi"
    };
    private JComboBox namaKoleksiComboBox;
    private ArrayList<Koleksi> daftarKoleksi;

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
//        labelTambahBuku.setBackground(new Color(92, 64, 51));
        labelTambahBuku.setBackground(Color.darkGray);
        labelTambahBuku.setOpaque(true);
        add(labelTambahBuku);

        labelJudulBuku.setFont(new Font("Arial", Font.BOLD, 15));
        labelPenulis.setFont(new Font("Arial", Font.BOLD, 15));
        labelJumlahHalaman.setFont(new Font("Arial", Font.BOLD, 15));
        labelKoleksi.setFont(new Font("Arial", Font.BOLD, 15));
        labelJumlahBuku.setFont(new Font("Arial", Font.BOLD, 15));

        fieldJudulBuku.setBounds(340, 35, 185, 20);
        fieldPenulis.setBounds(240, 105, 120, 20);
        fieldJumlahHalaman.setBounds(240, 155, 120, 20);
        fieldJumlahBuku.setBounds(580, 155, 140, 20);

        panel.add(fieldJudulBuku);
        panel.add(fieldPenulis);
        panel.add(fieldJumlahHalaman);
        panel.add(fieldJumlahBuku);

        labelJudulBuku.setBounds(235, 20, 150, 50);
        labelJudulBuku.setForeground(Color.BLACK);
        labelPenulis.setBounds(35, 90, 150, 50);
        labelPenulis.setForeground(Color.BLACK);
        labelJumlahHalaman.setBounds(35, 140, 200, 50);
        labelJumlahHalaman.setForeground(Color.BLACK);
        labelKoleksi.setBounds(400, 90, 150, 50);
        labelKoleksi.setForeground(Color.BLACK);
        labelJumlahBuku.setBounds(400, 140, 200, 50);
        labelJumlahBuku.setForeground(Color.BLACK);

        namaKoleksiComboBox = new JComboBox();
        namaKoleksiComboBox.addItem("Pilih Koleksi");
        this.daftarKoleksi = this.tokoBuku.getDaftarKoleksi();
        for (Koleksi j: daftarKoleksi) {
            namaKoleksiComboBox.addItem(j.getNamaKoleksi());
        }
        namaKoleksiComboBox.setBounds(580, 100, 140, 25);
        namaKoleksiComboBox.setFont(new Font("Arial", Font.PLAIN, 12));
        namaKoleksiComboBox.addActionListener(this);
        namaKoleksiComboBox.setFocusable(false);
        panel.add(namaKoleksiComboBox);

        panel.add(labelJudulBuku);
        panel.add(labelPenulis);
        panel.add(labelJumlahHalaman);
        panel.add(labelKoleksi);
        panel.add(labelJumlahBuku);

//        panel.setBackground(new Color(0,0,0,100));
        panel.setBackground(Color.gray);
        panel.setBounds(50, 110, 760,210);
        panel.setOpaque(true);
        panel.setLayout(null);
        add(panel);

        btnTambahBuku.setBounds(280, 380, 300, 25);
        btnTambahBuku.setForeground(Color.WHITE);
        btnTambahBuku.setBackground(Color.black);
        btnTambahBuku.addActionListener(this);
        btnTambahBuku.setFocusable(false);
        add(btnTambahBuku);

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
        if (e.getSource() == btnTambahBuku) {
            Integer index = namaKoleksiComboBox.getSelectedIndex() - 1;
            String judulBuku = fieldJudulBuku.getText();
            String penulisBuku = fieldPenulis.getText();
            Koleksi koleksi = this.tokoBuku.getDaftarKoleksi().get(index);

            if (judulBuku.equals("") || penulisBuku.equals("") || fieldJumlahHalaman.getText().equals("") || fieldJumlahBuku.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
                return;
            } else if (!fieldJumlahHalaman.getText().matches("[0-9]+")) {
                JOptionPane.showMessageDialog(null, "Jumlah Halaman tidak valid");
                return;
            } else if (!fieldJumlahBuku.getText().matches("[0-9]+")) {
                JOptionPane.showMessageDialog(null, "Jumlah Buku tidak valid");
                return;
            } else if (index == -1) {
                JOptionPane.showMessageDialog(null, "Nama Koleksi tidak valid");
                return;
            } else if (koleksi.searchDaftarBuku(judulBuku, penulisBuku) != -1) {
                int found = koleksi.searchDaftarBuku(judulBuku, penulisBuku);
                Buku b = koleksi.getDaftarBuku().get(found);

                if (b.getJudulBuku().equals(judulBuku) && b.getPenulis().equals(penulisBuku)) {
                    JOptionPane.showMessageDialog(null, "Buku sudah terdaftar");
                    return;
                } else {
                    int jumlahHalaman = Integer.parseInt(fieldJumlahHalaman.getText());
                    int jumlahBuku = Integer.parseInt(fieldJumlahBuku.getText());

                    if (jumlahHalaman <= 0 || jumlahBuku <= 0) {
                        JOptionPane.showMessageDialog(null, "Jumlah Buku/Jumlah Halaman tidak valid");
                        return;
                    }

                    Buku buku = new Buku(judulBuku, jumlahHalaman, penulisBuku, jumlahBuku);
                    koleksi.addDaftarBuku(buku);

                    JOptionPane.showInternalMessageDialog(null, "Data Berhasil Ditambahkan");
                    int result = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menambahkan data lagi?",
                            "Konfirmasi", JOptionPane.YES_NO_OPTION);

                    if (result == 1) {
                        new MenuUtama(tokoBuku);
                        dispose();
                    } else if (result == 0) {
                        fieldPenulis.setText("");
                        fieldJumlahHalaman.setText("");
                        fieldJudulBuku.setText("");
                        namaKoleksiComboBox.setSelectedIndex(0);
                    }
                }
            } else {
                int jumlahHalaman = Integer.parseInt(fieldJumlahHalaman.getText());
                int jumlahBuku = Integer.parseInt(fieldJumlahBuku.getText());

                if (jumlahHalaman <= 0 || jumlahBuku <= 0) {
                    JOptionPane.showMessageDialog(null, "Jumlah Buku/Jumlah Halaman tidak valid");
                    return;
                }

                Buku buku = new Buku(judulBuku, jumlahHalaman, penulisBuku);
                koleksi.addDaftarBuku(buku);

                JOptionPane.showInternalMessageDialog(null, "Data Berhasil Ditambahkan");
                int result = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menambahkan data lagi?",
                        "Konfirmasi", JOptionPane.YES_NO_OPTION);

                if (result == 1) {
                    new MenuUtama(tokoBuku);
                    dispose();
                } else if (result == 0) {
                    fieldPenulis.setText("");
                    fieldJumlahHalaman.setText("");
                    fieldJudulBuku.setText("");
                    namaKoleksiComboBox.setSelectedIndex(0);
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
            }
            else if (option.equals("Tambah Buku Baru")) {
                // do nothing karena sudah berada pada page yang dituju
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
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new TambahKoleksiBaru(tokoBuku);
                    dispose();
                }
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
