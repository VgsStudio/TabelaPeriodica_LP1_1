package main.ui.table;
import main.entities.Element;
import main.ui.more_Info.MoreInfoPopUpFactory;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PeriodicTableScreen extends JFrame {
    private ArrayList<Element> elements;

    public PeriodicTableScreen(PeriodicTable periodicTable) {
        super("Tabela Periódica");

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Tabela Periódica Interativa");
        label.setAlignmentX(CENTER_ALIGNMENT);
        label.setFont(label.getFont().deriveFont(30.0f));
        add(label);

        add(periodicTable);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocation(screenSize.width/2 - getSize().width/2, screenSize.height/2 - getSize().height/2);
        setVisible(true);
    }
}
