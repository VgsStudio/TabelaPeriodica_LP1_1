package main.ui.table;

import javax.swing.*;

import main.back.modules.UpdateInfo.UpdateInfoPresenter;
import main.entities.Element;
import main.ui.more_Info.MoreInfoPopUpFactory;

import java.awt.*;
import java.util.ArrayList;

public class PeriodicTable extends JPanel {
    int ROWS = 10;
    int COLUMNS = 18;
    ElementButton button;
    ElementButton[][] buttons = new ElementButton[ROWS][COLUMNS];

    public PeriodicTable(ArrayList<Element> elements, MoreInfoPopUpFactory moreInfoPopUpFactory) {
        super();
        setLayout(new GridLayout(ROWS, COLUMNS));
         int i = 0;

         for (int row = 0; row < 10; row++) {
             for (int col = 0; col < 18; col++) {
                 button = new ElementButton(moreInfoPopUpFactory, this);
                 add(button);
                 buttons[row][col] = button;
                if((row == 0 && (col > 0 && col < 17)) || ((row == 1 || row == 2 ) && (col > 1 && col < 12)) || (row==7) || ((row == 8 || row == 9) && col < 3 )) {

                    if (row == 8 && col == 2)
                    {
                        i = 56;
                    } else if (row == 9 && col == 2) {

                        i = 88;
                    }

                }else{
                    boolean add = true;

                    if (row == 5 && col == 2){
                        remove(button);
                        JLabel label = new JLabel("57 - 71", SwingConstants.CENTER);

                        add(label);
                        i = 71;
                        add = false;
                    }
                    if (row == 6 && col == 2){
                        remove(button);
                        JLabel label = new JLabel("89 - 103", SwingConstants.CENTER);
                        add(label);
                        i = 103;
                        add = false;
                    }

                    if (add){
                        button.setElement(elements.get(i));
                        i++;
                    }

                }
             }

         }
    }
}
