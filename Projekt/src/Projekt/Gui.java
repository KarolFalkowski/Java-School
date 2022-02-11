package Projekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui  extends JFrame{
    private JLabel Naglowek;
    private JPanel panel;
    private JTextArea nazwa;
    private JButton generujPostacButton;
    private JComboBox frakcja;
    private JComboBox typ;
    private JButton pokazStatystykiButton;
    private JButton walkaButton;

    Npc bohater;

    public Npc generatorPostaci(int frakcja, int typ)
    {
        Npc postac = new Npc() {
        };
        switch (frakcja)
        {

            case 0: switch (typ)
            {
                case 0:  postac = new Chlop(nazwa.getText());
                    break;

                case 1:  postac = new Rycerz(nazwa.getText());
                    break;

                case 2:  postac = new Kusznik(nazwa.getText());
                    break;
            }
                break;

            case 1: switch (typ)
            {
                case 0:  postac = new Diabel(nazwa.getText());
                    break;

                case 1:  postac = new Wampir(nazwa.getText());
                    break;

                case 2:  postac = new Zlodziej(nazwa.getText());
                    break;
            }
                break;

            case 2: switch (typ)
            {
                case 0:  postac = new Smok(nazwa.getText());
                    break;

                case 1:  postac = new Swinia(nazwa.getText());
                    break;

                case 2:  postac = new Kura(nazwa.getText());
                    break;

            }
                break;
        }
        return postac;
    }


    public Gui(String title) throws HeadlessException {
        super(title);
        walkaButton.setVisible(false);
        pokazStatystykiButton.setVisible(false);


        this.setLocation(500,100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();



        frakcja.addItem("Dobry");
        frakcja.addItem("Zły");
        frakcja.addItem("Neutralny");


        typ.addItem("Chłop");
        typ.addItem("Rycerz");
        typ.addItem("Kusznik");






        generujPostacButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                 bohater = generatorPostaci(frakcja.getSelectedIndex() ,typ.getSelectedIndex());
                 bohater.toString();
                walkaButton.setVisible(true);
                pokazStatystykiButton.setVisible(true);

            }
        });
        frakcja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(frakcja.getSelectedIndex() == 0 )//Dobry
                {
                    typ.removeAllItems();
                    typ.addItem("Chłop");
                    typ.addItem("Rycerz");
                    typ.addItem("Kusznik");
                }
                else if(frakcja.getSelectedIndex() == 1)
                {
                    //Zły
                    typ.removeAllItems();
                    typ.addItem("Diabeł");
                    typ.addItem("Wampir");
                    typ.addItem("Złodziej");
                }
                else if(frakcja.getSelectedIndex() == 2)
                {
                    //Neutralny
                    typ.removeAllItems();
                    typ.addItem("Smok");
                    typ.addItem("Świnia");
                    typ.addItem("Kura");
                }

            }
        });
        pokazStatystykiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame staty = new Statystyki(bohater);
                staty.setVisible(true);


            }
        });


        walkaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame walka = new Walka(bohater);
                walka.setVisible(true);
            }
        });


    }
}
