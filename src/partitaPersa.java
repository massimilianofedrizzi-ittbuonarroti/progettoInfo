import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class partitaPersa extends JFrame{
    private JLabel lblTitle;
    private JLabel lblPunteggio;
    private JButton btnBackMenu;
    private JPanel gameOver;
    private int punteggio;

    public partitaPersa(menuGUI m1,  int punteggio) {
        setContentPane(gameOver);
        setTitle("menu");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        this.punteggio=punteggio;
        lblPunteggio.setText("PUNTEGGIO: "+punteggio);
        btnBackMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m1.setVisible(true);
                setVisible(false);
            }
        });
    }

}
