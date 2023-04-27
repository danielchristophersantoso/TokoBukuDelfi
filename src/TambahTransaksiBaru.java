import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TambahTransaksiBaru extends JFrame implements ActionListener {
    private TokoBuku tokoBuku;
    private JLabel headerLabel= new JLabel("Tambah Transaksi Baru");
    private JLabel namaPelangganLabel = new JLabel("Nama Pelanggan");
    private JTextField namaPelangganField = new JTextField();
//    private JLabel IDPelanggan = new JLabel("ID Pelanggan");
//    private JTextField IDPelangganField = new JTextField();
    private JLabel namaBukuLabel = new JLabel("Nama Buku");
    private JComboBox dropDownListBuku = new JComboBox();
    private JComboBox dropDownListBuku2 = new JComboBox();
    private JComboBox dropDownListBuku3 = new JComboBox();
    private JComboBox dropDownListBuku4 = new JComboBox();
    private JComboBox dropDownListBuku5 = new JComboBox();

    private JLabel jumlahBukuLabel = new JLabel("Jumlah Buku");
    private JTextField jumlahBukuField = new JTextField();
    private JTextField jumlahBukuField2 = new JTextField();
    private JTextField jumlahBukuField3 = new JTextField();
    private JTextField jumlahBukuField4 = new JTextField();
    private JTextField jumlahBukuField5 = new JTextField();

    private JButton tambahTransaksibtn = new JButton("Tambah Transaksi");
    private JPanel panel = new JPanel();
    private JMenuBar menuBar = new JMenuBar();
    private JMenu fileMenu = new JMenu("File");
    private JMenuItem[] menuItems = new JMenuItem[]{};
    private String[] Labels = new String[] {
            "Menu Utama", "Tambah Buku Baru", "Hapus Buku", "Tambah Koleksi Baru",
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
        headerLabel.setBounds(0,0,800,65);
        add(headerLabel, BorderLayout.NORTH);

        namaPelangganLabel.setBounds(35,15,230,25);
        namaPelangganLabel.setForeground(Color.BLACK);
        panel.add(namaPelangganLabel);
        namaPelangganField.setBounds(170,15,200,25);
        namaPelangganField.setForeground(Color.BLACK);
        panel.add(namaPelangganField);

        namaBukuLabel.setBounds(35,50,200,30);
        namaBukuLabel.setForeground(Color.BLACK);
        panel.add(namaBukuLabel);

        dropDownListBuku.setBounds(35,85,160,30);
        dropDownListBuku.setForeground(Color.BLACK);
        panel.add(dropDownListBuku);
        dropDownListBuku2.setBounds(35,130,160,30);
        dropDownListBuku2.setForeground(Color.BLACK);
        panel.add(dropDownListBuku2);
        dropDownListBuku3.setBounds(35,175,160,30);
        dropDownListBuku3.setForeground(Color.BLACK);
        panel.add(dropDownListBuku3);
        dropDownListBuku4.setBounds(35,220,160,30);
        dropDownListBuku4.setForeground(Color.BLACK);
        panel.add(dropDownListBuku4);
        dropDownListBuku5.setBounds(35,265,160,30);
        dropDownListBuku5.setForeground(Color.BLACK);
        panel.add(dropDownListBuku5);


        jumlahBukuLabel.setBounds(220,50,200,30);
        jumlahBukuLabel.setForeground(Color.BLACK);
        panel.add(jumlahBukuLabel);

        jumlahBukuField.setBounds(220,85,160,30);
        jumlahBukuField.setForeground(Color.BLACK);
        panel.add(jumlahBukuField);
        jumlahBukuField2.setBounds(220,130,160,30);
        jumlahBukuField2.setForeground(Color.BLACK);
        panel.add(jumlahBukuField2);
        jumlahBukuField3.setBounds(220,175,160,30);
        jumlahBukuField3.setForeground(Color.BLACK);
        panel.add(jumlahBukuField3);
        jumlahBukuField4.setBounds(220,220,160,30);
        jumlahBukuField4.setForeground(Color.BLACK);
        panel.add(jumlahBukuField4);
        jumlahBukuField5.setBounds(220,265,160,30);
        jumlahBukuField5.setForeground(Color.BLACK);
        panel.add(jumlahBukuField5);


        tambahTransaksibtn.addActionListener(this);
        tambahTransaksibtn.setBounds(100, 310, 200, 30);
        tambahTransaksibtn.setBackground(Color.BLACK);
        tambahTransaksibtn.setForeground(Color.WHITE);
        panel.add(tambahTransaksibtn);

        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setBounds(200,70,400,350);
        add(panel,BorderLayout.CENTER);


        getContentPane().setBackground(Color.lightGray);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(300, 90, 800, 490);
        setVisible(true);
        setResizable(false);

        dropDownListBuku.addItem("");
        dropDownListBuku2.addItem("");
        dropDownListBuku3.addItem("");
        dropDownListBuku4.addItem("");
        dropDownListBuku5.addItem("");
        for (int i = 0; i < this.tokoBuku.getDaftarKoleksi().size();i++)
        {
            for (int j = 0; j < this.tokoBuku.getDaftarKoleksi().get(i).getDaftarBuku().size(); j++) {
                dropDownListBuku.addItem(this.tokoBuku.getDaftarKoleksi().get(i).getDaftarBuku().get(j).getJudulBuku());
                dropDownListBuku2.addItem(this.tokoBuku.getDaftarKoleksi().get(i).getDaftarBuku().get(j).getJudulBuku());
                dropDownListBuku3.addItem(this.tokoBuku.getDaftarKoleksi().get(i).getDaftarBuku().get(j).getJudulBuku());
                dropDownListBuku4.addItem(this.tokoBuku.getDaftarKoleksi().get(i).getDaftarBuku().get(j).getJudulBuku());
                dropDownListBuku5.addItem(this.tokoBuku.getDaftarKoleksi().get(i).getDaftarBuku().get(j).getJudulBuku());
            }
        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == tambahTransaksibtn) {
            String namaPelanggan = namaPelangganField.getText();
            int ketemu = -1;
            int index = -1;
            for (int i = 0; i < this.tokoBuku.getDaftarPelanggan().size(); i++) {
                if (namaPelanggan.equals(this.tokoBuku.getDaftarPelanggan().get(i).getNama())) {
                    ketemu = 1;
                    index = i;
                }
            }
            if(ketemu == -1)
            {
                int res = JOptionPane.showConfirmDialog(null, "Pelanggan tidak ditemukan, mohon daftarkan pelanggan terlebih dahulu, apakah anda ingin ke menu tambah pelanggan?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    new TambahPelangganBaru(tokoBuku);
                    dispose();
                }
            }
            else
            {
                int banyakbuku = 0;
                ArrayList<String> daftarJudulBuku = new ArrayList<>();
                ArrayList<Integer> daftarJumlahBuku = new ArrayList<>();
                ArrayList<Buku> daftarBukuTransaksi = new ArrayList<>();
                int min = 60000;
                int max = 70000;
                Double randomharga = Math.floor(Math.random() * (max - min + 1) + min);
                Double subtotaltransaksi = 0.0;
                String IDPelanggan = this.tokoBuku.getDaftarPelanggan().get(index).getId();

                // validasi kalo dropdownlist tidak kosong tapi jumlah buku field kosong
                if (dropDownListBuku.getSelectedItem().toString().equals("") && !jumlahBukuField.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "ERROR, jumlah buku diisi tanpa memilih judul buku");
                    return;
                }
                else if (dropDownListBuku2.getSelectedItem().toString().equals("") && !jumlahBukuField2.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "ERROR, jumlah buku diisi tanpa memilih judul buku");
                    return;
                }
                else if (dropDownListBuku3.getSelectedItem().toString().equals("") && !jumlahBukuField3.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "ERROR, jumlah buku diisi tanpa memilih judul buku");
                    return;
                }
                else if (dropDownListBuku4.getSelectedItem().toString().equals("") && !jumlahBukuField4.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "ERROR, jumlah buku diisi tanpa memilih judul buku");
                    return;
                }
                else if (dropDownListBuku5.getSelectedItem().toString().equals("") && !jumlahBukuField5.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "ERROR, jumlah buku diisi tanpa memilih judul buku");
                    return;
                }

                // validasi kalo jumlah buku field tidak kosong tapi dropdownlist kosong
                if (!dropDownListBuku.getSelectedItem().toString().equals("") && jumlahBukuField.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "ERROR, judul buku diisi tanpa mengisi jumlah buku");
                    return;
                }
                else if (!dropDownListBuku2.getSelectedItem().toString().equals("") && jumlahBukuField2.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "ERROR, judul buku diisi tanpa mengisi jumlah buku");
                    return;
                }
                else if (!dropDownListBuku3.getSelectedItem().toString().equals("") && jumlahBukuField3.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "ERROR, judul buku diisi tanpa mengisi jumlah buku");
                    return;
                }
                else if (!dropDownListBuku4.getSelectedItem().toString().equals("") && jumlahBukuField4.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "ERROR, judul buku diisi tanpa mengisi jumlah buku");
                    return;
                }
                else if (!dropDownListBuku5.getSelectedItem().toString().equals("") && jumlahBukuField5.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "ERROR, judul buku diisi tanpa mengisi jumlah buku");
                    return;
                }

                // validasi kalo jumlah buku field tidak kosong tapi jumlah buku field tidak angka
                if (!jumlahBukuField.getText().equals("") && !jumlahBukuField.getText().matches("[0-9]+"))
                {
                    JOptionPane.showMessageDialog(null, "ERROR, jumlah buku harus angka");
                    return;
                }
                else if (!jumlahBukuField2.getText().equals("") && !jumlahBukuField2.getText().matches("[0-9]+"))
                {
                    JOptionPane.showMessageDialog(null, "ERROR, jumlah buku harus angka");
                    return;
                }
                else if (!jumlahBukuField3.getText().equals("") && !jumlahBukuField3.getText().matches("[0-9]+"))
                {
                    JOptionPane.showMessageDialog(null, "ERROR, jumlah buku harus angka");
                    return;
                }
                else if (!jumlahBukuField4.getText().equals("") && !jumlahBukuField4.getText().matches("[0-9]+"))
                {
                    JOptionPane.showMessageDialog(null, "ERROR, jumlah buku harus angka");
                    return;
                }
                else if (!jumlahBukuField5.getText().equals("") && !jumlahBukuField5.getText().matches("[0-9]+"))
                {
                    JOptionPane.showMessageDialog(null, "ERROR, jumlah buku harus angka");
                    return;
                }

                // untuk ambil value dari dropdownlist buku
                if (!dropDownListBuku.getSelectedItem().toString().equals(""))
                {
                    daftarJudulBuku.add(dropDownListBuku.getSelectedItem().toString());
                }
                if (!dropDownListBuku2.getSelectedItem().toString().equals(""))
                {
                    daftarJudulBuku.add(dropDownListBuku2.getSelectedItem().toString());
                }
                if (!dropDownListBuku3.getSelectedItem().toString().equals(""))
                {
                    daftarJudulBuku.add(dropDownListBuku3.getSelectedItem().toString());
                }
                if (!dropDownListBuku4.getSelectedItem().toString().equals(""))
                {
                    daftarJudulBuku.add(dropDownListBuku4.getSelectedItem().toString());
                }
                if (!dropDownListBuku5.getSelectedItem().toString().equals(""))
                {
                    daftarJudulBuku.add(dropDownListBuku5.getSelectedItem().toString());
                }
                // untuk ambil value dari textfield jumlah buku
                if(!jumlahBukuField.getText().equals(""))
                {
                    daftarJumlahBuku.add(Integer.parseInt(jumlahBukuField.getText()));
                }
                if(!jumlahBukuField2.getText().equals(""))
                {
                    daftarJumlahBuku.add(Integer.parseInt(jumlahBukuField2.getText()));
                }
                if(!jumlahBukuField3.getText().equals(""))
                {
                    daftarJumlahBuku.add(Integer.parseInt(jumlahBukuField3.getText()));
                }
                if(!jumlahBukuField4.getText().equals(""))
                {
                    daftarJumlahBuku.add(Integer.parseInt(jumlahBukuField4.getText()));
                }
                if(!jumlahBukuField5.getText().equals(""))
                {
                    daftarJumlahBuku.add(Integer.parseInt(jumlahBukuField5.getText()));
                }

                int totalbukuyangdibeli = 0;
                for (int i = 0; i < daftarJudulBuku.size(); i++) {
                    String buku = daftarJudulBuku.get(i);
                    int jumlahBuku = daftarJumlahBuku.get(i);
                    Buku bukuTransaksi = new Buku(buku, jumlahBuku);
                    daftarBukuTransaksi.add(bukuTransaksi);
                    totalbukuyangdibeli += jumlahBuku;
                }

                String ID = String.format("Trans%03d",this.tokoBuku.getDaftarTransaksi().size()+1);
//                nama kasirnya gak dapet...
                String namaKasir = tokoBuku.getKasir().getNama();
                subtotaltransaksi = totalbukuyangdibeli * randomharga;

                System.out.println("ID = " + ID);
                System.out.println("nama kasir = " + namaKasir);
                System.out.println("daftar buku transaksi = ");
                for (int i = 0; i < daftarBukuTransaksi.size(); i++) {
                    System.out.println(daftarBukuTransaksi.get(i).getJudulBuku());
                }
                System.out.println("nama pelanggan = " + namaPelanggan);
                System.out.println("ID pelanggan = " + IDPelanggan);
                System.out.println("total buku yang dibeli = " + totalbukuyangdibeli);
                System.out.println("harga satuan = " + randomharga);
                System.out.println("Subtotal transaksi = " + subtotaltransaksi);
                Transaksi transaksi = new Transaksi(ID, namaKasir, daftarBukuTransaksi,namaPelanggan,IDPelanggan,subtotaltransaksi);
                this.tokoBuku.getDaftarTransaksi().add(transaksi);
                JOptionPane.showMessageDialog(null, "Transaksi berhasil ditambahkan");



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
