import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TambahTransaksiBaru extends JFrame implements ActionListener {
    private TokoBuku tokoBuku;
    private JLabel headerLabel= new JLabel("Tambah Transaksi Baru");
    private JLabel namaPelangganLabel = new JLabel("Nama Pelanggan");
    private JTextField namaPelangganField = new JTextField();
    private JLabel IDPelanggan = new JLabel("ID Pelanggan");
    private JTextField IDPelangganField = new JTextField();
    private JLabel namaBukuLabel = new JLabel("Nama Buku");
    private JComboBox dropDownListBuku = new JComboBox();
    private JLabel jumlahBukuLabel = new JLabel("Jumlah Buku");
    private JTextField jumlahBukuField = new JTextField();
    private JButton tambahTransaksibtn = new JButton("Tambah Transaksi");
    private JPanel panel = new JPanel();
    private JMenuBar menuBar = new JMenuBar();
    private JMenu fileMenu = new JMenu("File");
    private JMenuItem[] menuItems = new JMenuItem[]{};
    private String[] Labels = new String[] {
            "Tambah Buku Baru", "Hapus Buku", "Tambah Koleksi Baru",
            "Hapus Koleksi", "Tambah Transaksi Baru",
            "Tampilkan Riwayat Transaksi", "Tambah Pelanggan Baru",
            "Keluar", "Akhiri Sesi"
    };

    public TambahTransaksiBaru(TokoBuku tokoBuku){
        this.tokoBuku = tokoBuku;
        this.setTitle("Tambah Transaksi Baru");
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
        headerLabel.setBounds(0,0,800,80);
        add(headerLabel, BorderLayout.NORTH);

        namaPelangganLabel.setBounds(35,30,230,30);
        namaPelangganLabel.setForeground(Color.BLACK);
        panel.add(namaPelangganLabel);
        namaPelangganField.setBounds(170,30,200,30);
        namaPelangganField.setForeground(Color.BLACK);
        panel.add(namaPelangganField);
        IDPelanggan.setBounds(35,80,200,30);
        IDPelanggan.setForeground(Color.BLACK);
        panel.add(IDPelanggan);
        IDPelangganField.setBounds(170,80,200,30);
        IDPelangganField.setForeground(Color.BLACK);
        panel.add(IDPelangganField);
        namaBukuLabel.setBounds(35,130,200,30);
        namaBukuLabel.setForeground(Color.BLACK);
        panel.add(namaBukuLabel);
        dropDownListBuku.setBounds(170,130,200,30);
        dropDownListBuku.setForeground(Color.BLACK);
        panel.add(dropDownListBuku);
        jumlahBukuLabel.setBounds(35,180,200,30);
        jumlahBukuLabel.setForeground(Color.BLACK);
        panel.add(jumlahBukuLabel);

        jumlahBukuField.setBounds(170,180,200,30);
        jumlahBukuField.setForeground(Color.BLACK);
        panel.add(jumlahBukuField);
        tambahTransaksibtn.addActionListener(this);
        tambahTransaksibtn.setBounds(100, 250, 200, 30);
        tambahTransaksibtn.setBackground(Color.BLACK);
        tambahTransaksibtn.setForeground(Color.WHITE);
        panel.add(tambahTransaksibtn);

        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setBounds(200,80,400,350);
        add(panel,BorderLayout.CENTER);


        getContentPane().setBackground(Color.lightGray);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(300, 90, 800, 490);
        setVisible(true);
        setResizable(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JMenuItem item){
            String option = item.getText();
            if (option.equals("Tambah Buku Baru")) {
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
                // do nothing karena sudah berada pada page yang dituju
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
