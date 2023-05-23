package main.ui.table;

import main.element.Element;

import javax.swing.*;
import java.awt.*;

public class PeriodicTable extends JPanel {
    int ROWS = 10;
    int COLUMNS = 18;
    ElementButton button;
    ElementButton[][] buttons = new ElementButton[ROWS][COLUMNS];


    Element element = new Element(
            1,
            "Hidrogênio",
            "H",
            0,
            1,
            "gases nobres",
            "1766"
    );

    String[] test = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118"};

    public PeriodicTable() {
        super();
         setLayout(new GridLayout(ROWS, COLUMNS));
         int i = 0;

         for (int row = 0; row < 10; row++) {
             for (int col = 0; col < 18; col++) {
                 button = new ElementButton();
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
                        button.setElement(element);
                        i++;
                    }

                }
             }

         }
    }
}
