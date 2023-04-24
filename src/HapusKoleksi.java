import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class HapusKoleksi extends JFrame implements ActionListener {
    private JLabel headerLabel= new JLabel("Hapus Koleksi");
    private JLabel namaKoleksiLabel = new JLabel("Nama Koleksi");
    private JTextField namaKoleksiField = new JTextField();
    private JButton hapusKoleksiBtn = new JButton("Hapus Koleksi");
    private JPanel panel = new JPanel();

    public ArrayList<Koleksi> koleksi = new ArrayList<Koleksi>();
    public ArrayList<Buku> daftarbuku = new ArrayList<Buku>();

    public HapusKoleksi(){
        super("Hapus Koleksi");

//        untuk dummy buku sama koleksi
        Buku buku1 = new Buku("Harry Potter",12,"Jk rowling");
        Buku buku2 = new Buku("Sherlock Holmes", 12,"Arthur");
        daftarbuku.add(buku1);
        daftarbuku.add(buku2);
        Koleksi koleksi1 = new Koleksi("1", daftarbuku);
        Koleksi koleksi2 = new Koleksi("2", daftarbuku);
        koleksi.add(koleksi1);
        koleksi.add(koleksi2);

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

        panel.setBackground(Color.GRAY);
        panel.setBounds(200,100,400,200);
        panel.setLayout(null);
        add(panel,BorderLayout.CENTER);

        getContentPane().setBackground(Color.lightGray);
        setLayout(null);
        setIconImage((new ImageIcon(this.getClass().getResource("icon.png"))).getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(300, 90, 800, 490);
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
                if (res == 0)
                {
                    int ketemu = -1;
                    for (int i = 0; i < koleksi.size() ; i++) {
                        if (koleksi.get(i).getNamaKoleksi().equals(namaKoleksiField.getText())) {
                            koleksi.remove(i);
                            JOptionPane.showMessageDialog(null, "Koleksi berhasil dihapus");
                            ketemu = 1;
                        }
                    }
                    if(ketemu == -1)
                    {
                        JOptionPane.showMessageDialog(null, "Koleksi tersebut tidak ditemukan");
                    }

                }
                int res2 = JOptionPane.showConfirmDialog(null,"Apakah anda ingin menghapus koleksi lainnya?","Hapus Koleksi",JOptionPane.YES_NO_OPTION);
                if(res2 == 0)
                {
                    namaKoleksiField.setText("");
                }
            }
        }
    }

    public static void main(String[] args) {
        new HapusKoleksi();
    }
}
