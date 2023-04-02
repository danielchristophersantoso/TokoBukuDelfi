import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TambahPelangganBaru extends JFrame implements ActionListener {
    private JLabel headerLabel= new JLabel("Tambah Pelanggan Baru");
    private JLabel namaLabel = new JLabel("Nama");
    private JTextField namaField = new JTextField();
    private JLabel jumlahBukuLabel = new JLabel("Jumlah Buku");
    private JTextField jumlahBukuField = new JTextField();
    private JPanel panel = new JPanel();
    private JPanel footerPanel = new JPanel();
    private JButton tambahButton = new JButton("Tambah");
    public TambahPelangganBaru(){
        super("Tambah Pelanggan Baru");
        add(headerLabel, BorderLayout.NORTH);
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerLabel.setFont(new Font("", Font.BOLD, 20));
        headerLabel.setForeground(Color.BLACK);


        panel.setLayout(new GridLayout(2,2));
        namaLabel.setBounds(10,20,230,30);
        namaLabel.setForeground(Color.BLACK);
        panel.add(namaLabel);
        namaField.setBounds(100,20,230,30);
        panel.add(namaField);
        jumlahBukuLabel.setBounds(10,70,230,30);
        jumlahBukuLabel.setForeground(Color.BLACK);
        panel.add(jumlahBukuLabel);
        jumlahBukuField.setBounds(100,70,230,30);
        panel.add(jumlahBukuField);
        panel.setBackground(Color.gray);
        setLocationRelativeTo(null);
        panel.setForeground(Color.pink);
        panel.setLayout(null);
        add(panel,BorderLayout.CENTER);


        footerPanel.add(tambahButton);
        footerPanel.setBackground(Color.gray);
        add(footerPanel, BorderLayout.SOUTH);



//        namaLabel.setEnabled(false);
//        panel.getContentPane().setBackground(Color.gray);

        getContentPane().setBackground(Color.gray);
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
        new TambahPelangganBaru();
    }
}

