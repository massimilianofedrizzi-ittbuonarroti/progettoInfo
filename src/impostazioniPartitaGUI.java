import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class impostazioniPartitaGUI extends JFrame{
    private JLabel lblTitle;
    private JLabel lblProfili;
    private JList listProfili;
    private JLabel lblDIfficoltà;
    private JSlider slider1;
    private JPanel settings;
    private JButton btnBack;
    private JButton btnAvanti;

    public impostazioniPartitaGUI(){
        setContentPane(settings);
        setTitle("menu");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                menuGUI g2 = new menuGUI();
            }
        });
        btnAvanti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                partitaGUI p1 = new partitaGUI();
            }
        });
    }
}
