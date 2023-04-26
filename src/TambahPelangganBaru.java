import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TambahPelangganBaru extends JFrame implements ActionListener {
    private JLabel headerLabel= new JLabel("Tambah Pelanggan Baru");
    private JLabel namaLabel = new JLabel("Nama");
    private JTextField namaField = new JTextField();
//    private JLabel jumlahBukuLabel = new JLabel("Jumlah Buku");
//    private JTextField jumlahBukuField = new JTextField();
    private JPanel panel = new JPanel();
    private JButton tambahButton = new JButton("Tambah");
    private ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();

    public TambahPelangganBaru(){
        super("Tambah Pelanggan Baru");

        //dummy local pelanggan
        Pelanggan pelanggan1 = new Pelanggan("Pelanggan1", "PL0001", 12);
        Pelanggan pelanggan2 = new Pelanggan("Pelanggan2", "PL0002", 10);
        Pelanggan pelanggan3 = new Pelanggan("Pelanggan3", "PL0003", 8);
        daftarPelanggan.add(pelanggan1);
        daftarPelanggan.add(pelanggan2);
        daftarPelanggan.add(pelanggan3);


        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 30));
        headerLabel.setForeground(Color.BLACK);
        headerLabel.setBounds(0,20,800,100);
        add(headerLabel, BorderLayout.NORTH);


        namaLabel.setBounds(40,30,230,30);
        namaLabel.setForeground(Color.BLACK);
        panel.add(namaLabel);
        namaField.setBounds(150,30,200,30);
        panel.add(namaField);

        panel.setBounds(200,100,400,200);
        panel.setBackground(Color.GRAY);
        tambahButton.addActionListener(this);
        tambahButton.setBackground(Color.BLACK);
        tambahButton.setForeground(Color.WHITE);
        tambahButton.setBounds(150, 140, 100, 30);
        panel.add(tambahButton);

        setLocationRelativeTo(null);
        panel.setLayout(null);
        add(panel,BorderLayout.CENTER);

        setLayout(null);
        getContentPane().setBackground(Color.lightGray);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage((new ImageIcon(this.getClass().getResource("icon.png"))).getImage());
        setBounds(300, 90, 800, 490);
        setVisible(true);
        setResizable(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tambahButton)
        {
            if(namaField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
                return;
            }
            else
            {
                String nama = namaField.getText();
                String ID = String.format("PL%03d",daftarPelanggan.size()+1);
//                String jumlahBuku = jumlahBukuField.getText();
                //Gua ubah jdi string, ini sebenernya dia cmn butuh nama, tar yg id nya digenerate pada saat buttonnya diklik

                Pelanggan pelanggan = new Pelanggan(nama, ID);
                daftarPelanggan.add(pelanggan);
                JOptionPane.showInternalMessageDialog(null, "Data Berhasil Ditambahkan");
                System.out.println("ID = " + ID);
                int res = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menambahkan data lagi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

                //yes = 0 , no = 1
                if (res==1) {
                    dispose();
                } else if (res==0) {
                    namaField.setText("");
//                    jumlahBukuField.setText("");
                }

            }
        }
    }

    public static void main(String[] args) {
        new TambahPelangganBaru();
    }
}

