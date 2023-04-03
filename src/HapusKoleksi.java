import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HapusKoleksi extends JFrame implements ActionListener {
    private JLabel headerLabel= new JLabel("Hapus Koleksi");
    private JLabel namaKoleksiLabel = new JLabel("Nama Koleksi");
    private JTextField namaKoleksiField = new JTextField();
    private JButton hapusKoleksiBtn = new JButton("Hapus Koleksi");
    private JPanel panel = new JPanel();
    public HapusKoleksi(){
        super("Hapus Koleksi");
        add(headerLabel, BorderLayout.NORTH);
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerLabel.setFont(new Font("", Font.BOLD, 30));
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
                    JOptionPane.showMessageDialog(null, "Koleksi berhasil dihapus");
//                    new MenuUtama();
//                    dispose();
                }
            }
        }
    }

    public static void main(String[] args) {
        new HapusKoleksi();
    }
}
