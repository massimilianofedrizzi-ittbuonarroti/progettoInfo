import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class partitaGUI  extends JFrame{
    private JButton NEButton00;
    private JButton NEButton01;
    private JButton NEButton02;
    private JButton NEButton03;
    private JButton NEButton10;
    private JButton NEButton11;
    private JButton NEButton12;
    private JButton NEButton13;
    private JButton NEButton20;
    private JButton NEButton21;
    private JButton NEButton22;
    private JButton NEButton30;
    private JButton NEButton31;
    private JButton NEButton23;
    private JButton NEButton32;
    private JButton NEButton33;
    private JLabel lblTitle;
    private JLabel lblNomeGiocatore;
    private JPanel Game;
    private JButton btnBack;
    private menuGUI m1;
    private boolean[][] sotto;

    public partitaGUI(menuGUI m1, boolean[][] sotto){
        setContentPane(Game);
        setTitle("menu");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        this.m1=m1;
        this.sotto= sotto;
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                m1.setVisible(true);
            }
        });
        NEButton00.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed (ActionEvent e){
                    if (sotto[0][0]){

                        NEButton00.setText("E");
                    }else{
                        NEButton00.setText("NO BOMBA");
                    }

            }
        });

        NEButton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (sotto[0][1]){

                    NEButton01.setText("E");
                }else{
                    NEButton01.setText("NO BOMBA");
                }

            }
        });
        NEButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (sotto[0][2]){

                    NEButton02.setText("E");
                }else{
                    NEButton02.setText("NO BOMBA");
                }

            }
        });
        NEButton03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (sotto[0][3]){

                    NEButton03.setText("E");
                }else{
                    NEButton03.setText("NO BOMBA");
                }

            }
        });
        NEButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (sotto[1][0]){

                    NEButton10.setText("E");
                }else{
                    NEButton10.setText("NO BOMBA");
                }

            }
        });
        NEButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (sotto[1][1]){

                    NEButton11.setText("E");
                }else{
                    NEButton11.setText("NO BOMBA");
                }

            }
        });
        NEButton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (sotto[1][2]){

                    NEButton12.setText("E");
                }else{
                    NEButton12.setText("NO BOMBA");
                }

            }
        });NEButton13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (sotto[1][3]){

                    NEButton13.setText("E");
                }else{
                    NEButton13.setText("NO BOMBA");
                }

            }
        });
        NEButton20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (sotto[2][0]){

                    NEButton20.setText("E");
                }else{
                    NEButton20.setText("NO BOMBA");
                }

            }
        });
        NEButton21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (sotto[2][1]){

                    NEButton21.setText("E");
                }else{
                    NEButton21.setText("NO BOMBA");
                }

            }
        });
        NEButton22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (sotto[2][2]){

                    NEButton22.setText("E");
                }else{
                    NEButton22.setText("NO BOMBA");
                }

            }
        });
        NEButton23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NEButton23.setText("E");
            }
        });
        NEButton30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NEButton30.setText("E");
            }
        });
        NEButton31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NEButton31.setText("E");
            }
        });
        NEButton32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NEButton32.setText("E");
            }
        });
        NEButton33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NEButton33.setText("E");
            }
        });


    }



}
