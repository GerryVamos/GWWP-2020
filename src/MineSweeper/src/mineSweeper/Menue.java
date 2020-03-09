package MineSweeper.src.mineSweeper;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;

/**Java Doc MineSweeper
 *
 *
 * @author Plohotnikov
 */

public class Menue extends JFrame implements ActionListener{
    private JButton start;
    private JButton credits;
    private JButton ende;
    private Object Frame;


    public static void main (String[] args) {
        Menue frame = new Menue("MineSweeper");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);


        frame.setLayout(null);
        frame.setVisible(true);




    }
    public Menue (String title) {
        super(title);
        start = new JButton("Start");
        start.setBounds(120,40,160,40);
        start.addActionListener(this);
        add(start);


        credits = new JButton("Information");
        credits.setBounds(120,200,160,40);
        credits.addActionListener(this);
        add(credits);

        ende = new JButton("Beenden");
        ende.setBounds(120,280,160,40);
        ende.addActionListener(this);
        add(ende);






    }

    public static void fenster(JPanel option) {
        JFrame fenster = new JFrame();
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setSize(650,350);
        fenster.setVisible(true);
        fenster.add(option);
    }
    public static void auswahl() {

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==start) {
            fenster(new Frame());
        }
        if(e.getSource()==credits) {
            Object[] options= {"Okay"};

            JOptionPane.showOptionDialog(null,"Dieses Programm wurde mit besten Wissen und Gewissen von 5 Dummköpfen erstellt(PS: Zanker der HuSo)","title",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,options,options[0]);

        }
        if(e.getSource()== ende) {
            System.exit(0);
        }


    }
}
