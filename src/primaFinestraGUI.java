import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class primaFinestraGUI extends JFrame{
    private JPanel primaFinestra;
    private JButton AVANTIButton;

    public primaFinestraGUI(Connessione c1){
        try {//interfaccia di sistema
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e){

        }
        setContentPane(primaFinestra);
        setTitle("INIZIALE");
        setSize(1000, 800);
        Dimension dim = getToolkit().getScreenSize();
        setLocation(dim.width / 2 - this.getWidth() / 2, dim.height / 2 - this.getHeight() / 2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        AVANTIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuGUI m1 = new menuGUI(c1);
                setVisible(false);
            }
        });
    }
}
