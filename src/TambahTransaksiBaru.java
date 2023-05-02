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
        panel.setBackground(Color.GRAY);
        panel.setBounds(13,70,760,350);
        add(panel,BorderLayout.CENTER);


        getContentPane().setBackground(Color.lightGray);
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
            System.out.println("masuk");
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
            System.out.println("masuk");
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
            System.out.println("masuk");
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
            System.out.println("masuk");
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
            System.out.println("masuk");
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
//                for (int i = 0; i < daftarJudulBuku.size(); i++) {
//                    String buku = daftarJudulBuku.get(i);
//                    int jumlahBuku = daftarJumlahBuku.get(i);
////                  buku bukuTransaksi = tokoBuku.getDaftarKoleksi().get(indexKoleksi).getDaftarBuku().get(indexBuku);
//                    Buku bukuTransaksi = new Buku(buku, jumlahBuku);
//                    bukuTransaksi.setJumlahBuku(Integer.valueOf(Integer.parseInt(jumlahBukuField.getText())));
//                    daftarBukuTransaksi.add(bukuTransaksi);
//                    totalbukuyangdibeli += jumlahBuku;
//                }

                if (dropDownListBuku.getSelectedItem() != "" && jumlahBukuField.getText() != "")
                {
                    int indexKoleksi = dropDownListKoleksi.getSelectedIndex();
                    int indexBuku = dropDownListBuku.getSelectedIndex();
                    int jumlahBuku = Integer.parseInt(jumlahBukuField.getText());
                    Buku bukuTransaksi = tokoBuku.getDaftarKoleksi().get(indexKoleksi).getDaftarBuku().get(indexBuku);
                    bukuTransaksi.setJumlahBuku(Integer.valueOf(Integer.parseInt(jumlahBukuField.getText())));
                    daftarBukuTransaksi.add(bukuTransaksi);
                    totalbukuyangdibeli += jumlahBuku;
                    System.out.println("Berdasarkan tokobuku sebelum dikurangin = " + tokoBuku.getDaftarKoleksi().get(indexKoleksi).getDaftarBuku().get(indexBuku-1).getJumlahBuku());
                    if (tokoBuku.getDaftarKoleksi().get(indexKoleksi).getDaftarBuku().get(indexBuku-1).getJumlahBuku() - jumlahBuku < 0)
                    {
                        JOptionPane.showMessageDialog(null, "ERROR, jumlah buku yang tersedia tidak cukup");
                        return;
                    }
                    int newjumlahbuku = tokoBuku.getDaftarKoleksi().get(indexKoleksi).getDaftarBuku().get(indexBuku-1).getJumlahBuku() - jumlahBuku;
                    tokoBuku.getDaftarKoleksi().get(indexKoleksi).getDaftarBuku().get(indexBuku-1).setJumlahBuku(Integer.valueOf(newjumlahbuku));
                    System.out.println("Jumlah buku yang dibeli: " + jumlahBuku);
                    System.out.println("Jumlah buku yang tersisa: " + newjumlahbuku);
                    System.out.println("Berdasarkan tokobuku = " + tokoBuku.getDaftarKoleksi().get(indexKoleksi).getDaftarBuku().get(indexBuku-1).getJumlahBuku());
                }
                String ID = String.format("Trans%03d", this.tokoBuku.getDaftarTransaksi().size()+1);
                String namaKasir = tokoBuku.getKasir().getNama();
                subtotaltransaksi = (Double) (totalbukuyangdibeli * randomharga);


                String namaBukuUntukDikurangi;
                int jumlahBukuYangHarusDikurangi;
                for (int i = 0; i < daftarJudulBuku.size(); i++) {
                    namaBukuUntukDikurangi = daftarJudulBuku.get(i);
                }


                Transaksi transaksi = new Transaksi(ID, namaKasir, daftarBukuTransaksi,namaPelanggan,IDPelanggan,subtotaltransaksi);
                this.tokoBuku.getDaftarTransaksi().add(transaksi);
                JOptionPane.showMessageDialog(null, "Transaksi berhasil ditambahkan");
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
