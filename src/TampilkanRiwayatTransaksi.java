import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TampilkanRiwayatTransaksi extends JFrame implements ActionListener {
    private JLabel headerLabel = new JLabel("Riwayat Transaksi");
    private JLabel pilihIdTransaksi = new JLabel("Pilih ID Transaksi");
    private JComboBox dropdownListTransaksi = new JComboBox();
    private JButton lihatTransaksi = new JButton("Lihat Transaksi");
    private JPanel panel = new JPanel();
    private ArrayList<Buku> daftarbuku = new ArrayList<Buku>();
    private ArrayList<Transaksi> daftartransaksi = new ArrayList<Transaksi>();
    private JFrame internalFrame;


    public TampilkanRiwayatTransaksi() {
        super("Riwayat Transaksi");
        // untuk dummy transaksi
        Buku buku1 = new Buku("Harry Potter",12,"Jk rowling");
        Buku buku2 = new Buku("Sherlock Holmes", 12,"Arthur");
        daftarbuku.add(buku1);
        daftarbuku.add(buku2);
        Transaksi transaksi1 = new Transaksi("1","nama kasir",daftarbuku,"nama pelanggan","1",10000.0);
        daftartransaksi.add(transaksi1);
        Buku buku3 = new Buku("Harry Potter",12,"Jk rowling");
        Buku buku4 = new Buku("Sherlock Holmes", 12,"Arthur");
        daftarbuku.add(buku3);
        daftarbuku.add(buku4);
        Transaksi transaksi2 = new Transaksi("2","nama kasir",daftarbuku,"nama pelanggan","2",11000.0);
        daftartransaksi.add(transaksi2);


        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 30));
        headerLabel.setForeground(Color.BLACK);
        headerLabel.setBounds(0,0,800,80);
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

        for (int i = 0; i < daftartransaksi.size(); i++) {
            dropdownListTransaksi.addItem(daftartransaksi.get(i).getIdTransaksi());
        }


        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setBounds(200, 80, 400, 200);
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
        if (e.getSource() == lihatTransaksi)
        {
            for (int i = 0; i < daftartransaksi.size(); i++) {
                if (dropdownListTransaksi.getSelectedItem().equals(daftartransaksi.get(i).getIdTransaksi())) {
                    internalFrame = new JFrame("Transaksi " + i+1);
                    JLabel headerLabel = new JLabel("Transaksi " + i+1);
                    headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
                    headerLabel.setFont(new Font("Arial", Font.BOLD, 30));
                    headerLabel.setForeground(Color.BLACK);
                    headerLabel.setBounds(0,0,800,80);
                    internalFrame.add(headerLabel, BorderLayout.NORTH);
                    // nama kasir
                    JLabel namaKasir = new JLabel("Nama Kasir : " + daftartransaksi.get(i).getNamaKasir());
                    namaKasir.setBounds(35,30,230,30);
                    namaKasir.setForeground(Color.BLACK);
                    internalFrame.add(namaKasir);
                    // nama pelanggan
                    JLabel namaPelanggan = new JLabel("Nama Pelanggan : " + daftartransaksi.get(i).getNamaPelanggan());
                    namaPelanggan.setBounds(35,60,230,30);
                    namaPelanggan.setForeground(Color.BLACK);
                    internalFrame.add(namaPelanggan);
                    // id pelanggan
                    JLabel idPelanggan = new JLabel("ID Pelanggan : " + daftartransaksi.get(i).getIdPelanggan());
                    idPelanggan.setBounds(35,90,230,30);
                    idPelanggan.setForeground(Color.BLACK);
                    internalFrame.add(idPelanggan);
                    // daftar buku
                    JLabel daftarBuku = new JLabel();
                    for (int j = 0; j < daftarbuku.size(); j++) {
                        daftarBuku.setText("Daftar Buku : " + daftartransaksi.get(i).getDaftarBuku().get(j).getJudulBuku());
                        daftarBuku.setBounds(35,120,230,30);
                        daftarBuku.setForeground(Color.BLACK);
                        internalFrame.add(daftarBuku);

                    }
//                    // daftar buku
//                    JLabel daftarBuku1 = new JLabel("1. " + daftartransaksi.get(i).getDaftarBuku().get(0).getJudulBuku());
//                    daftarBuku1.setBounds(35,150,230,30);
//                    daftarBuku1.setForeground(Color.BLACK);
//                    internalFrame.add(daftarBuku1);
                    // daftar buku
//                    JLabel daftarBuku2 = new JLabel("2. " + daftartransaksi.get(i).getDaftarBuku().get(1).getJudulBuku());
//                    daftarBuku2.setBounds(35,180,230,30);
//                    daftarBuku2.setForeground(Color.BLACK);
//                    internalFrame.add(daftarBuku2);
                    // total harga
                    JLabel totalHarga = new JLabel("Total Harga : " + daftartransaksi.get(i).getSubTotalTransaksi());
                    totalHarga.setBounds(35,210,230,30);
                    totalHarga.setForeground(Color.BLACK);
                    internalFrame.add(totalHarga);


                    internalFrame.setLayout(null);
                    internalFrame.setBounds (0,0,800,490);
                    internalFrame.setVisible(true);
                    internalFrame.setBackground(Color.lightGray);
                    internalFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    internalFrame.setResizable(false);
                    add(internalFrame);
                }
            }
        }
    }

    public static void main(String[] args) {
        new TampilkanRiwayatTransaksi();
    }
}
