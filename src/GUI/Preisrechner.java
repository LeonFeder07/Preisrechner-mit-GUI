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
        double ersteZahl;
        double zweiteZahl= 0;
        int zeichen= 0;
        bestätigenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                double gesamtpreis= ersteZahl+zweiteZahl;
                Eingabefeld.setText(String.valueOf(gesamtpreis));
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(null== ersteZahl){
                    ersteZahl=Double.valueOf(Eingabefeld.getText());
                };
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        mal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        geteilt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
