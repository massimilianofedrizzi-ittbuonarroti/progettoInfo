import javax.swing.*;
import java.awt.*;
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
        setSize(600, 400);
        Dimension dim = getToolkit().getScreenSize();
        setLocation(dim.width / 2 - this.getWidth() / 2, dim.height / 2 - this.getHeight() / 2);
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
