package tests.ui;

import java.awt.Dimension;

import javax.swing.JFrame;

import main.back.modules.update_info.UpdateInfoPresenter;
import main.back.shared.repo.RepositoryMock;
import main.entities.Element;
import main.ui.more_Info.PopUpScreen;


public class TestPopUpScreen {
    public static void main(String[] args){
        Element element = new Element(
            181,
            "Oganessonio",
            "Og",
            0,
            181,
            "GPRNM",
            1766
        );
        JFrame a = new JFrame();
        
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setPreferredSize(new Dimension(500, 300));
        a.setResizable(false);
        a.setLocationRelativeTo(null);

        UpdateInfoPresenter updateInfoPresenter = new UpdateInfoPresenter(new RepositoryMock());
        PopUpScreen popUpScreen = new PopUpScreen(element, updateInfoPresenter);
        a.add(popUpScreen);
        a.pack();
        a.setVisible(true);
    }
}
