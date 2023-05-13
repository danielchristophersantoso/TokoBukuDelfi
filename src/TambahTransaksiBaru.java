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
    private JLabel namaKoleksiLabel = new JLabel("Nama Koleksi");
    private JLabel namaPenulisLabel = new JLabel("Nama Penulis");
    private ArrayList<Koleksi> daftarKoleksi;
    private ArrayList<Buku> daftarBuku;
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

    private JComboBox dropDownListKoleksi = new JComboBox();
    private JComboBox dropDownListKoleksi2 = new JComboBox();
    private JComboBox dropDownListKoleksi3 = new JComboBox();
    private JComboBox dropDownListKoleksi4 = new JComboBox();
    private JComboBox dropDownListKoleksi5 = new JComboBox();

    private JTextField namaPenulisField = new JTextField();
    private JTextField namaPenulisField2 = new JTextField();
    private JTextField namaPenulisField3 = new JTextField();
    private JTextField namaPenulisField4 = new JTextField();
    private JTextField namaPenulisField5 = new JTextField();

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
        headerLabel.setBounds(0,0,800,65);
        add(headerLabel, BorderLayout.NORTH);

        namaPelangganLabel.setBounds(25,15,230,25);
        namaPelangganLabel.setForeground(Color.BLACK);
        panel.add(namaPelangganLabel);
        namaPelangganField.setBounds(170,15,570,25);
        namaPelangganField.setForeground(Color.BLACK);
        panel.add(namaPelangganField);

        namaKoleksiLabel.setBounds(25,50,200,30);
        namaKoleksiLabel.setForeground(Color.BLACK);
        panel.add(namaKoleksiLabel);

        dropDownListKoleksi.setBounds(25,85,160,30);
        dropDownListKoleksi.setForeground(Color.BLACK);
        panel.add(dropDownListKoleksi);
        dropDownListKoleksi.addActionListener(this);
        dropDownListKoleksi2.setBounds(25,130,160,30);
        dropDownListKoleksi2.setForeground(Color.BLACK);
        panel.add(dropDownListKoleksi2);
        dropDownListKoleksi2.addActionListener(this);
        dropDownListKoleksi3.setBounds(25,175,160,30);
        dropDownListKoleksi3.setForeground(Color.BLACK);
        panel.add(dropDownListKoleksi3);
        dropDownListKoleksi3.addActionListener(this);
        dropDownListKoleksi4.setBounds(25,220,160,30);
        dropDownListKoleksi4.setForeground(Color.BLACK);
        panel.add(dropDownListKoleksi4);
        dropDownListKoleksi4.addActionListener(this);
        dropDownListKoleksi5.setBounds(25,265,160,30);
        dropDownListKoleksi5.setForeground(Color.BLACK);
        panel.add(dropDownListKoleksi5);
        dropDownListKoleksi5.addActionListener(this);

        namaBukuLabel.setBounds(210,50,160,30);
        namaBukuLabel.setForeground(Color.BLACK);
        panel.add(namaBukuLabel);

        dropDownListBuku.setBounds(210,85,160,30);
        dropDownListBuku.setForeground(Color.BLACK);
        panel.add(dropDownListBuku);
        dropDownListBuku.addActionListener(this);
        dropDownListBuku2.setBounds(210,130,160,30);
        dropDownListBuku2.setForeground(Color.BLACK);
        panel.add(dropDownListBuku2);
        dropDownListBuku2.addActionListener(this);
        dropDownListBuku3.setBounds(210,175,160,30);
        dropDownListBuku3.setForeground(Color.BLACK);
        panel.add(dropDownListBuku3);
        dropDownListBuku3.addActionListener(this);
        dropDownListBuku4.setBounds(210,220,160,30);
        dropDownListBuku4.setForeground(Color.BLACK);
        panel.add(dropDownListBuku4);
        dropDownListBuku4.addActionListener(this);
        dropDownListBuku5.setBounds(210,265,160,30);
        dropDownListBuku5.setForeground(Color.BLACK);
        panel.add(dropDownListBuku5);
        dropDownListBuku5.addActionListener(this);


        namaPenulisLabel.setBounds(395,50,160,30);
        namaPenulisLabel.setForeground(Color.BLACK);
        panel.add(namaPenulisLabel);

        namaPenulisField.setBounds(395,85,160,30);
        namaPenulisField.setForeground(Color.BLACK);
        panel.add(namaPenulisField);
        namaPenulisField2.setBounds(395,130,160,30);
        namaPenulisField2.setForeground(Color.BLACK);
        panel.add(namaPenulisField2);
        namaPenulisField3.setBounds(395,175,160,30);
        namaPenulisField3.setForeground(Color.BLACK);
        panel.add(namaPenulisField3);
        namaPenulisField4.setBounds(395,220,160,30);
        namaPenulisField4.setForeground(Color.BLACK);
        panel.add(namaPenulisField4);
        namaPenulisField5.setBounds(395,265,160,30);
        namaPenulisField5.setForeground(Color.BLACK);
        panel.add(namaPenulisField5);

        jumlahBukuLabel.setBounds(580,50,160,30);
        jumlahBukuLabel.setForeground(Color.BLACK);
        panel.add(jumlahBukuLabel);

        jumlahBukuField.setBounds(580,85,160,30);
        jumlahBukuField.setForeground(Color.BLACK);
        panel.add(jumlahBukuField);
        jumlahBukuField2.setBounds(580,130,160,30);
        jumlahBukuField2.setForeground(Color.BLACK);
        panel.add(jumlahBukuField2);
        jumlahBukuField3.setBounds(580,175,160,30);
        jumlahBukuField3.setForeground(Color.BLACK);
        panel.add(jumlahBukuField3);
        jumlahBukuField4.setBounds(580,220,160,30);
        jumlahBukuField4.setForeground(Color.BLACK);
        panel.add(jumlahBukuField4);
        jumlahBukuField5.setBounds(580,265,160,30);
        jumlahBukuField5.setForeground(Color.BLACK);
        panel.add(jumlahBukuField5);




        tambahTransaksibtn.addActionListener(this);
        tambahTransaksibtn.setBounds(230, 310, 300, 30);
        tambahTransaksibtn.setBackground(Color.BLACK);
        tambahTransaksibtn.setForeground(Color.WHITE);
        panel.add(tambahTransaksibtn);

        panel.setLayout(null);
        panel.setBackground(new Color(255, 255, 255,50));
        panel.setBounds(13,70,760,350);
        add(panel,BorderLayout.CENTER);


        getContentPane().setBackground(new Color(92, 64, 51));
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(300, 90, 800, 490);
        setVisible(true);
        setResizable(false);


        dropDownListKoleksi.addItem("");
        dropDownListKoleksi2.addItem("");
        dropDownListKoleksi3.addItem("");
        dropDownListKoleksi4.addItem("");
        dropDownListKoleksi5.addItem("");
//        dropDownListBuku.addItem("");
//        dropDownListBuku2.addItem("");
//        dropDownListBuku3.addItem("");
//        dropDownListBuku4.addItem("");
//        dropDownListBuku5.addItem("");
        namaPenulisField.setEditable(false);
        namaPenulisField2.setEditable(false);
        namaPenulisField3.setEditable(false);
        namaPenulisField4.setEditable(false);
        namaPenulisField5.setEditable(false);

        this.daftarKoleksi = this.tokoBuku.getDaftarKoleksi();
        for (Koleksi j: daftarKoleksi) {
            dropDownListKoleksi.addItem(j.getNamaKoleksi());
            dropDownListKoleksi2.addItem(j.getNamaKoleksi());
            dropDownListKoleksi3.addItem(j.getNamaKoleksi());
            dropDownListKoleksi4.addItem(j.getNamaKoleksi());
            dropDownListKoleksi5.addItem(j.getNamaKoleksi());
        }
//        for (int i = 0; i < this.tokoBuku.getDaftarKoleksi().size();i++)
//        {
//            for (int j = 0; j < this.tokoBuku.getDaftarKoleksi().get(i).getDaftarBuku().size(); j++) {
//                dropDownListBuku.addItem(this.tokoBuku.getDaftarKoleksi().get(i).getDaftarBuku().get(j).getJudulBuku());
//                dropDownListBuku2.addItem(this.tokoBuku.getDaftarKoleksi().get(i).getDaftarBuku().get(j).getJudulBuku());
//                dropDownListBuku3.addItem(this.tokoBuku.getDaftarKoleksi().get(i).getDaftarBuku().get(j).getJudulBuku());
//                dropDownListBuku4.addItem(this.tokoBuku.getDaftarKoleksi().get(i).getDaftarBuku().get(j).getJudulBuku());
//                dropDownListBuku5.addItem(this.tokoBuku.getDaftarKoleksi().get(i).getDaftarBuku().get(j).getJudulBuku());
//            }
//        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == dropDownListKoleksi)
        {
            int index = dropDownListKoleksi.getSelectedIndex()-1;
            if (index == -1) {
                int itemCount = dropDownListBuku.getItemCount();
                for(int i = 0; i < itemCount; i++){
                    dropDownListBuku.removeItemAt(0);
                }
                dropDownListBuku.addItem("");
            }
            else if (index>=0) {
                int itemCount = dropDownListBuku.getItemCount();
                for(int i = 0; i < itemCount; i++){
                    dropDownListBuku.removeItemAt(0);
                }
                dropDownListBuku.addItem("");
                this.daftarBuku = daftarKoleksi.get(index).getDaftarBuku();
                for (Buku k: daftarBuku) {
                    dropDownListBuku.addItem(k.getJudulBuku());
                }
            }
        }
        if (e.getSource() == dropDownListKoleksi2)
        {
//            System.out.println("masuk");
            int index = dropDownListKoleksi2.getSelectedIndex()-1;
            if (index == -1) {
                int itemCount = dropDownListBuku2.getItemCount();
                for(int i = 0; i < itemCount; i++){
                    dropDownListBuku2.removeItemAt(0);
                }
                dropDownListBuku2.addItem("");
            }
            else if (index>=0) {
                int itemCount = dropDownListBuku2.getItemCount();
                for(int i = 0; i < itemCount; i++){
                    dropDownListBuku2.removeItemAt(0);
                }
                dropDownListBuku2.addItem("");
                this.daftarBuku = daftarKoleksi.get(index).getDaftarBuku();
                for (Buku k: daftarBuku) {
                    dropDownListBuku2.addItem(k.getJudulBuku());
                }
            }
        }
        if (e.getSource() == dropDownListKoleksi3)
        {
//            System.out.println("masuk");
            int index = dropDownListKoleksi3.getSelectedIndex()-1;
            if (index == -1) {
                int itemCount = dropDownListBuku3.getItemCount();
                for(int i = 0; i < itemCount; i++){
                    dropDownListBuku3.removeItemAt(0);
                }
                dropDownListBuku3.addItem("");
            }
            else if (index>=0) {
                int itemCount = dropDownListBuku3.getItemCount();
                for(int i = 0; i < itemCount; i++){
                    dropDownListBuku3.removeItemAt(0);
                }
                dropDownListBuku3.addItem("");
                this.daftarBuku = daftarKoleksi.get(index).getDaftarBuku();
                for (Buku k: daftarBuku) {
                    dropDownListBuku3.addItem(k.getJudulBuku());
                }
            }
        }
        if (e.getSource() == dropDownListKoleksi4)
        {
//            System.out.println("masuk");
            int index = dropDownListKoleksi4.getSelectedIndex()-1;
            if (index == -1) {
                int itemCount = dropDownListBuku4.getItemCount();
                for(int i = 0; i < itemCount; i++){
                    dropDownListBuku4.removeItemAt(0);
                }
                dropDownListBuku4.addItem("");
            }
            else if (index>=0) {
                int itemCount = dropDownListBuku4.getItemCount();
                for(int i = 0; i < itemCount; i++){
                    dropDownListBuku4.removeItemAt(0);
                }
                dropDownListBuku4.addItem("");
                this.daftarBuku = daftarKoleksi.get(index).getDaftarBuku();
                for (Buku k: daftarBuku) {
                    dropDownListBuku4.addItem(k.getJudulBuku());
                }
            }
        }
        if (e.getSource() == dropDownListKoleksi5)
        {
//            System.out.println("masuk");
            int index = dropDownListKoleksi5.getSelectedIndex()-1;
            if (index == -1) {
                int itemCount = dropDownListBuku5.getItemCount();
                for(int i = 0; i < itemCount; i++){
                    dropDownListBuku5.removeItemAt(0);
                }
                dropDownListBuku5.addItem("");
            }
            else if (index>=0) {
                int itemCount = dropDownListBuku5.getItemCount();
                for(int i = 0; i < itemCount; i++){
                    dropDownListBuku5.removeItemAt(0);
                }
                dropDownListBuku5.addItem("");
                this.daftarBuku = daftarKoleksi.get(index).getDaftarBuku();
                for (Buku k: daftarBuku) {
                    dropDownListBuku5.addItem(k.getJudulBuku());
                }
            }
        }
        if (e.getSource() == dropDownListBuku)
        {
//            if (!(dropDownListBuku.getSelectedIndex() == 0) && !(dropDownListBuku2.getSelectedIndex() == 0)) {
//                if ((dropDownListBuku.getSelectedItem().equals(dropDownListBuku2.getSelectedItem()) || dropDownListBuku.getSelectedItem().equals(dropDownListBuku3.getSelectedItem()) || dropDownListBuku.getSelectedItem().equals(dropDownListBuku4.getSelectedItem()) || dropDownListBuku.getSelectedItem().equals(dropDownListBuku5.getSelectedItem())))
//                {
//                    JOptionPane.showMessageDialog(null, "Buku yang dipilih tidak boleh sama");
//                    dropDownListBuku.setSelectedIndex(0);
//                    return;
//                }
//            }
            int indexkoleksi = dropDownListKoleksi.getSelectedIndex()-1;
            int indexbuku = dropDownListBuku.getSelectedIndex()-1;
            if (indexbuku == -1) {
                namaPenulisField.setText("");
            }
            else if (indexbuku>=0) {
                String namapenulis = daftarKoleksi.get(indexkoleksi).getDaftarBuku().get(indexbuku).getPenulis();
                namaPenulisField.setText(namapenulis);
            }
        }
        if (e.getSource() == dropDownListBuku2)
        {
//            if (!(dropDownListBuku.getSelectedIndex() == 0) && !(dropDownListBuku2.getSelectedIndex() == 0) && (dropDownListBuku2.getSelectedIndex() == dropDownListBuku.getSelectedIndex() || dropDownListBuku2.getSelectedIndex() == dropDownListBuku3.getSelectedIndex() || dropDownListBuku2.getSelectedIndex() == dropDownListBuku4.getSelectedIndex() || dropDownListBuku2.getSelectedIndex() == dropDownListBuku5.getSelectedIndex()))
//            {
//                JOptionPane.showMessageDialog(null, "Buku yang dipilih tidak boleh sama");
//                dropDownListBuku2.setSelectedIndex(0);
//                return;
//            }
            int indexkoleksi = dropDownListKoleksi2.getSelectedIndex()-1;
            int indexbuku = dropDownListBuku2.getSelectedIndex()-1;
            if (indexbuku == -1) {
                namaPenulisField2.setText("");
            }
            else if (indexbuku>=0) {
                String namapenulis = daftarKoleksi.get(indexkoleksi).getDaftarBuku().get(indexbuku).getPenulis();
                namaPenulisField2.setText(namapenulis);
            }
        }
        if (e.getSource() == dropDownListBuku3)
        {
            int indexkoleksi = dropDownListKoleksi3.getSelectedIndex()-1;
            int indexbuku = dropDownListBuku3.getSelectedIndex()-1;
            if (indexbuku == -1) {
                namaPenulisField3.setText("");
            }
            else if (indexbuku>=0) {
                String namapenulis = daftarKoleksi.get(indexkoleksi).getDaftarBuku().get(indexbuku).getPenulis();
                namaPenulisField3.setText(namapenulis);
            }
        }
        if (e.getSource() == dropDownListBuku4)
        {
            int indexkoleksi = dropDownListKoleksi4.getSelectedIndex()-1;
            int indexbuku = dropDownListBuku4.getSelectedIndex()-1;
            if (indexbuku == -1) {
                namaPenulisField4.setText("");
            }
            else if (indexbuku>=0) {
                String namapenulis = daftarKoleksi.get(indexkoleksi).getDaftarBuku().get(indexbuku).getPenulis();
                namaPenulisField4.setText(namapenulis);
            }
        }
        if (e.getSource() == dropDownListBuku5)
        {
            int indexkoleksi = dropDownListKoleksi5.getSelectedIndex()-1;
            int indexbuku = dropDownListBuku5.getSelectedIndex()-1;
            if (indexbuku == -1) {
                namaPenulisField5.setText("");
            }
            else if (indexbuku>=0) {
                String namapenulis = daftarKoleksi.get(indexkoleksi).getDaftarBuku().get(indexbuku).getPenulis();
                namaPenulisField5.setText(namapenulis);
            }
        }
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
                ArrayList<String> daftarJudulBuku = new ArrayList<>();
                ArrayList<Integer> daftarJumlahBuku = new ArrayList<>();
                ArrayList<Buku> daftarBukuTransaksi = new ArrayList<>();
                int min = 60000;
                int max = 70000;
                Double randomharga = (Double) Math.floor(Math.random() * (max - min + 1) + min);
                Double subtotaltransaksi = (Double) 0.0;
                String IDPelanggan = this.tokoBuku.getDaftarPelanggan().get(index).getId();

                // validasi kalo semua fieldnya kosong
                if (dropDownListKoleksi.getSelectedItem().toString().equals("") && dropDownListKoleksi2.getSelectedItem().toString().equals("") && dropDownListKoleksi3.getSelectedItem().toString().equals("") && dropDownListKoleksi4.getSelectedItem().toString().equals("") && dropDownListKoleksi5.getSelectedItem().toString().equals("") && dropDownListBuku.getSelectedItem().toString().equals("") && jumlahBukuField.getText().equals("") && dropDownListBuku2.getSelectedItem().toString().equals("") && jumlahBukuField2.getText().equals("") && dropDownListBuku3.getSelectedItem().toString().equals("") && jumlahBukuField3.getText().equals("") && dropDownListBuku4.getSelectedItem().toString().equals("") && jumlahBukuField4.getText().equals("") && dropDownListBuku5.getSelectedItem().toString().equals("") && jumlahBukuField5.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "ERROR, semua field kosong");
                    return;
                }

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
                    daftarJumlahBuku.add(Integer.valueOf(Integer.parseInt(jumlahBukuField.getText())));
                }
                if(!jumlahBukuField2.getText().equals(""))
                {
                    daftarJumlahBuku.add(Integer.valueOf(Integer.parseInt(jumlahBukuField2.getText())));
                }
                if(!jumlahBukuField3.getText().equals(""))
                {
                    daftarJumlahBuku.add(Integer.valueOf(Integer.parseInt(jumlahBukuField3.getText())));
                }
                if(!jumlahBukuField4.getText().equals(""))
                {
                    daftarJumlahBuku.add(Integer.valueOf(Integer.parseInt(jumlahBukuField4.getText())));
                }
                if(!jumlahBukuField5.getText().equals(""))
                {
                    daftarJumlahBuku.add(Integer.valueOf(Integer.parseInt(jumlahBukuField5.getText())));
                }



                int totalbukuyangdibeli = 0;
                int indexKoleksi1 = 0, indexBuku1 = 0 , jumlahBuku1 = 0, newJumlahBuku1 = -1;
                int indexKoleksi2 = 0, indexBuku2 = 0 , jumlahBuku2 = 0, newJumlahBuku2 = -1;
                int indexKoleksi3 = 0, indexBuku3 = 0 , jumlahBuku3 = 0, newJumlahBuku3 = -1;
                int indexKoleksi4 = 0, indexBuku4 = 0 , jumlahBuku4 = 0, newJumlahBuku4 = -1;
                int indexKoleksi5 = 0, indexBuku5 = 0 , jumlahBuku5 = 0, newJumlahBuku5 = -1;

                if (dropDownListBuku.getSelectedItem() != "" && jumlahBukuField.getText() != "")
                {
                    indexKoleksi1 = dropDownListKoleksi.getSelectedIndex()-1;
                    indexBuku1 = dropDownListBuku.getSelectedIndex();
                    jumlahBuku1 = Integer.parseInt(jumlahBukuField.getText());
//                    System.out.println("Indeks koleksi 1 = " + indexKoleksi1);
//                    System.out.println("Indeks buku 1 = " + indexBuku1);
//                    System.out.println("jumlah buku sebelum dikuran = " + tokoBuku.getDaftarKoleksi().get(indexKoleksi1).getDaftarBuku().get(indexBuku1-1).getJumlahBuku());
                    Buku bukuTransaksi = tokoBuku.getDaftarKoleksi().get(indexKoleksi1).getDaftarBuku().get(indexBuku1-1);
//                    bukuTransaksi.setJumlahBuku(Integer.valueOf(Integer.parseInt(jumlahBukuField.getText())));
                    daftarBukuTransaksi.add(bukuTransaksi);
                    totalbukuyangdibeli += jumlahBuku1;
//                    System.out.println("Jumlah buku 1 = " + jumlahBuku1);
//                    System.out.println(tokoBuku.getDaftarKoleksi().get(indexKoleksi1).getDaftarBuku().get(indexBuku1-1).getJumlahBuku() - jumlahBuku1);
                    if (tokoBuku.getDaftarKoleksi().get(indexKoleksi1).getDaftarBuku().get(indexBuku1-1).getJumlahBuku() - jumlahBuku1 < 0)
                    {
                        JOptionPane.showMessageDialog(null, "ERROR, jumlah buku yang tersedia tidak cukup");
                        return;
                    }
                    newJumlahBuku1 = tokoBuku.getDaftarKoleksi().get(indexKoleksi1).getDaftarBuku().get(indexBuku1-1).getJumlahBuku() - jumlahBuku1;
                }
                if (dropDownListBuku2.getSelectedItem() != "" && jumlahBukuField2.getText() != "")
                {
                    indexKoleksi2 = dropDownListKoleksi2.getSelectedIndex()-1;
                    indexBuku2 = dropDownListBuku2.getSelectedIndex();
                    jumlahBuku2 = Integer.parseInt(jumlahBukuField2.getText());
                    Buku bukuTransaksi = tokoBuku.getDaftarKoleksi().get(indexKoleksi2).getDaftarBuku().get(indexBuku2-1);
//                    bukuTransaksi.setJumlahBuku(Integer.valueOf(Integer.parseInt(jumlahBukuField2.getText())));
                    for (int i=0;i<daftarBukuTransaksi.size();i++)
                    {
                        if (daftarBukuTransaksi.get(i).getJudulBuku().equals(tokoBuku.getDaftarKoleksi().get(indexKoleksi2).getDaftarBuku().get(indexBuku2-1).getJudulBuku()))
                        {
                            System.out.println("masuk");
                            if (daftarBukuTransaksi.get(i).getJumlahBuku() - jumlahBuku2 < 0)
                            {
                                JOptionPane.showMessageDialog(null, "ERROR, Buku yang dibeli melampaui stok yang ada");
                                return;
                            }
                        }
                    }
                    daftarBukuTransaksi.add(bukuTransaksi);
                    totalbukuyangdibeli += jumlahBuku2;
                    if (tokoBuku.getDaftarKoleksi().get(indexKoleksi2).getDaftarBuku().get(indexBuku2-1).getJumlahBuku() - jumlahBuku2 < 0)
                    {
                        JOptionPane.showMessageDialog(null, "ERROR, jumlah buku yang tersedia tidak cukup");
                        return;
                    }

                    newJumlahBuku2 = tokoBuku.getDaftarKoleksi().get(indexKoleksi2).getDaftarBuku().get(indexBuku2-1).getJumlahBuku() - jumlahBuku2;
                }
                if (dropDownListBuku3.getSelectedItem() != "" && jumlahBukuField3.getText() != "")
                {
                    indexKoleksi3 = dropDownListKoleksi3.getSelectedIndex()-1;
                    indexBuku3 = dropDownListBuku3.getSelectedIndex();
                    jumlahBuku3 = Integer.parseInt(jumlahBukuField3.getText());
                    Buku bukuTransaksi = tokoBuku.getDaftarKoleksi().get(indexKoleksi3).getDaftarBuku().get(indexBuku3-1);
//                    bukuTransaksi.setJumlahBuku(Integer.valueOf(Integer.parseInt(jumlahBukuField3.getText())));
                    daftarBukuTransaksi.add(bukuTransaksi);
                    totalbukuyangdibeli += jumlahBuku3;
                    if (tokoBuku.getDaftarKoleksi().get(indexKoleksi3).getDaftarBuku().get(indexBuku3-1).getJumlahBuku() - jumlahBuku3 < 0)
                    {
                        JOptionPane.showMessageDialog(null, "ERROR, jumlah buku yang tersedia tidak cukup");
                        return;
                    }
                    newJumlahBuku3 = tokoBuku.getDaftarKoleksi().get(indexKoleksi3).getDaftarBuku().get(indexBuku3-1).getJumlahBuku() - jumlahBuku3;
                }
                if (dropDownListBuku4.getSelectedItem() != "" && jumlahBukuField4.getText() != "")
                {
                    indexKoleksi4 = dropDownListKoleksi4.getSelectedIndex()-1;
                    indexBuku4 = dropDownListBuku4.getSelectedIndex();
                    jumlahBuku4 = Integer.parseInt(jumlahBukuField4.getText());
                    Buku bukuTransaksi = tokoBuku.getDaftarKoleksi().get(indexKoleksi4).getDaftarBuku().get(indexBuku4-1);
//                    bukuTransaksi.setJumlahBuku(Integer.valueOf(Integer.parseInt(jumlahBukuField4.getText())));
                    daftarBukuTransaksi.add(bukuTransaksi);
                    totalbukuyangdibeli += jumlahBuku4;
                    if (tokoBuku.getDaftarKoleksi().get(indexKoleksi4).getDaftarBuku().get(indexBuku4-1).getJumlahBuku() - jumlahBuku4 < 0)
                    {
                        JOptionPane.showMessageDialog(null, "ERROR, jumlah buku yang tersedia tidak cukup");
                        return;
                    }
                    newJumlahBuku4 = tokoBuku.getDaftarKoleksi().get(indexKoleksi4).getDaftarBuku().get(indexBuku4-1).getJumlahBuku() - jumlahBuku4;
                }
                if (dropDownListBuku5.getSelectedItem() != "" && jumlahBukuField5.getText() != "")
                {
                    indexKoleksi5 = dropDownListKoleksi5.getSelectedIndex()-1;
                    indexBuku5 = dropDownListBuku5.getSelectedIndex();
                    jumlahBuku5 = Integer.parseInt(jumlahBukuField5.getText());
                    Buku bukuTransaksi = tokoBuku.getDaftarKoleksi().get(indexKoleksi5).getDaftarBuku().get(indexBuku5-1);
//                    bukuTransaksi.setJumlahBuku(Integer.valueOf(Integer.parseInt(jumlahBukuField5.getText())));
                    daftarBukuTransaksi.add(bukuTransaksi);
                    totalbukuyangdibeli += jumlahBuku5;
                    if (tokoBuku.getDaftarKoleksi().get(indexKoleksi5).getDaftarBuku().get(indexBuku5-1).getJumlahBuku() - jumlahBuku5 < 0)
                    {
                        JOptionPane.showMessageDialog(null, "ERROR, jumlah buku yang tersedia tidak cukup");
                        return;
                    }
                    newJumlahBuku5 = tokoBuku.getDaftarKoleksi().get(indexKoleksi5).getDaftarBuku().get(indexBuku2-1).getJumlahBuku() - jumlahBuku2;
                }

                if (dropDownListKoleksi.getSelectedIndex()!=0 && dropDownListKoleksi2.getSelectedIndex()!=0 && dropDownListBuku.getSelectedIndex()!=0 && dropDownListBuku2.getSelectedIndex()!=0)
                {
                    if (dropDownListKoleksi.getSelectedIndex() == dropDownListKoleksi2.getSelectedIndex() && dropDownListBuku.getSelectedIndex() == dropDownListBuku2.getSelectedIndex() && namaPenulisField.getText().equals(namaPenulisField2.getText()))
                    {
                        JOptionPane.showMessageDialog(null, "ERROR, Buku yang dibeli tidak boleh sama");
                        return;
                    }
                }
                if (dropDownListKoleksi.getSelectedIndex()!=0 && dropDownListKoleksi3.getSelectedIndex()!=0 && dropDownListBuku.getSelectedIndex()!=0 && dropDownListBuku3.getSelectedIndex()!=0)
                {
                    if (dropDownListKoleksi.getSelectedIndex() == dropDownListKoleksi3.getSelectedIndex() && dropDownListBuku.getSelectedIndex() == dropDownListBuku3.getSelectedIndex() && namaPenulisField.getText().equals(namaPenulisField3.getText()))
                    {
                        JOptionPane.showMessageDialog(null, "ERROR, Buku yang dibeli tidak boleh sama");
                        return;
                    }
                }
                if (dropDownListKoleksi.getSelectedIndex()!=0 && dropDownListKoleksi4.getSelectedIndex()!=0 && dropDownListBuku.getSelectedIndex()!=0 && dropDownListBuku4.getSelectedIndex()!=0)
                {
                    if (dropDownListKoleksi.getSelectedIndex() == dropDownListKoleksi4.getSelectedIndex() && dropDownListBuku.getSelectedIndex() == dropDownListBuku4.getSelectedIndex() && namaPenulisField.getText().equals(namaPenulisField4.getText()))
                    {
                        JOptionPane.showMessageDialog(null, "ERROR, Buku yang dibeli tidak boleh sama");
                        return;
                    }
                }
                if (dropDownListKoleksi.getSelectedIndex()!=0 && dropDownListKoleksi5.getSelectedIndex()!=0 && dropDownListBuku.getSelectedIndex()!=0 && dropDownListBuku5.getSelectedIndex()!=0)
                {
                    if (dropDownListKoleksi.getSelectedIndex() == dropDownListKoleksi5.getSelectedIndex() && dropDownListBuku.getSelectedIndex() == dropDownListBuku5.getSelectedIndex() && namaPenulisField.getText().equals(namaPenulisField5.getText()))
                    {
                        JOptionPane.showMessageDialog(null, "ERROR, Buku yang dibeli tidak boleh sama");
                        return;
                    }
                }
                if (dropDownListKoleksi2.getSelectedIndex()!=0 && dropDownListKoleksi3.getSelectedIndex()!=0 && dropDownListBuku2.getSelectedIndex()!=0 && dropDownListBuku3.getSelectedIndex()!=0)
                {
                    if (dropDownListKoleksi2.getSelectedIndex() == dropDownListKoleksi3.getSelectedIndex() && dropDownListBuku2.getSelectedIndex() == dropDownListBuku3.getSelectedIndex() && namaPenulisField2.getText().equals(namaPenulisField3.getText()))
                    {
                        JOptionPane.showMessageDialog(null, "ERROR, Buku yang dibeli tidak boleh sama");
                        return;
                    }
                }
                if (dropDownListKoleksi2.getSelectedIndex()!=0 && dropDownListKoleksi4.getSelectedIndex()!=0 && dropDownListBuku2.getSelectedIndex()!=0 && dropDownListBuku4.getSelectedIndex()!=0)
                {
                    if (dropDownListKoleksi2.getSelectedIndex() == dropDownListKoleksi4.getSelectedIndex() && dropDownListBuku2.getSelectedIndex() == dropDownListBuku4.getSelectedIndex() && namaPenulisField2.getText().equals(namaPenulisField4.getText()))
                    {
                        JOptionPane.showMessageDialog(null, "ERROR, Buku yang dibeli tidak boleh sama");
                        return;
                    }
                }
                if (dropDownListKoleksi2.getSelectedIndex()!=0 && dropDownListKoleksi5.getSelectedIndex()!=0 && dropDownListBuku2.getSelectedIndex()!=0 && dropDownListBuku5.getSelectedIndex()!=0)
                {
                    if (dropDownListKoleksi2.getSelectedIndex() == dropDownListKoleksi5.getSelectedIndex() && dropDownListBuku2.getSelectedIndex() == dropDownListBuku5.getSelectedIndex() && namaPenulisField2.getText().equals(namaPenulisField5.getText()))
                    {
                        JOptionPane.showMessageDialog(null, "ERROR, Buku yang dibeli tidak boleh sama");
                        return;
                    }
                }
                if (dropDownListKoleksi3.getSelectedIndex()!=0 && dropDownListKoleksi4.getSelectedIndex()!=0 && dropDownListBuku3.getSelectedIndex()!=0 && dropDownListBuku4.getSelectedIndex()!=0)
                {
                    if (dropDownListKoleksi3.getSelectedIndex() == dropDownListKoleksi4.getSelectedIndex() && dropDownListBuku3.getSelectedIndex() == dropDownListBuku4.getSelectedIndex() && namaPenulisField3.getText().equals(namaPenulisField4.getText()))
                    {
                        JOptionPane.showMessageDialog(null, "ERROR, Buku yang dibeli tidak boleh sama");
                        return;
                    }
                }
                if (dropDownListKoleksi3.getSelectedIndex()!=0 && dropDownListKoleksi5.getSelectedIndex()!=0 && dropDownListBuku3.getSelectedIndex()!=0 && dropDownListBuku5.getSelectedIndex()!=0)
                {
                    if (dropDownListKoleksi3.getSelectedIndex() == dropDownListKoleksi5.getSelectedIndex() && dropDownListBuku3.getSelectedIndex() == dropDownListBuku5.getSelectedIndex() && namaPenulisField3.getText().equals(namaPenulisField5.getText()))
                    {
                        JOptionPane.showMessageDialog(null, "ERROR, Buku yang dibeli tidak boleh sama");
                        return;
                    }
                }
                if (dropDownListKoleksi4.getSelectedIndex()!=0 && dropDownListKoleksi5.getSelectedIndex()!=0 && dropDownListBuku4.getSelectedIndex()!=0 && dropDownListBuku5.getSelectedIndex()!=0)
                {
                    if (dropDownListKoleksi4.getSelectedIndex() == dropDownListKoleksi5.getSelectedIndex() && dropDownListBuku4.getSelectedIndex() == dropDownListBuku5.getSelectedIndex() && namaPenulisField4.getText().equals(namaPenulisField5.getText()))
                    {
                        JOptionPane.showMessageDialog(null, "ERROR, Buku yang dibeli tidak boleh sama");
                        return;
                    }
                }




                int result = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menambahkan transaksi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (result == 1)
                {
                    return;
                }


                if (newJumlahBuku1 != -1)
                {
                    tokoBuku.getDaftarKoleksi().get(indexKoleksi1).getDaftarBuku().get(indexBuku1-1).setJumlahBuku(Integer.valueOf(newJumlahBuku1));
                }
                if (newJumlahBuku2 != -1)
                {
                    tokoBuku.getDaftarKoleksi().get(indexKoleksi2).getDaftarBuku().get(indexBuku2-1).setJumlahBuku(Integer.valueOf(newJumlahBuku2));
                }
                if (newJumlahBuku3 != -1)
                {
                    tokoBuku.getDaftarKoleksi().get(indexKoleksi3).getDaftarBuku().get(indexBuku3-1).setJumlahBuku(Integer.valueOf(newJumlahBuku3));
                }
                if (newJumlahBuku4 != -1)
                {
                    tokoBuku.getDaftarKoleksi().get(indexKoleksi4).getDaftarBuku().get(indexBuku4-1).setJumlahBuku(Integer.valueOf(newJumlahBuku4));
                }
                if (newJumlahBuku5 != -1)
                {
                    tokoBuku.getDaftarKoleksi().get(indexKoleksi5).getDaftarBuku().get(indexBuku5-1).setJumlahBuku(Integer.valueOf(newJumlahBuku5));
                }

                String ID = String.format("Trans%03d", this.tokoBuku.getDaftarTransaksi().size()+1);
                String namaKasir = tokoBuku.getKasir().getNama();
                subtotaltransaksi = (Double) (totalbukuyangdibeli * randomharga);

                Transaksi transaksi = new Transaksi(ID, namaKasir, daftarBukuTransaksi,namaPelanggan,IDPelanggan,subtotaltransaksi);
                this.tokoBuku.getDaftarTransaksi().add(transaksi);
                JOptionPane.showMessageDialog(null, "Transaksi berhasil ditambahkan");
                // validasi kalo bukunya habis
                if (dropDownListBuku.getSelectedItem() != "" && jumlahBukuField.getText() != "" && tokoBuku.getDaftarKoleksi().get(indexKoleksi1).getDaftarBuku().get(indexBuku1-1).getJumlahBuku() == 0)
                {
                    JOptionPane.showMessageDialog(null, "WARNING!!!! Buku " + tokoBuku.getDaftarKoleksi().get(indexKoleksi1).getDaftarBuku().get(indexBuku1-1).getJudulBuku() + " telah habis, islahkan isi stok kembali");
                }
                if (dropDownListBuku2.getSelectedItem() != "" && jumlahBukuField2.getText() != "" && tokoBuku.getDaftarKoleksi().get(indexKoleksi2).getDaftarBuku().get(indexBuku2-1).getJumlahBuku() == 0)
                {
                    JOptionPane.showMessageDialog(null, "WARNING!!!! Buku " + tokoBuku.getDaftarKoleksi().get(indexKoleksi2).getDaftarBuku().get(indexBuku2-1).getJudulBuku() + " telah habis, islahkan isi stok kembali");
                }
                if (dropDownListBuku3.getSelectedItem() != "" && jumlahBukuField3.getText() != "" && tokoBuku.getDaftarKoleksi().get(indexKoleksi3).getDaftarBuku().get(indexBuku3-1).getJumlahBuku() == 0)
                {
                    JOptionPane.showMessageDialog(null, "WARNING!!!! Buku " + tokoBuku.getDaftarKoleksi().get(indexKoleksi3).getDaftarBuku().get(indexBuku3-1).getJudulBuku() + " telah habis, islahkan isi stok kembali");
                }
                if (dropDownListBuku4.getSelectedItem() != "" && jumlahBukuField4.getText() != "" && tokoBuku.getDaftarKoleksi().get(indexKoleksi4).getDaftarBuku().get(indexBuku4-1).getJumlahBuku() == 0)
                {
                    JOptionPane.showMessageDialog(null, "WARNING!!!! Buku " + tokoBuku.getDaftarKoleksi().get(indexKoleksi4).getDaftarBuku().get(indexBuku4-1).getJudulBuku() + " telah habis, islahkan isi stok kembali");
                }
                if (dropDownListBuku5.getSelectedItem() != "" && jumlahBukuField5.getText() != "" && tokoBuku.getDaftarKoleksi().get(indexKoleksi5).getDaftarBuku().get(indexBuku5-1).getJumlahBuku() == 0)
                {
                    JOptionPane.showMessageDialog(null, "WARNING!!!! Buku " + tokoBuku.getDaftarKoleksi().get(indexKoleksi5).getDaftarBuku().get(indexBuku5-1).getJudulBuku() + " telah habis, islahkan isi stok kembali");
                }
                int yesno = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menambahkan transaksi lagi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (yesno == 1)
                {
                    new MenuUtama(tokoBuku);
                    dispose();
                }
                else if(yesno == 0)
                {
                    namaPelangganField.setText("");
                    jumlahBukuField.setText("");
                    jumlahBukuField2.setText("");
                    jumlahBukuField3.setText("");
                    jumlahBukuField4.setText("");
                    jumlahBukuField5.setText("");
                    dropDownListKoleksi.setSelectedIndex(0);
                    dropDownListKoleksi2.setSelectedIndex(0);
                    dropDownListKoleksi3.setSelectedIndex(0);
                    dropDownListKoleksi4.setSelectedIndex(0);
                    dropDownListKoleksi5.setSelectedIndex(0);
                    dropDownListBuku.setSelectedIndex(0);
                    dropDownListBuku2.setSelectedIndex(0);
                    dropDownListBuku3.setSelectedIndex(0);
                    dropDownListBuku4.setSelectedIndex(0);
                    dropDownListBuku5.setSelectedIndex(0);
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
