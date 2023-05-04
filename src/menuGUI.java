import javax.swing.*;

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
    }
}
