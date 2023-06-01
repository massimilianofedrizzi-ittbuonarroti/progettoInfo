import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class classificaGUI extends JFrame{
    private JPanel classifica;
    private JLabel lblTitle;
    private JButton btnBack;
    private JLabel lblNicknames;
    private JPanel panelClassifica;
    private JList listNicknames;
    private  JList listPunteggi;

    public classificaGUI(menuGUI m1){
        setContentPane(classifica);
        setTitle("menu");
        setSize(600, 400);
        Dimension dim = getToolkit().getScreenSize();
        setLocation(dim.width / 2 - this.getWidth() / 2, dim.height / 2 - this.getHeight() / 2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        Connessione c1 = new Connessione();
        c1.connetti();
        ArrayList<String> listaNicknames= c1.cercaNickname();
        ArrayList<String> listaPunteggi = c1.cercaPunteggi();
        c1.disconnetti();
        DefaultListModel<String> model1 = new DefaultListModel<>();
        DefaultListModel<String> model2 = new DefaultListModel<>();
        for(int i = 0; i<listaNicknames.size(); i++){
            String value = listaNicknames.get(i);
            String value2 = listaPunteggi.get(i);
            model1.addElement(value);
            model2.addElement(value2);
        }
        listNicknames=new JList<>(model1);
        listPunteggi = new JList<>(model2);
        listNicknames.setVisible(true);
        listNicknames.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        panelClassifica.setLayout(new GridLayout(1,2));
        panelClassifica.add(listNicknames);
        panelClassifica.add(listPunteggi);
        panelClassifica.setVisible(true);

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                m1.setVisible(true);
            }
        });
    }
}
