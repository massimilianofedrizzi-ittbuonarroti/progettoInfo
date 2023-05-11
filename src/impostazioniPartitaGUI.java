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
    private menuGUI m1;
    private boolean[][] sotto;
    public impostazioniPartitaGUI(menuGUI m1, boolean[][] sotto){
        setContentPane(settings);
        setTitle("menu");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        this.m1 = m1;
        this.sotto = sotto;
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                m1.setVisible(true);
            }
        });
        btnAvanti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                partitaGUI p1 = new partitaGUI(m1, sotto);
            }
        });
    }
}
