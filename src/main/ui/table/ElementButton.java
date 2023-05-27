package main.ui.table;

import javax.swing.*;

import main.entities.Element;
import main.ui.more_Info.MoreInfoPopUpFactory;

import java.awt.*;
import java.util.Objects;

public class ElementButton extends JButton {

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private Element element = null;
    private MoreInfoPopUpFactory moreInfoPopUpFactory;

    ElementButton(MoreInfoPopUpFactory moreInfoPopUpFactory, PeriodicTable periodicTable) {
        super();
        this.moreInfoPopUpFactory = moreInfoPopUpFactory;
        Dimension dimension = new Dimension(screenSize.width/30, screenSize.width/30);
        setPreferredSize(dimension);
        setMargin(new Insets(1, 1, 1, 1));
        this.addMouseListener(
                new java.awt.event.MouseAdapter() {
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        setBorder(BorderFactory.createLineBorder(Color.BLACK));
                        for (int row = 0; row < periodicTable.ROWS; row++) {
                                for (int col = 0; col < periodicTable.COLUMNS; col++) {
                                    ElementButton butttonAux = periodicTable.buttons[row][col];
                                    Element elementAux = butttonAux.getElement();

                                    if (elementAux != null)
                                    {
                                        if (!Objects.equals(elementAux.getGroupName(), element.getGroupName()))
                                        {
                                            butttonAux.setBackground(
                                                    new Color(
                                                            Math.max(butttonAux.getBackground().getRed() - 50, 0),
                                                            Math.max(butttonAux.getBackground().getGreen() - 50, 0),
                                                            Math.max(butttonAux.getBackground().getBlue() - 50, 0)
                                                    )
                                            );
                                        }
                                    }

                                }
                            }
                    }

                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        for (int row = 0; row < periodicTable.ROWS; row++) {
                            for (int col = 0; col < periodicTable.COLUMNS; col++) {
                                ElementButton butttonAux = periodicTable.buttons[row][col];

                                if(butttonAux.getElement() != null){
                                    butttonAux.setBackground(
                                        Color.decode(butttonAux.getElement().getColor())
                                    );
                                }

                            }
                        }
                        setBorder(BorderFactory.createLineBorder(Color.GRAY));
                    }
                }
        );
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

    public Element getElement() {

        return element;
    }

}
