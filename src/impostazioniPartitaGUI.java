import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;
import java.util.ArrayList;

public class impostazioniPartitaGUI extends JFrame{
    private JLabel lblTitle;
    private JLabel lblProfili;

    private JLabel lblDIfficoltà;
    private JSlider slider1;
    private JPanel settings;
    private JButton btnBack;
    private JButton btnAvanti;
    private JList listNicknames;
    private menuGUI m1;
    private boolean[][] sotto;
    public impostazioniPartitaGUI(menuGUI m1, boolean[][] sotto, Connessione c1){

        setContentPane(settings);
        setTitle("menu");
        setSize(600, 400);
        Dimension dim = getToolkit().getScreenSize();
        setLocation(dim.width / 2 - this.getWidth() / 2, dim.height / 2 - this.getHeight() / 2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        this.m1 = m1;
        this.sotto = sotto;
        listNicknames = new JList();
        DefaultListModel model = new DefaultListModel();

        model.addElement("Grande");
        model.addElement("piccolo");

        listNicknames.setModel(model);




        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                m1.setVisible(true);
            }
        });
        btnAvanti.addActionListener(new ActionListener() {
            String nickname;
            public void actionPerformed(ActionEvent e) {
                //nickname = listNicknames.getSelectedValue();
                partitaGUI p1 = new partitaGUI(m1, sotto, nickname);
            }
        });

    }
}
