import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TampilkanRiwayatTransaksi extends JFrame implements ActionListener {
    private TokoBuku tokoBuku;
    private JLabel headerLabel = new JLabel("Riwayat Transaksi");
    private JLabel pilihIdTransaksi = new JLabel("Pilih ID Transaksi");
    private JComboBox dropdownListTransaksi = new JComboBox();
    private JButton lihatTransaksi = new JButton("Lihat Transaksi");
    private JPanel panel = new JPanel();
//    private ArrayList<Buku> daftarbuku = new ArrayList<Buku>();
//    private ArrayList<Transaksi> daftartransaksi = new ArrayList<Transaksi>();
    private JFrame internalFrame;
    private JMenuBar menuBar = new JMenuBar();
    private JMenu fileMenu = new JMenu("File");
    private JMenuItem[] menuItems = new JMenuItem[]{};
    private String[] Labels = new String[] {
            "Menu Utama", "Tambah Buku Baru", "Hapus Buku", "Tambah Koleksi Baru",
            "Hapus Koleksi", "Tambah Transaksi Baru",
            "Tampilkan Riwayat Transaksi", "Tambah Pelanggan Baru",
            "Keluar", "Akhiri Sesi"
    };

    public TampilkanRiwayatTransaksi(TokoBuku tokoBuku) {
        this.tokoBuku = tokoBuku;
        this.setTitle("Toko Buku Delfi");
        menuBar.add(fileMenu);
        this.setJMenuBar(menuBar);
        for (String l: Labels){
            JMenuItem item = new JMenuItem(l);
            item.addActionListener(this);
            item.setFocusable(false);
            fileMenu.add(item);
            fileMenu.addSeparator();
        }

        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 30));
        headerLabel.setForeground(Color.BLACK);
        headerLabel.setBounds(40,0,800,80);
        add(headerLabel, BorderLayout.NORTH);

        pilihIdTransaksi.setBounds(35,30,230,30);
        pilihIdTransaksi.setForeground(Color.BLACK);
        panel.add(pilihIdTransaksi);
        dropdownListTransaksi.setBounds(170,30,200,30);
        dropdownListTransaksi.setForeground(Color.BLACK);
        panel.add(dropdownListTransaksi);
        lihatTransaksi.addActionListener(this);
        lihatTransaksi.setBounds(100, 150, 200, 30);
        lihatTransaksi.setBackground(Color.BLACK);
        lihatTransaksi.setForeground(Color.WHITE);
        panel.add(lihatTransaksi);

        for (int i = 0; i < this.tokoBuku.getDaftarTransaksi().size(); i++) {
            dropdownListTransaksi.addItem(this.tokoBuku.getDaftarTransaksi().get(i).getIdTransaksi());
        }

        setIconImage((new ImageIcon(this.getClass().getResource("icon.png"))).getImage());
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setBounds(240, 80, 400, 200);
        add(panel,BorderLayout.CENTER);

        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(360, 200, 880, 495);
        setVisible(true);
        setResizable(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == lihatTransaksi)
        {
            for (int i = 0; i < this.tokoBuku.getDaftarTransaksi().size(); i++) {
                if (dropdownListTransaksi.getSelectedItem().equals(this.tokoBuku.getDaftarTransaksi().get(i).getIdTransaksi())) {
                    internalFrame = new JFrame(this.tokoBuku.getDaftarTransaksi().get(i).getIdTransaksi());
                    JLabel headerLabel = new JLabel(this.tokoBuku.getDaftarTransaksi().get(i).getIdTransaksi());
                    headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
                    headerLabel.setFont(new Font("Arial", Font.BOLD, 30));
                    headerLabel.setForeground(Color.BLACK);
                    headerLabel.setBounds(-110,0,800,80);
                    internalFrame.add(headerLabel, BorderLayout.NORTH);
                    // nama kasir
                    JLabel namaKasir = new JLabel("Nama Kasir : " + this.tokoBuku.getDaftarTransaksi().get(i).getNamaKasir());
                    namaKasir.setBounds(75,70,230,30);
                    namaKasir.setForeground(Color.BLACK);
                    internalFrame.add(namaKasir);
                    // nama pelanggan
                    JLabel namaPelanggan = new JLabel("Nama Pelanggan : " + this.tokoBuku.getDaftarTransaksi().get(i).getNamaPelanggan());
                    namaPelanggan.setBounds(75,110,230,30);
                    namaPelanggan.setForeground(Color.BLACK);
                    internalFrame.add(namaPelanggan);
                    // id pelanggan
                    JLabel idPelanggan = new JLabel("ID Pelanggan : " + this.tokoBuku.getDaftarTransaksi().get(i).getIdPelanggan());
                    idPelanggan.setBounds(75,140,230,30);
                    idPelanggan.setForeground(Color.BLACK);
                    internalFrame.add(idPelanggan);
                    // daftar buku
                    JLabel daftarBuku = new JLabel("Daftar buku :");
                    JLabel daftarBuku1 = new JLabel();
                    JLabel daftarBuku2 = new JLabel();
                    JLabel daftarBuku3 = new JLabel();
                    JLabel daftarBuku4 = new JLabel();
                    JLabel daftarBuku5 = new JLabel();

                    JLabel jumlahbuku1 = new JLabel();
                    JLabel jumlahbuku2 = new JLabel();
                    JLabel jumlahbuku3 = new JLabel();
                    JLabel jumlahbuku4 = new JLabel();
                    JLabel jumlahbuku5 = new JLabel();

                    daftarBuku.setBounds(75,170,230,30);
                    daftarBuku.setForeground(Color.BLACK);
                    internalFrame.add(daftarBuku);
                    for (int j = 0; j < this.tokoBuku.getDaftarTransaksi().get(i).getDaftarBuku().size(); j++) {
                        if(j == 0)
                        {
                            daftarBuku1.setText(this.tokoBuku.getDaftarTransaksi().get(i).getDaftarBuku().get(j).getJudulBuku());
                            daftarBuku1.setBounds(170,170,230,30);
                            daftarBuku1.setForeground(Color.BLACK);
                            internalFrame.add(daftarBuku1);
                            jumlahbuku1.setText(this.tokoBuku.getDaftarTransaksi().get(i).getDaftarBuku().get(j).getJumlahBuku().toString() + " Pc");
                            jumlahbuku1.setBounds(340,170,230,30);
                            jumlahbuku1.setForeground(Color.BLACK);
                            internalFrame.add(jumlahbuku1);
                        }
                        if (j == 1)
                        {
                            daftarBuku2.setText(this.tokoBuku.getDaftarTransaksi().get(i).getDaftarBuku().get(j).getJudulBuku());
                            daftarBuku2.setBounds(170,200,230,30);
                            daftarBuku2.setForeground(Color.BLACK);
                            internalFrame.add(daftarBuku2);
                            jumlahbuku2.setText(this.tokoBuku.getDaftarTransaksi().get(i).getDaftarBuku().get(j).getJumlahBuku().toString() + " Pc");
                            jumlahbuku2.setBounds(340,200,230,30);
                            jumlahbuku2.setForeground(Color.BLACK);
                            internalFrame.add(jumlahbuku2);
                        }
                        if (j == 2)
                        {
                            daftarBuku3.setText(this.tokoBuku.getDaftarTransaksi().get(i).getDaftarBuku().get(j).getJudulBuku());
                            daftarBuku3.setBounds(170,230,230,30);
                            daftarBuku3.setForeground(Color.BLACK);
                            internalFrame.add(daftarBuku3);
                            jumlahbuku3.setText(this.tokoBuku.getDaftarTransaksi().get(i).getDaftarBuku().get(j).getJumlahBuku().toString() + " Pc");
                            jumlahbuku3.setBounds(340,230,230,30);
                            jumlahbuku3.setForeground(Color.BLACK);
                            internalFrame.add(jumlahbuku3);
                        }
                        if (j == 3)
                        {
                            daftarBuku4.setText(this.tokoBuku.getDaftarTransaksi().get(i).getDaftarBuku().get(j).getJudulBuku());
                            daftarBuku4.setBounds(170,260,230,30);
                            daftarBuku4.setForeground(Color.BLACK);
                            internalFrame.add(daftarBuku4);
                            jumlahbuku4.setText(this.tokoBuku.getDaftarTransaksi().get(i).getDaftarBuku().get(j).getJumlahBuku().toString() + " Pc");
                            jumlahbuku4.setBounds(340,260,230,30);
                            jumlahbuku4.setForeground(Color.BLACK);
                            internalFrame.add(jumlahbuku4);
                        }
                        if (j == 4)
                        {
                            daftarBuku5.setText(this.tokoBuku.getDaftarTransaksi().get(i).getDaftarBuku().get(j).getJudulBuku());
                            daftarBuku5.setBounds(170,290,230,30);
                            daftarBuku5.setForeground(Color.BLACK);
                            internalFrame.add(daftarBuku5);
                            jumlahbuku5.setText(this.tokoBuku.getDaftarTransaksi().get(i).getDaftarBuku().get(j).getJumlahBuku().toString() + " Pc");
                            jumlahbuku5.setBounds(340,290,230,30);
                            jumlahbuku5.setForeground(Color.BLACK);
                            internalFrame.add(jumlahbuku5);
                        }
                    }
                    JLabel totalHarga = new JLabel("Total Harga : " + this.tokoBuku.getDaftarTransaksi().get(i).getSubTotalTransaksi());
                    totalHarga.setBounds(75,330,230,30);
                    totalHarga.setForeground(Color.BLACK);
                    totalHarga.setFont(new Font("Arial", Font.BOLD, 20));
                    internalFrame.add(totalHarga);


                    internalFrame.setLayout(null);
                    internalFrame.setBounds (0,0,500,490);
                    internalFrame.setVisible(true);
                    internalFrame.setBackground(Color.lightGray);
                    internalFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    internalFrame.setResizable(false);
                    add(internalFrame);
                }
            }
        }
        if(e.getSource() instanceof JMenuItem item){
            String option = item.getText();
            if (option.equals("Menu Utama")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new MenuUtama(tokoBuku);
                    dispose();
                }
            }
            else if (option.equals("Tambah Buku Baru")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new TambahBukuBaru(tokoBuku);
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
                // do nothing karena sudah berada pada page yang dituju
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
