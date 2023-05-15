import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class HapusKoleksi extends JFrame implements ActionListener {
    private TokoBuku tokoBuku;
    private JLabel headerLabel= new JLabel("Hapus Koleksi");
    private JLabel namaKoleksiLabel = new JLabel("Nama Koleksi");
    private JTextField namaKoleksiField = new JTextField();
    private JButton hapusKoleksiBtn = new JButton("Hapus Koleksi");
    private JPanel panel = new JPanel();

    public ArrayList<Koleksi> koleksi = new ArrayList<Koleksi>();
//    public ArrayList<Buku> daftarbuku = new ArrayList<Buku>();
    private JMenuBar menuBar = new JMenuBar();
    private JMenu fileMenu = new JMenu("File");
    private JMenuItem[] menuItems = new JMenuItem[]{};
    private String[] Labels = new String[] {
            "Menu Utama", "Tambah Buku Baru", "Hapus Buku", "Tambah Koleksi Baru",
            "Hapus Koleksi", "Tambah Transaksi Baru",
            "Tampilkan Riwayat Transaksi", "Tambah Pelanggan Baru",
            "Keluar", "Akhiri Sesi"
    };

    public HapusKoleksi(TokoBuku tokoBuku){
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

        add(headerLabel, BorderLayout.NORTH);
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 30));
        headerLabel.setForeground(Color.BLACK);
        headerLabel.setBounds(0,20,800,100);

        namaKoleksiLabel.setBounds(40,30,230,30);
        namaKoleksiLabel.setForeground(Color.BLACK);
        panel.add(namaKoleksiLabel);
        namaKoleksiField.setBounds(150,30,200,30);
        panel.add(namaKoleksiField);
        hapusKoleksiBtn.addActionListener(this);
        hapusKoleksiBtn.setBackground(Color.BLACK);
        hapusKoleksiBtn.setForeground(Color.WHITE);
        hapusKoleksiBtn.setBounds(130, 140, 150, 30);
        panel.add(hapusKoleksiBtn);

        panel.setBackground(new Color(255, 255, 255,50));;
        panel.setBounds(200,100,400,200);
        panel.setLayout(null);
        add(panel,BorderLayout.CENTER);

        this.getContentPane().setBackground(new Color(92, 64, 51));
        setLayout(null);
        setIconImage((new ImageIcon(this.getClass().getResource("icon.png"))).getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(360, 200, 880, 495);
        setVisible(true);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == hapusKoleksiBtn)
        {
            if(namaKoleksiField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Nama Koleksi tidak boleh kosong");
            }
            else
            {
                int res = JOptionPane.showConfirmDialog(null,"Apakah anda yakin ingin menghapus koleksi ini?","Hapus Koleksi",JOptionPane.YES_NO_OPTION);
                int res2 = -1;
                if (res == 0)
                {
                    int ketemu = -1;
                    for (int i = 0; i < this.tokoBuku.getDaftarKoleksi().size() ; i++) {
                        if (this.tokoBuku.getDaftarKoleksi().get(i).getNamaKoleksi().equals(namaKoleksiField.getText())){
                            this.tokoBuku.getDaftarKoleksi().remove(i);
                            JOptionPane.showMessageDialog(null, "Koleksi berhasil dihapus");
                            ketemu = 1;
                        }
                    }
                    if(ketemu == -1)
                    {
                        JOptionPane.showMessageDialog(null, "Koleksi tersebut tidak ditemukan");
                    }
                    res2 = JOptionPane.showConfirmDialog(null,"Apakah anda ingin menghapus koleksi lainnya?","Hapus Koleksi",JOptionPane.YES_NO_OPTION);
                }

                if(res2 == 0)
                {
                    namaKoleksiField.setText("");
                }
                else if(res2 == 1)
                {
                    dispose();
                    new MenuUtama(this.tokoBuku);
                }
            }
        }
        if(e.getSource() instanceof JMenuItem item){
            String option = item.getText();
            if (option.equals("Menu Utama")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new MenuUtama(this.tokoBuku);
                    dispose();
                }
            }
            else if (option.equals("Tambah Buku Baru")) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin berpindah halaman? Proses yang belum anda simpan tidak akan disimpan.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new TambahBukuBaru(this.tokoBuku);
                    dispose();
                }
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
                // do nothing karena sudah berada pada page yang dituju
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
        }
    }
}
