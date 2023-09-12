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
    private JButton eingabenLöschenButton;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton a8Button;
    private JButton a7Button;
    private JButton a0Button;
    private JButton buttonPunkt;

    public Preisrechner() {
        final double[] ersteZahl = {0};
        final boolean[] ersteZahlvoll = {false};
         ersteZahlvoll[0]=false;
        final double[] zweiteZahl = {0};


        final int[] zeichen = {0};
        zeichen[0]=7;
        bestätigenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Eingabefeld.getText()!=null) {
                     zweiteZahl[0] = Double.valueOf(Eingabefeld.getText());
                }
             zweiteZahl[0] = Double.valueOf(Eingabefeld.getText());
                if(ersteZahlvoll[0]=true){
                //    double zweiteZahl =Double.valueOf(Eingabefeld.getText());
                if(zeichen[0]==1) {
                    double gesamtpreis = ersteZahl[0] + zweiteZahl[0];
                    Eingabefeld.setText(String.valueOf(gesamtpreis));
                    ersteZahl[0] = 0;

                }
                    if(zeichen[0]==7) {

                        Eingabefeld.setText("Bitte ein Zeichen eingeben");


                    }
                    if(zeichen[0]==2) {
                        double gesamtpreis = ersteZahl[0] - zweiteZahl[0];
                        Eingabefeld.setText(String.valueOf(gesamtpreis));
                        ersteZahl[0] = 0;

                    }
                    if(zeichen[0]==3) {
                        double gesamtpreis = ersteZahl[0] * zweiteZahl[0];
                        Eingabefeld.setText(String.valueOf(gesamtpreis));

                        ersteZahl[0] = 0;


                    }
                    if(zeichen[0]==4) {
                        if(zweiteZahl[0]!=0) {
                            double gesamtpreis = ersteZahl[0] / zweiteZahl[0];
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
        eingabenLöschenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ersteZahl[0]= 0;
                zweiteZahl[0]= 0;
                zeichen[0]=7;
                Eingabefeld.setText("");

            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inhalt=Eingabefeld.getText();

                Eingabefeld.setText(inhalt+ "1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inhalt=Eingabefeld.getText();

                Eingabefeld.setText(inhalt+ "2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inhalt=Eingabefeld.getText();

                Eingabefeld.setText(inhalt+ "3");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inhalt=Eingabefeld.getText();

                Eingabefeld.setText(inhalt+ "6");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inhalt=Eingabefeld.getText();

                Eingabefeld.setText(inhalt+ "5");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inhalt=Eingabefeld.getText();

                Eingabefeld.setText(inhalt+ "4");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inhalt=Eingabefeld.getText();

                Eingabefeld.setText(inhalt+ "9");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inhalt=Eingabefeld.getText();

                Eingabefeld.setText(inhalt+ "8");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inhalt=Eingabefeld.getText();

                Eingabefeld.setText(inhalt+ "7");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inhalt=Eingabefeld.getText();

                Eingabefeld.setText(inhalt+ "0");
            }
        });
        buttonPunkt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inhalt=Eingabefeld.getText();

                Eingabefeld.setText(inhalt+ ".");
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
