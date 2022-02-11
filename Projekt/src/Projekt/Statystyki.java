package Projekt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Statystyki extends JFrame{
    private JButton powrótButton;
    private JLabel zyce;
    private JLabel obrazena;
    private JLabel rasa;
    private JLabel mana;
    private JPanel panel2;
    private JLabel nazwaPostaci;
    private JLabel klasa;
    private JLabel awatar;


    public Statystyki(Npc postac) {
        super("Statystyki");

        nazwaPostaci.setText(postac.nazwa);
        zyce.setText(String.valueOf(postac.zycie));
        obrazena.setText(String.valueOf(postac.obrazenia));
        rasa.setText(postac.rasa);
        mana.setText(String.valueOf(postac.mana));
        klasa.setText(String.valueOf(postac.getClass().getSimpleName()));

        this.setContentPane(panel2);
        this.setLocation(300,100);
        this.pack();

        switch (postac.getClass().getSimpleName())
        {
            case "Chlop": awatar.setIcon(new ImageIcon("chłop.png"));
                break;
            case "Rycerz": awatar.setIcon(new ImageIcon("rycerz.png"));
                break;
            case "Kusznik": awatar.setIcon(new ImageIcon("kusznik.png"));
                break;
            case "Diabel": awatar.setIcon(new ImageIcon("diabeł.png"));
                break;
            case "Wampir": awatar.setIcon(new ImageIcon("wampir.png"));
                break;
            case "Zlodziej": awatar.setIcon(new ImageIcon("zlodziej.png"));
                break;
            case "Smok": awatar.setIcon(new ImageIcon("smok.png"));
                break;
            case "Swinia": awatar.setIcon(new ImageIcon("swinia.png"));
                break;
            case "Kura": awatar.setIcon(new ImageIcon("kura.png"));
                break;
            default: awatar.setIcon(new ImageIcon("blob.png"));
        }


        powrótButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
