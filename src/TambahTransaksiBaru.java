import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TambahTransaksiBaru extends JFrame implements ActionListener {
    private JLabel headerLabel= new JLabel("Tambah Transaksi Baru");
    private JLabel namaPelangganLabel = new JLabel("Nama Pelanggan");
    private JTextField namaPelangganField = new JTextField();
    private JLabel IDPelanggan = new JLabel("ID Pelanggan");
    private JTextField IDPelangganField = new JTextField();
    private JLabel namaBukuLabel = new JLabel("Nama Buku");
    private JComboBox dropDownListBuku = new JComboBox();
    private JTextField jumlahBukuField = new JTextField();
    private JButton addBukubtn = new JButton("Tambah Buku");
    private JButton tambahTransaksibtn = new JButton("Tambah Transaksi");

    public TambahTransaksiBaru(){
        super("Tambah Transaksi Baru");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(300, 90, 800, 490);
        setVisible(true);
        setResizable(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new TambahTransaksiBaru();
    }
}
