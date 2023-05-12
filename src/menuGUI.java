import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuGUI extends JFrame{

    private JButton aggiungereGiocatoreButton;
    private JButton iniziarePartitaButton;
    private JButton visualizzareClassificaButton;
    private JPanel menu;
    boolean[][] sotto;
    public menuGUI(boolean[][] sotto){
        setContentPane(menu);
        setTitle("menu");
        setSize(700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        menuGUI menu = this;
        this.sotto = sotto;
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
                impostazioniPartitaGUI imp1 = new impostazioniPartitaGUI(menu, sotto);
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
