import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AggiungiGiocatoreGUI extends JFrame{

    private JTextField txtNickname;
    private JLabel lblAggiungiGIocatore;
    private JButton AGGIUNGIButton;
    private JPanel Aggiungi;
    private JButton btnbackToTheMenu;
    private String nickname;

    public AggiungiGiocatoreGUI(menuGUI m1, Connessione c1) {
        setContentPane(Aggiungi);
        setTitle("Aggiungi Giocataore");
        setSize(600, 400);
        Dimension dim = getToolkit().getScreenSize();
        setLocation(dim.width / 2 - this.getWidth() / 2, dim.height / 2 - this.getHeight() / 2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        AGGIUNGIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nickname = txtNickname.getText();
                c1.connetti();
                c1.registraNickname(nickname, 0);
                c1.disconnetti();
                setVisible(false);
                m1.setVisible(true);
            }
        });
        btnbackToTheMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                m1.setVisible(true);
            }
        });
    }
}
