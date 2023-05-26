package main.ui.table;

import javax.swing.*;

import main.entities.Element;
import main.ui.more_Info.MoreInfoPopUpFactory;

import java.awt.*;

public class ElementButton extends JButton {

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private Element element;
    private MoreInfoPopUpFactory moreInfoPopUpFactory;

    ElementButton(MoreInfoPopUpFactory moreInfoPopUpFactory) {
        super();
        this.moreInfoPopUpFactory = moreInfoPopUpFactory;
        Dimension dimension = new Dimension(screenSize.width/30, screenSize.width/30);
        setPreferredSize(dimension);
        setMargin(new Insets(1, 1, 1, 1));
        setVisible(false);
    }

    ElementButton(Element element, MoreInfoPopUpFactory moreInfoPopUpFactory){
        super();
        this.moreInfoPopUpFactory = moreInfoPopUpFactory;
        Dimension dimension = new Dimension(screenSize.width/30, screenSize.width/30);
        setPreferredSize(dimension);
        setMargin(new Insets(1, 1, 1, 1));
        setElement(element);
        setVisible(true);
    }

    public void setElement(Element element) {
        this.element = element;

        JLabel numberLabel = new JLabel(String.valueOf(element.getAtomicNumber()));
        numberLabel.setFont(new Font("Arial", Font.PLAIN, screenSize.width/150));
        numberLabel.setVerticalAlignment(JLabel.TOP);
        numberLabel.setHorizontalAlignment(JLabel.LEFT);

        JLabel symbolLabel = new JLabel(element.getSymbol());
        symbolLabel.setFont(new Font("Arial", Font.BOLD, screenSize.width/100));
        symbolLabel.setVerticalAlignment(JLabel.CENTER);
        symbolLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel nameLabel = new JLabel(element.getName());
        nameLabel.setFont(new Font("Arial", Font.PLAIN, screenSize.width/150));
        nameLabel.setVerticalAlignment(JLabel.BOTTOM);
        nameLabel.setHorizontalAlignment(JLabel.CENTER);

        setLayout(new BorderLayout());
        add(numberLabel, BorderLayout.NORTH);
        add(symbolLabel, BorderLayout.CENTER);
        add(nameLabel, BorderLayout.SOUTH);

        setBackground(Color.decode(element.getColor()));

        setToolTipText(element.getName());
        addActionListener(e -> moreInfoPopUpFactory.createPopUp(element));

        setVisible(true);
    }

}
