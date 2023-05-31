import javax.swing.*;
import java.awt.*;
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
    private JLabel lblPunteggio;
    private menuGUI m1;
    private boolean[][] sotto;
    private int punteggio;

    public partitaGUI(menuGUI m1, boolean[][] sotto, String nickname){
        setContentPane(Game);
        setTitle("menu");
        setSize(1200, 1000);
        Dimension dim = getToolkit().getScreenSize();
        setLocation(dim.width / 2 - this.getWidth() / 2, dim.height / 2 - this.getHeight() / 2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        Connessione c1 = new Connessione();
        this.m1=m1;
        this.sotto= sotto;
        punteggio = 0;
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
                        partitaPersa p1 = new partitaPersa(m1, punteggio);
                        setVisible(false);
                    }else{
                        NEButton00.setText("NO BOMBA");
                        punteggio +=1;
                    }

            }
        });

        NEButton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (sotto[0][1]){

                    NEButton01.setText("E");
                    partitaPersa p1 = new partitaPersa(m1, punteggio);
                    setVisible(false);
                }else{
                    NEButton01.setText("NO BOMBA");
                    punteggio +=1;
                    lblPunteggio.setText("PUNTEGGIO"+punteggio);
                }

            }
        });
        NEButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (sotto[0][2]){

                    NEButton02.setText("E");
                    partitaPersa p1 = new partitaPersa(m1, punteggio);
                    setVisible(false);
                }else{
                    NEButton02.setText("NO BOMBA");
                    punteggio +=1;
                    lblPunteggio.setText("PUNTEGGIO"+punteggio);
                }

            }
        });
        NEButton03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (sotto[0][3]){

                    NEButton03.setText("E");
                    partitaPersa p1 = new partitaPersa(m1, punteggio);
                    setVisible(false);
                }else{
                    punteggio +=1;
                    NEButton03.setText("NO BOMBA");
                    lblPunteggio.setText("PUNTEGGIO"+punteggio);
                }

            }
        });
        NEButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (sotto[1][0]){

                    NEButton10.setText("E");
                    partitaPersa p1 = new partitaPersa(m1, punteggio);
                    setVisible(false);
                }else{
                    punteggio +=1;
                    NEButton10.setText("NO BOMBA");
                    lblPunteggio.setText("PUNTEGGIO"+punteggio);
                }

            }
        });
        NEButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (sotto[1][1]){

                    NEButton11.setText("E");
                    partitaPersa p1 = new partitaPersa(m1, punteggio);
                    setVisible(false);
                }else{
                    punteggio +=1;
                    NEButton11.setText("NO BOMBA");
                    lblPunteggio.setText("PUNTEGGIO"+punteggio);
                }

            }
        });
        NEButton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (sotto[1][2]){

                    NEButton12.setText("E");
                    partitaPersa p1 = new partitaPersa(m1, punteggio);
                    setVisible(false);
                }else{
                    punteggio +=1;
                    NEButton12.setText("NO BOMBA");
                    lblPunteggio.setText("PUNTEGGIO"+punteggio);
                }

            }
        });NEButton13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (sotto[1][3]){

                    NEButton13.setText("E");
                    partitaPersa p1 = new partitaPersa(m1, punteggio);
                    setVisible(false);
                }else{
                    punteggio +=1;
                    NEButton13.setText("NO BOMBA");
                    lblPunteggio.setText("PUNTEGGIO"+punteggio);
                }

            }
        });
        NEButton20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (sotto[2][0]){


                    NEButton20.setText("E");
                    partitaPersa p1 = new partitaPersa(m1, punteggio);
                    setVisible(false);
                }else{
                    punteggio +=1;
                    NEButton20.setText("NO BOMBA");
                    lblPunteggio.setText("PUNTEGGIO"+punteggio);
                }

            }
        });
        NEButton21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (sotto[2][1]){

                    NEButton21.setText("E");
                    partitaPersa p1 = new partitaPersa(m1, punteggio);
                    setVisible(false);
                }else{
                    punteggio +=1;
                    NEButton21.setText("NO BOMBA");
                    lblPunteggio.setText("PUNTEGGIO"+punteggio);
                }

            }
        });
        NEButton22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (sotto[2][2]){

                    NEButton22.setText("E");
                    partitaPersa p1 = new partitaPersa(m1, punteggio);
                    setVisible(false);
                }else{
                    punteggio +=1;
                    NEButton22.setText("NO BOMBA");
                    lblPunteggio.setText("PUNTEGGIO"+punteggio);
                }

            }
        });
        NEButton23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sotto[2][3]){

                    NEButton23.setText("E");
                    partitaPersa p1 = new partitaPersa(m1, punteggio);
                    setVisible(false);
                }else{
                    punteggio +=1;
                    NEButton23.setText("NO BOMBA");
                    lblPunteggio.setText("PUNTEGGIO"+punteggio);
                }
            }
        });
        NEButton30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sotto[3][0]){
                    NEButton30.setText("E");
                    partitaPersa p1 = new partitaPersa(m1, punteggio);
                    setVisible(false);
                }else{
                    punteggio +=1;
                    NEButton30.setText("NO BOMBA");
                    lblPunteggio.setText("PUNTEGGIO"+punteggio);
                }
            }
        });
        NEButton31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sotto[3][1]){

                    NEButton31.setText("E");
                    partitaPersa p1 = new partitaPersa(m1, punteggio);
                    setVisible(false);
                }else{
                    punteggio +=1;
                    NEButton31.setText("NO BOMBA");
                    lblPunteggio.setText("PUNTEGGIO"+punteggio);
                }
            }
        });
        NEButton32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sotto[3][2]){

                    NEButton32.setText("E");
                    partitaPersa p1 = new partitaPersa(m1, punteggio);
                    setVisible(false);
                }else{
                    punteggio +=1;
                    NEButton32.setText("NO BOMBA");
                    lblPunteggio.setText("PUNTEGGIO"+punteggio);
                }
            }
        });
        NEButton33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sotto[3][3]){

                    NEButton33.setText("E");
                    partitaPersa p1 = new partitaPersa(m1, punteggio);
                    setVisible(false);
                }else{
                    punteggio +=1;
                    NEButton33.setText("NO BOMBA");
                    lblPunteggio.setText("PUNTEGGIO"+punteggio);
                }
            }
        });


    }



}
