import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuGUI extends JFrame{

    private JButton aggiungereGiocatoreButton;
    private JButton iniziarePartitaButton;
    private JButton visualizzareClassificaButton;
    private JPanel menu;
    public menuGUI(){
        setContentPane(menu);
        setTitle("menu");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        menuGUI menu = this;
        aggiungereGiocatoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AggiungiGiocatoreGUI ag1 = new AggiungiGiocatoreGUI(menu);
                menu.setVisible(false);
            }
        });
        iniziarePartitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                impostazioniPartitaGUI imp1 = new impostazioniPartitaGUI(menu);
                menu.setVisible(false);
            }
        });
        visualizzareClassificaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                classificaGUI c1 = new classificaGUI(menu);
                menu.setVisible(false);
            }
        });
    }
}
