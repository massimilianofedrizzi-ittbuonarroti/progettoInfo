import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class classificaGUI extends JFrame{
    private JPanel classifica;
    private JLabel lblTitle;
    private JList listClassifica;
    private JButton btnBack;

    public classificaGUI(menuGUI m1){
        setContentPane(classifica);
        setTitle("menu");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                m1.setVisible(true);
            }
        });
    }
}
