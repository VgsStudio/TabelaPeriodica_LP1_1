package tests;

import main.element.Element;
import main.ui.more_Info.PopUpScreen;


public class TestPopUpScreen {
    public static void main(String[] args){
        Element element = new Element(
            1,
            "Hidrogênio",
            "H",
            0,
            1,
            "gases nobres",
            "1766"            
        );

        PopUpScreen popUpScreen = new PopUpScreen(element);
        popUpScreen.setVisible(true);
    }
}
