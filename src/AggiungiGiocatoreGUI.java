import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AggiungiGiocatoreGUI extends JFrame{

    private JTextField txtNickname;
    private JLabel lblAggiungiGIocatore;
    private JButton AGGIUNGIButton;
    private JPanel Aggiungi;
    private String nickname;

    public AggiungiGiocatoreGUI() {
        setContentPane(Aggiungi);
        setTitle("Aggiugni Giocataore");
        setSize(800, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        AGGIUNGIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nickname = txtNickname.getText();
            }
        });
    }
}
