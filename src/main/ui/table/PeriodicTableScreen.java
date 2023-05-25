package main.ui.table;

import main.back.modules.GetAllElements.GetAllElementsPresenter;
import main.entities.Element;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PeriodicTableScreen extends JFrame {
    GetAllElementsPresenter presenter = new GetAllElementsPresenter();
    private ArrayList<Element> elements;

    public PeriodicTableScreen() {
        super("Periodic Table");
        elements = presenter.call();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Tabela Periódica");
        label.setAlignmentX(CENTER_ALIGNMENT);
        label.setFont(label.getFont().deriveFont(30.0f));
        add(label);


        add(new PeriodicTable(elements));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocation(screenSize.width/2 - getSize().width/2, screenSize.height/2 - getSize().height/2);
        setVisible(true);
    }
}
