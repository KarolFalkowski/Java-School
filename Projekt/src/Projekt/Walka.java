package Projekt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class Walka extends JFrame{
    private JPanel panel3;
    private JLabel zycePostaci;
    private JLabel zycePrzeciwnika;
    private JButton atakMeleButton;
    private JButton atakDystansowyButton;
    private JButton atakMagicznyButton;
    private JLabel nazwaPrzeciwnika;
    private JLabel rasaPrzeciwnika;
    private JLabel klasaPrzeciwnka;
    private JLabel bohater;
    private JLabel przestrzenPodSerce;
    private JLabel awatar;
    private JLabel awatarWroga;

void pokazPrzyciski(Npc postac)
{
    switch (postac.rodzajataku)
    {
        case 1:
            atakMeleButton.setVisible(true);
            atakDystansowyButton.setVisible(false);
            atakMagicznyButton.setVisible(false);
            break;

        case 2:
            atakMeleButton.setVisible(true);
            atakDystansowyButton.setVisible(false);
            atakMagicznyButton.setVisible(true);
            break;

        case 3:
            atakMeleButton.setVisible(true);
            atakDystansowyButton.setVisible(true);
            atakMagicznyButton.setVisible(false);
            break;
        default:
    }
}


    public Npc generatorPostaci(int frakcja, int typ)
    {
        Npc postac = new Npc() {
        };
        switch (frakcja)
        {

            case 0: switch (typ)
            {
                case 0:  postac = new Chlop();
                    break;

                case 1:  postac = new Rycerz();
                    break;

                case 2:  postac = new Kusznik();
                    break;
            }
                break;

            case 1: switch (typ)
            {
                case 0:  postac = new Diabel();
                    break;

                case 1:  postac = new Wampir();
                    break;

                case 2:  postac = new Zlodziej();
                    break;
            }
                break;

            case 2: switch (typ)
            {
                case 0:  postac = new Smok();
                    break;

                case 1:  postac = new Swinia();
                    break;

                case 2:  postac = new Kura();
                    break;

            }
                break;
        }
        return postac;
    }


    public Walka(Npc postac) {
        super("Pole walki");
        this.setContentPane(panel3);
        this.setLocation(800,100);
        this.pack();


        pokazPrzyciski(postac);



        zycePostaci.setText(String.valueOf(postac.zycie));



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

        // generowanie wroga
        Random los = new Random();




        Npc wrog = generatorPostaci(los.nextInt(3),los.nextInt(3));

        zycePrzeciwnika.setText(String.valueOf(wrog.zycie));
        nazwaPrzeciwnika.setText(wrog.nazwa);
        klasaPrzeciwnka.setText(wrog.getClass().getSimpleName());
        rasaPrzeciwnika.setText(wrog.rasa);
        ImageIcon zdjecie = new ImageIcon("serce.png");
        przestrzenPodSerce.setIcon(zdjecie);

        switch (wrog.getClass().getSimpleName())
        {
            case "Chlop": awatarWroga.setIcon(new ImageIcon("chłop.png"));
                break;
            case "Rycerz": awatarWroga.setIcon(new ImageIcon("rycerz.png"));
                break;
            case "Kusznik": awatarWroga.setIcon(new ImageIcon("kusznik.png"));
                break;
            case "Diabel": awatarWroga.setIcon(new ImageIcon("diabeł.png"));
                break;
            case "Wampir": awatarWroga.setIcon(new ImageIcon("wampir.png"));
                break;
            case "Zlodziej": awatarWroga.setIcon(new ImageIcon("zlodziej.png"));
                break;
            case "Smok": awatarWroga.setIcon(new ImageIcon("smok.png"));
                break;
            case "Swinia": awatarWroga.setIcon(new ImageIcon("swinia.png"));
                break;
            case "Kura": awatarWroga.setIcon(new ImageIcon("kura.png"));
                break;
            default: awatarWroga.setIcon(new ImageIcon("blob.png"));
        }


        do
        {
            //atakMeleButton.setVisible(true);
            //atakDystansowyButton.setVisible(true);

            pokazPrzyciski(postac);
        atakMeleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int zp = Integer.valueOf(zycePrzeciwnika.getText());
                zp -= postac.obrazenia;
                zycePrzeciwnika.setText(String.valueOf(zp));
                atakMeleButton.setVisible(false);
                atakDystansowyButton.setVisible(false);
                atakMagicznyButton.setVisible(false);

                int zb = Integer.valueOf(zycePostaci.getText());
                zb -= wrog.obrazenia;
                zycePostaci.setText(String.valueOf(zb));

                pokazPrzyciski(postac);
                if(Integer.valueOf(zycePrzeciwnika.getText()) <= 0 ) {
                    System.out.println("Wygałes");
                    dispose();
                }
                if(Integer.valueOf(zycePostaci.getText()) <= 0) {
                    System.out.println("Przegrałes");
                    dispose();
                }

            }

        });

            atakDystansowyButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int zp = Integer.valueOf(zycePrzeciwnika.getText());
                    zp -= postac.obrazenia;
                    zycePrzeciwnika.setText(String.valueOf(zp));
                    atakMeleButton.setVisible(false);
                    atakDystansowyButton.setVisible(false);
                    atakMagicznyButton.setVisible(false);

                    int zb = Integer.valueOf(zycePostaci.getText());
                    zb -= wrog.obrazenia;
                    zycePostaci.setText(String.valueOf(zb));

                    pokazPrzyciski(postac);
                    if(Integer.valueOf(zycePrzeciwnika.getText()) <= 0 ) {
                        System.out.println("Wygałes");
                        dispose();
                    }
                    if(Integer.valueOf(zycePostaci.getText()) <= 0) {
                        System.out.println("Przegrałes");
                        dispose();
                    }

                }
            });

            atakMagicznyButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int zp = Integer.valueOf(zycePrzeciwnika.getText());
                    zp -= postac.obrazenia;
                    zycePrzeciwnika.setText(String.valueOf(zp));
                    atakMeleButton.setVisible(false);
                    atakDystansowyButton.setVisible(false);
                    atakMagicznyButton.setVisible(false);

                    int zb = Integer.valueOf(zycePostaci.getText());
                    zb -= wrog.obrazenia;
                    zycePostaci.setText(String.valueOf(zb));

                    pokazPrzyciski(postac);
                    if(Integer.valueOf(zycePrzeciwnika.getText()) <= 0 ) {
                        System.out.println("Wygrałes");
                        dispose();
                    }
                    if(Integer.valueOf(zycePostaci.getText()) <= 0) {
                        System.out.println("Przegrałes");
                        dispose();
                    }

                }
            });

        }while (Integer.valueOf(zycePrzeciwnika.getText()) <= 0 || Integer.valueOf(zycePostaci.getText()) <=0);



    }
}
