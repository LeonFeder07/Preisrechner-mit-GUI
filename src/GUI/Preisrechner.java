package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Preisrechner {
    private JPanel mainpannel;
    private JLabel Preisrechner;
    private JButton bestätigenButton;
    private JTextField Textanzahl;
    private JTextField Eingabefeld;
    private JButton mal;
    private JTextField WortEndText;
    private JButton minus;
    private JButton plus;
    private JButton geteilt;

    public Preisrechner() {
        final double[] ersteZahl = {0};
        final boolean[] ersteZahlvoll = {false};
         ersteZahlvoll[0]=false;

        final int[] zeichen = {0};
        bestätigenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Eingabefeld.getText()!=null) {
                    double zweiteZahl = Double.valueOf(Eingabefeld.getText());
                }
                double zweiteZahl = Double.valueOf(Eingabefeld.getText());
                if(ersteZahlvoll[0]=true){
                //    double zweiteZahl =Double.valueOf(Eingabefeld.getText());
                if(zeichen[0]==1) {
                    double gesamtpreis = ersteZahl[0] + zweiteZahl;
                    Eingabefeld.setText(String.valueOf(gesamtpreis));
                    ersteZahl[0] = 0;

                }
                    if(zeichen[0]==2) {
                        double gesamtpreis = ersteZahl[0] - zweiteZahl;
                        Eingabefeld.setText(String.valueOf(gesamtpreis));
                        ersteZahl[0] = 0;

                    }
                    if(zeichen[0]==3) {
                        double gesamtpreis = ersteZahl[0] * zweiteZahl;
                        Eingabefeld.setText(String.valueOf(gesamtpreis));

                        ersteZahl[0] = 0;


                    }
                    if(zeichen[0]==4) {
                        if(zweiteZahl!=0) {
                            double gesamtpreis = ersteZahl[0] / zweiteZahl;
                            Eingabefeld.setText(String.valueOf(gesamtpreis));
                            ersteZahl[0] = 0;
                        }else{Eingabefeld.setText("ERROR DIVISION DURCH 0 ");

                    }
              } else if (ersteZahlvoll[0]=false) {
                    Eingabefeld.setText("Bitte zwei Zahlen nund Zeichen eingeben");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                    Eingabefeld.setText("");





                }
            }
        }});

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

             double ersteZahl1 =Double.valueOf(Eingabefeld.getText());
               Eingabefeld.setText("");
               ersteZahl[0] =ersteZahl1;
               zeichen[0] = 1;
               ersteZahlvoll[0] = true;

            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double ersteZahl1 =Double.valueOf(Eingabefeld.getText());
                Eingabefeld.setText("");
                ersteZahl[0] =ersteZahl1;
                zeichen[0] = 2;
            }
        });
        mal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double ersteZahl1 =Double.valueOf(Eingabefeld.getText());
                Eingabefeld.setText("");
                ersteZahl[0] =ersteZahl1;
                zeichen[0] = 3;
            }
        });
        geteilt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double ersteZahl1 =Double.valueOf(Eingabefeld.getText());
                Eingabefeld.setText("");
                ersteZahl[0] =ersteZahl1;
                zeichen[0] = 4;
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Preisrechner");
        frame.setContentPane(new Preisrechner().mainpannel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
