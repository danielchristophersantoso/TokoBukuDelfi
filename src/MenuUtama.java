import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUtama extends JFrame implements ActionListener {
    JMenuBar menuBar = new JMenuBar();
    JMenuItem keluarMenuItem = new JMenuItem("Keluar");
    JDesktopPane desktopPane = new JDesktopPane();
    public MenuUtama() {
        super("Menu Utama");
        menuBar.add(keluarMenuItem);
        keluarMenuItem.addActionListener(this);
        setJMenuBar(menuBar);
        setContentPane(desktopPane);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuUtama();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == keluarMenuItem){
            System.exit(0);
        }
    }
}
