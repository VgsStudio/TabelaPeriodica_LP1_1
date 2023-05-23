package main.ui;
import main.element.ElmentTest;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class PopUpScreen extends JFrame implements ActionListener {
    private JButton infBt, saveBt; 
    private JTextField info;
    private JPanel atomStuff , panel1 , panel2 , panel3 , panel4;
    


    public PopUpScreen(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
        this.setResizable(false);
        JButton infBt = new JButton("New info");
        JButton saveBt = new JButton("Save");
        JTextField info = new JTextField();
        JPanel atomStuff = new JPanel(new GridBagLayout()),
        panel1 = new JPanel(new GridBagLayout()), 
        panel2 = new JPanel(new GridBagLayout()), 
        panel3 = new JPanel(new GridLayout(0,1)), 
        panel4 =  new JPanel(new GridLayout(0,1));

        String name = "Hidrogenio", family = "Hidrogenio " ,year = "Sla", icon = "H";
        int atomicNumber = 1, protonNum = 1 , atomicMass = 1;
        ElmentTest hidro = new ElmentTest(name, family, atomicNumber, protonNum, atomicMass, year,icon);
        
        
        GridBagConstraints c = new GridBagConstraints();
        GridBagConstraints d = new GridBagConstraints();
        d.anchor = GridBagConstraints.FIRST_LINE_START;
        d.ipadx = 50;
        d.ipady = 50;
        c.gridheight = 5;
        c.gridwidth = 3;
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.insets = new Insets(1,1,1,1);
        c.weightx = 1;
        c.weighty = 0.1;
        c.gridx  = 0;
        c.gridy = 0;
        panel2.add(createLabel(hidro.getIcon(), 100, 100,new Color(0x359EEE)),d);
        atomStuff.add(panel2, c);
        
        c.anchor = GridBagConstraints.PAGE_START;
        c.gridx = 1;
        c.gridy = 0;
        panel3.add(createLabel(hidro.getName(), 100, 30, new Color(0x000800)));
        atomStuff.add(panel3, c);

        
        c.anchor = GridBagConstraints.FIRST_LINE_END;
        c.gridx = 2;
        c.gridy = 0;
        panel1.add(createLabel(""+hidro.getAtomicNumber(),100 ,100,new Color(0x800DBD)),d);
        atomStuff.add(panel1, c);

        c.anchor= GridBagConstraints.PAGE_START;
        c.gridx = 1;
        c.gridy = 1;
        panel3.add(createLabel(hidro.getFamily(), 100, 100,new Color(0x00DEAD)),d);
        atomStuff.add(panel3, c);
        

        c.anchor = GridBagConstraints.LINE_START;
        c.gridx = 0;
        c.gridy = 2;
        panel4.add(createLabel(""+hidro.getAtomicMass(), 100, 30,new Color(0x00FEAD)),d);
        atomStuff.add(panel4, c);
 
        c.gridx = 0;
        c.gridy = 3;
        atomStuff.add(createLabel(hidro.getYear(), 100, 30,new Color(0x00FEED)), c);

        c.anchor = GridBagConstraints.PAGE_END;
        c.gridx = 1;
        c.gridy = 4;
        atomStuff.add(createLabel("Text Placeholder", 100, 30,new Color(0xFAED00)), c);

        
        add(atomStuff);
        }
    public void actionPerformed(ActionEvent e) {

    }
    public JLabel createLabel(String txt, int width, int height, Color color) {
        JLabel label = new JLabel(txt);
        label.setPreferredSize(new Dimension(width, height));
        label.setOpaque(true);
        label.setFont(new Font("Arial", Font.BOLD,18));
        label.setBackground(color);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        return label;
    }
    
}
