package MineSweeper.src.mineSweeper;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;
import java.io.IOException;

/**Java Doc MineSweeper
 *  Hauptmenü des Programms
 *  start -> öffnet neues Fenster, wo die Frame gestartet wird
 *  credits -> öffnet eine Messagefenster mit Credits
 *  ende -> beendet das Programm.
 *
 *
 *
 * @author Plohotnikov
 * DATE 09.03.2020
 */ //Problem -> Image öffnet nicht

public class Menue extends JFrame implements ActionListener{
    private JButton start;
    private JButton credits;
    private JButton ende;


    public Menue () {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400); //fenster
        setLayout(null);


        setLayout(null);
        setVisible(true);

        start = new JButton("Start");                   //Start der Frame
        start.setBounds(120,40,160,40);
        start.addActionListener(this);
        add(start);


        credits = new JButton("Information");           // Credits fenster
        credits.setBounds(120,120,160,40);
        credits.addActionListener(this);
        add(credits);

        ende = new JButton("Beenden");
        ende.setBounds(120,200,160,40);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==start) {
            try {
                Frame frame =  new Frame();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
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
