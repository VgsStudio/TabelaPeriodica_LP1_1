package main.ui.more_Info;

import main.entities.Element;

public class MoreInfoPopUpFactory {
    public void createPopUp(Element element)
    {
        new PopUpScreen(element);
    }
}
