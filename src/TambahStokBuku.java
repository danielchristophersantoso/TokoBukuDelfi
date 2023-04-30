import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TambahStokBuku extends JFrame implements ActionListener {
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
    private JLabel titleLabel = new JLabel("Tambah Stok Buku");
    private JPanel panel = new JPanel();
    private JButton UpdateBtn = new JButton("Tambah");
    //dropdown list
    private JLabel koleksiLabel = new JLabel("Nama Koleksi          : ");
    private JComboBox namaKoleksiComboBox;
    private ArrayList<Koleksi> daftarKoleksi;
    private JLabel bukuLabel = new JLabel("Judul Buku             : ");
    private JComboBox judulBukuComboBox;
    private ArrayList<Buku> daftarBuku;
    private JLabel jumlahLabel = new JLabel("Jumlah Buku            : ");
    private JTextField jumlahField = new JTextField();
    private int indexBuku=-9999999;
    public TambahStokBuku(TokoBuku tokoBuku){
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
        titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setBounds(0, 35, 880, 40);
        add(titleLabel, BorderLayout.NORTH);

        panel.setBackground(Color.white);
        panel.setBounds(150, 100, 580, 295);
        panel.setLayout(null);
        this.add(panel);

        UpdateBtn.setBackground(Color.black);
        UpdateBtn.setForeground(Color.white);
        UpdateBtn.addActionListener(this);
        UpdateBtn.setFocusable(false);
        UpdateBtn.setBounds(240, 235, 100, 40);
        panel.add(UpdateBtn);

        namaKoleksiComboBox = new JComboBox();
        namaKoleksiComboBox.addItem("Pilih Koleksi");
        this.daftarKoleksi = this.tokoBuku.getDaftarKoleksi();
        for (Koleksi j: daftarKoleksi) {
            namaKoleksiComboBox.addItem(j.getNamaKoleksi());
        }
        namaKoleksiComboBox.setBounds(175, 30, 385, 30);
        namaKoleksiComboBox.setFont(new Font("Arial", Font.PLAIN, 12));
        namaKoleksiComboBox.addActionListener(this);
        namaKoleksiComboBox.setFocusable(false);
        panel.add(namaKoleksiComboBox);

        koleksiLabel.setForeground(Color.BLACK);
        koleksiLabel.setBounds(30, 30, 180, 30);
        panel.add(koleksiLabel);

        judulBukuComboBox = new JComboBox();
        judulBukuComboBox.addItem("Pilih Koleksi");
        judulBukuComboBox.setBounds(175, 80, 385, 30);
        judulBukuComboBox.setFont(new Font("Arial", Font.PLAIN, 12));
        judulBukuComboBox.addActionListener(this);
        judulBukuComboBox.setFocusable(false);
        panel.add(judulBukuComboBox);

        bukuLabel.setForeground(Color.BLACK);
        bukuLabel.setBounds(30, 80, 180, 30);
        panel.add(bukuLabel);

        jumlahField.setBounds(175, 130, 385, 30);
        jumlahField.setFont(new Font("Arial", Font.PLAIN, 12));
        panel.add(jumlahField);

        jumlahLabel.setForeground(Color.BLACK);
        jumlahLabel.setBounds(30, 130, 180, 30);
        panel.add(jumlahLabel);

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
    public boolean cekJumlah(String s){
        try{
            Integer tes = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException T){
        }
        return false;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JMenuItem item){
            String option = item.getText();
            if (option.equals("Menu Utama")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new MenuUtama(this.tokoBuku);
                    dispose();
                }
            } else if (option.equals("Tambah Buku Baru")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new TambahBukuBaru(this.tokoBuku);
                    dispose();
                }
            } else if (option.equals("Tambah Stok Buku")) {
                // do nothing karena sudah berada pada page yang dituju
            } else if (option.equals("Hapus Buku")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new HapusBuku(this.tokoBuku);
                    dispose();
                }
            } else if (option.equals("Tambah Koleksi Baru")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new TambahKoleksiBaru(this.tokoBuku);
                    dispose();
                }
            } else if (option.equals("Hapus Koleksi")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new HapusKoleksi(this.tokoBuku);
                    dispose();
                }
            } else if (option.equals("Tambah Transaksi Baru")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new TambahTransaksiBaru(this.tokoBuku);
                    dispose();
                }
            } else if (option.equals("Tampilkan Riwayat Transaksi")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new TampilkanRiwayatTransaksi(this.tokoBuku);
                    dispose();
                }
            } else if (option.equals("Tambah Pelanggan Baru")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new TambahPelangganBaru(this.tokoBuku);
                    dispose();
                }
            } else if (option.equals("Keluar")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin keluar? Anda akan diminta untuk memasukkan id dan password anda kembali.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new Keluar(this.tokoBuku);
                    dispose();
                }
            } else if (option.equals("Akhiri Sesi")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin mengakhiri sesi ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        } else if (e.getSource() == namaKoleksiComboBox) {
            Integer index = namaKoleksiComboBox.getSelectedIndex()-1;
            if (index == -1) {
                int itemCount = judulBukuComboBox.getItemCount();
                for(int i = 0; i < itemCount; i++){
                    judulBukuComboBox.removeItemAt(0);
                }
                judulBukuComboBox.addItem("Pilih Koleksi");
            } else if (index>=0) {
                int itemCount = judulBukuComboBox.getItemCount();
                for(int i = 0; i < itemCount; i++){
                    judulBukuComboBox.removeItemAt(0);
                }
                judulBukuComboBox.addItem("Pilih Buku");
                this.daftarBuku = daftarKoleksi.get(index).getDaftarBuku();
                for (Buku k: daftarBuku) {
                    judulBukuComboBox.addItem(k.getJudulBuku());
                }
            }
        } else if (e.getSource() == judulBukuComboBox) {
            indexBuku = judulBukuComboBox.getSelectedIndex()-1;
        } else if (e.getSource() == UpdateBtn) {
            if (indexBuku >=0) {
                if (cekJumlah(jumlahField.getText())) {
                    if (Integer.parseInt(jumlahField.getText()) < 1) {
                        JOptionPane.showMessageDialog(null, "Jumlah tidak boleh nol ataupun kurang!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    } else {
                        int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin jumlah yang Anda masukkan sudah tepat?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                        if (res == JOptionPane.YES_OPTION) {
                            Integer jumlahBuku = daftarBuku.get(indexBuku).getJumlahBuku() + Integer.parseInt(jumlahField.getText());
                            daftarBuku.get(indexBuku).setJumlahBuku(jumlahBuku);
                            int itemCount = judulBukuComboBox.getItemCount();
                            for (int i = 0; i < itemCount; i++) {
                                judulBukuComboBox.removeItemAt(0);
                            }
                            judulBukuComboBox.addItem("Pilih Buku");
                            for (Buku k : daftarBuku) {
                                judulBukuComboBox.addItem(k.getJudulBuku());
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Anda hanya dapat memasukkan angka ke dalam jumlah stok!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }
}
