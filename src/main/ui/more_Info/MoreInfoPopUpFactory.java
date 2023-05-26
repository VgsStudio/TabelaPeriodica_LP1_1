package main.ui.more_Info;

import main.entities.Element;

import javax.swing.*;

public class MoreInfoPopUpFactory {
    private JFrame popUp;

    public void createPopUp(Element element)
    {
        if (popUp == null)
        {
            popUp = new JFrame(element.getName());
            popUp.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                    popUp = null;
                }
            });
            popUp.setSize(500,500);
            popUp.setVisible(true);
            popUp.setResizable(false);
            popUp.setLocationRelativeTo(null);
            popUp.add(new PopUpScreen(element));
            popUp.pack();
        }
        else {
            changeElement(element);
        }
    }

    private void changeElement(Element element) {
        popUp.setTitle(element.getName());
        popUp.getContentPane().removeAll();
        popUp.getContentPane().add(new PopUpScreen(element));
        popUp.revalidate();
        popUp.repaint();
        popUp.toFront();
    }
}
