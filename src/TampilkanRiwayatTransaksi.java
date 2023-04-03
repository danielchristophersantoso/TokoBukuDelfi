import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TampilkanRiwayatTransaksi extends JFrame implements ActionListener {
    private JLabel headerLabel = new JLabel("Riwayat Transaksi");
    private JLabel pilihBukuLabel = new JLabel("Pilih Buku");
    private JComboBox dropDownListBuku = new JComboBox();
    private JLabel jumlahLabel = new JLabel("Jumlah buku");
    private JTextField jumlahField = new JTextField();
    private JButton lihatTransaksi = new JButton("Lihat Transaksi");
    private JPanel panel = new JPanel();
    public TampilkanRiwayatTransaksi() {
        super("Riwayat Transaksi");

        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 30));
        headerLabel.setForeground(Color.BLACK);
        headerLabel.setBounds(0,0,800,80);
        add(headerLabel, BorderLayout.NORTH);

        pilihBukuLabel.setBounds(35,30,230,30);
        pilihBukuLabel.setForeground(Color.BLACK);
        panel.add(pilihBukuLabel);
        dropDownListBuku.setBounds(170,30,200,30);
        dropDownListBuku.setForeground(Color.BLACK);
        panel.add(dropDownListBuku);
        lihatTransaksi.addActionListener(this);
        lihatTransaksi.setBounds(100, 150, 200, 30);
        lihatTransaksi.setBackground(Color.BLACK);
        lihatTransaksi.setForeground(Color.WHITE);
        panel.add(lihatTransaksi);
        jumlahLabel.setBounds(35,80,200,30);
        jumlahLabel.setForeground(Color.BLACK);
        panel.add(jumlahLabel);
        jumlahField.setBounds(170,80,200,30);
        jumlahField.setForeground(Color.BLACK);
        panel.add(jumlahField);


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

    }

    public static void main(String[] args) {
        new TampilkanRiwayatTransaksi();
    }
}
