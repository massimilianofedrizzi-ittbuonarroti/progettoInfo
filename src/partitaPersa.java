import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class partitaPersa extends JFrame{
    private JLabel lblTitle;
    private JLabel lblPunteggio;
    private JButton btnBackMenu;
    private JPanel gameOver;
    private int punteggio;
    private String nickname;

    public partitaPersa(menuGUI m1,  int punteggio, String nickname) {
        this.nickname = nickname;
        Connessione c1 = new Connessione();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setContentPane(gameOver);
        setTitle("menu");
        setSize(600, 400);
        Dimension dim = getToolkit().getScreenSize();
        setLocation(dim.width / 2 - this.getWidth() / 2, dim.height / 2 - this.getHeight() / 2);
        setVisible(true);
        this.punteggio=punteggio;
        lblPunteggio.setText("PUNTEGGIO: "+punteggio);
        btnBackMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                m1.setVisible(true);
            }
        });
        c1.connetti();
        c1.inserisciPunteggio(nickname, punteggio);
        c1.disconnetti();

    }


}
