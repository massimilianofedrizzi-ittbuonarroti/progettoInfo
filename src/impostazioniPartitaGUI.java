import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;
import java.util.ArrayList;
import java.util.Random;

public class impostazioniPartitaGUI extends JFrame{
    private JLabel lblTitle;
    private JLabel lblProfili;

    private JLabel lblDIfficoltà;
    private String nickname;
    private JSlider slider1;
    private JPanel settings;
    private JButton btnBack;
    private JButton btnAvanti;
    private JPanel pnlLista;
    private JLabel lblInfo;
    private JList listNicknames;
    private menuGUI m1;
    private boolean[][] sotto;
    public impostazioniPartitaGUI(menuGUI m1, Connessione c1){

        setContentPane(settings);
        setTitle("menu");
        setSize(600, 400);
        Dimension dim = getToolkit().getScreenSize();
        setLocation(dim.width / 2 - this.getWidth() / 2, dim.height / 2 - this.getHeight() / 2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        this.m1 = m1;
        this.sotto = sotto;
        c1.connetti();
        ArrayList<String> listaNicknames= c1.cercaNickname();
        c1.disconnetti();
        DefaultListModel<String> model = new DefaultListModel<>();
        for(int i = 0; i<listaNicknames.size(); i++){
            String value = listaNicknames.get(i);
            model.addElement(value);
        }
        listNicknames=new JList<>(model);
        listNicknames.setVisible(true);
        listNicknames.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        pnlLista.setLayout(new GridLayout(1,1));
        pnlLista.add(listNicknames);
        pnlLista.setVisible(true);






        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                m1.setVisible(true);
            }
        });
        btnAvanti.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(listNicknames.isSelectionEmpty()){
                    lblInfo.setText("NON HAI SELEZIONATO NESSUN NICKNAME, riprova");
                }else{
                    nickname = (String) listNicknames.getSelectedValue();
                    Random rand = new Random();
                    boolean sotto[][]=new boolean[4][4];
                    for(int i = 0; i< 4; i++){
                        int j = rand.nextInt(4);
                        int v = rand.nextInt(4);
                        sotto[j][v] = true;
                    }
                    partitaGUI p1 = new partitaGUI(m1, sotto, getNickname());
                }
                setVisible(false);
            }
        });

    }
    public String getNickname(){
        this.nickname = nickname;
        return nickname;
    }

}
