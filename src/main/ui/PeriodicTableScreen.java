package main.ui;

import javax.swing.*;
import java.awt.*;

public class PeriodicTableScreen extends JFrame {
    public PeriodicTableScreen() {
        super("Periodic Table");

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Tabela Periódica");
        label.setAlignmentX(CENTER_ALIGNMENT);
        label.setFont(label.getFont().deriveFont(30.0f));
        add(label);

        add(new PeriodicTable());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocation(screenSize.width/2 - getSize().width/2, screenSize.height/2 - getSize().height/2);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PeriodicTableScreen();
    }
}
