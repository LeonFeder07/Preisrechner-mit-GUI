package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Preisrechner {
    private JPanel mainpannel;
    private JLabel Preisrechner;
    private JLabel Wort1;
    private JButton bestätigenButton;
    private JTextField Textanzahl;
    private JTextField Wort1Text;
    private JTextField WortEndText;
    private JLabel WortEnd;
    private JButton minus;
    private JButton plus;
    private JButton geteilt;

    public Preisrechner() {
        bestätigenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String wort = Wort1Text.getText();
                String wortvorher = WortEndText.getText();
                String gesamtpreis= wortvorher+wort;
                WortEndText.setText(String.valueOf(gesamtpreis));
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
