package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Preisrechner {
    private JPanel mainpannel;
    private JLabel Preisrechner;
    private JLabel Einzelpreis;
    private JButton bestätigenButton;
    private JTextField Textanzahl;
    private JTextField Texteinzelpreis;
    private JTextField TextGesamtpreis;

    public Preisrechner() {
        bestätigenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double einzelpreis = Double.valueOf(Texteinzelpreis.getText());
                double anzahl= Double.valueOf(Textanzahl.getText());
                double gesamtpreis= einzelpreis*anzahl;
                TextGesamtpreis.setText(String.valueOf(gesamtpreis));
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
