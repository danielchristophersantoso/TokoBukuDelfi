import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HapusKoleksi extends JFrame implements ActionListener {
    private JLabel headerLabel= new JLabel("Hapus Koleksi");
    private JLabel namaKoleksiLabel = new JLabel("Nama Koleksi");
    private JTextField namaKoleksiField = new JTextField();
    private JButton hapusKoleksiBtn = new JButton("Hapus Koleksi");
    public HapusKoleksi(){
        super("Hapus Koleksi");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(300, 90, 800, 490);
        setVisible(true);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
