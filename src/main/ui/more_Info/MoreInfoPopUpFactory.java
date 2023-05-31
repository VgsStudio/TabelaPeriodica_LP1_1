package main.ui.more_Info;

import main.back.modules.update_info.UpdateInfoPresenter;
import main.entities.Element;

import javax.swing.*;
import java.awt.*;

public class MoreInfoPopUpFactory {
    private JFrame popUp;
    private UpdateInfoPresenter updateInfoPresenter;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public MoreInfoPopUpFactory(UpdateInfoPresenter updateInfoPresenter) {
        this.updateInfoPresenter = updateInfoPresenter;
    }

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
            popUp.setPreferredSize(new Dimension(500, 300));
            popUp.setResizable(false);
            popUp.add(new PopUpScreen(element,  updateInfoPresenter));
            popUp.setAlwaysOnTop(true);
            popUp.pack();
            popUp.setLocation(screenSize.width/2 - popUp.getSize().width/2, screenSize.height/2 - popUp.getSize().height/2);
            popUp.setVisible(true);
        }
        else {
            changeElement(element);
        }
    }

    private void changeElement(Element element) {
        popUp.setTitle(element.getName());
        popUp.getContentPane().removeAll();
        popUp.getContentPane().add(new PopUpScreen(element, updateInfoPresenter ));
        popUp.revalidate();
        popUp.repaint();
        popUp.toFront();
    }
}
