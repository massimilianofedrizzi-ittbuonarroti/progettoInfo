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
        aggiungereGiocatoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AggiungiGiocatoreGUI ag1 = new AggiungiGiocatoreGUI();
            }
        });
        iniziarePartitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                partitaGUI p1 = new partitaGUI();
            }
        });
    }
}
