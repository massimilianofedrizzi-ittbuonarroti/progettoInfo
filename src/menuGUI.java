import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuGUI extends JFrame{

    private JButton aggiungereGiocatoreButton;
    private JButton iniziarePartitaButton;
    private JButton visualizzareClassificaButton;
    private JPanel menu;
    boolean[][] sotto;
    public menuGUI(boolean[][] sotto, Connessione c1){
        setContentPane(menu);
        setTitle("menu");
        setSize(600, 400);
        Dimension dim = getToolkit().getScreenSize();
        setLocation(dim.width / 2 - this.getWidth() / 2, dim.height / 2 - this.getHeight() / 2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        menuGUI menu = this;
        this.sotto = sotto;
        aggiungereGiocatoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AggiungiGiocatoreGUI ag1 = new AggiungiGiocatoreGUI(menu, c1);
                menu.setVisible(false);
            }
        });
        iniziarePartitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                impostazioniPartitaGUI imp1 = new impostazioniPartitaGUI(menu, sotto, c1);
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
