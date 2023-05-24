package main.ui.more_Info;
import main.element.Element;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PopUpScreen extends JFrame implements ActionListener {
    private JButton infBt, saveBt; 
    private JTextArea info;
    private JPanel atomStuff , panel1 , panel2 , panel3 , panel4, panel5;
   

    public PopUpScreen(Element element){
        // Window settings
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
        this.setResizable(false);
        setLocationRelativeTo(null);

        // Declare variables
        JButton infBt = new JButton("Editar\n Info");
        JButton saveBt = new JButton("Salvar");
        JTextArea info = new JTextArea();
        JPanel atomStuff = new JPanel(new GridBagLayout()),
        panel1 = new JPanel(new GridBagLayout()), 
        panel2 = new JPanel(new GridBagLayout()), 
        panel3 = new JPanel(new GridLayout(0,1)), 
        panel4 =  new JPanel(new GridLayout(0,1)),
        panel5 = new JPanel(new FlowLayout());

        // General Panel config
        GridBagConstraints c = new GridBagConstraints();
        GridBagConstraints d = new GridBagConstraints();
        d.anchor = GridBagConstraints.FIRST_LINE_START;
        d.ipadx = 50;
        d.ipady = 50;
        c.fill = GridBagConstraints.NONE;
        c.gridheight = 5;
        c.gridwidth = 3;
        c.insets = new Insets(1,1,1,1);
        c.weightx = 1;
        c.weighty = 0.1;

        // Symbol config
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.gridx  = 0;
        c.gridy = 0;
        panel2.add(createLabel(element.getSymbol(), 100, 100,Color.decode(element.getColor()),30),d);
        atomStuff.add(panel2, c);
        
        // Atomic number config
        c.anchor = GridBagConstraints.FIRST_LINE_END;
        c.gridx = 2;
        c.gridy = 0;
        panel1.add(createLabel(""+element.getAtomicNumber(),100 ,100,Color.decode(element.getColor()),30),d);
        atomStuff.add(panel1, c);

        // Elment name and family config
        // LABEL CHAR LIMIT: 15, DO NOT EXCEED!
        c.anchor = GridBagConstraints.PAGE_START;
        c.gridx = 1;
        c.gridy = 0;
        panel3.add(createLabel(element.getName(), 185, 75,Color.decode(element.getColor()) ,18),d);
        atomStuff.add(panel3, c);

        c.anchor= GridBagConstraints.PAGE_START;
        c.gridx = 1;
        c.gridy = 1;
        panel3.add(createLabel(element.getFamily(), 185,75,Color.decode(element.getColor()) ,18),d);
        atomStuff.add(panel3, c);
        
        // General info config
        c.anchor = GridBagConstraints.LINE_START;
        c.gridx = 0;
        c.gridy = 2;
        panel4.add(createLabelW("Massa atomica: "+element.getAtomicMass(), 225, 30,Color.decode(element.getColor()),18),d);
     
 
        c.gridx = 0;
        c.gridy = 3;
        panel4.add(createLabelW("Ano de descoberta: "+ element.getYear(), 225, 30,Color.decode(element.getColor()),18), d);
        atomStuff.add(panel4, c);
        
        // Buttons config
        c.anchor = GridBagConstraints.LAST_LINE_START;
        
        atomStuff.add(infBt,c);
        infBt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a){
                info.setEditable(true);
                saveBt.setVisible(true);
                
            }
        });


        c.anchor = GridBagConstraints.LAST_LINE_END;
        
        atomStuff.add(saveBt,c);
        saveBt.setVisible(false);
        saveBt.addActionListener(this);
        saveBt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
               info.setEditable(false);
               saveBt.setVisible(false);               
            }
        });
        saveBt.addActionListener(this);

        

        // New info user update config
        c.anchor = GridBagConstraints.PAGE_END;
        c.fill = GridBagConstraints.HORIZONTAL;
        
        
        panel5.setPreferredSize(new Dimension(300, 175));
        
        info.setPreferredSize(new Dimension(300, 145));
        info.setFont(new Font("Arial",0,15));
        info.setBackground(Color.white);
        info.setEditable(false);
        info.setLineWrap(true); 
        info.setWrapStyleWord(true); 
        panel5.add(info);
        atomStuff.add(panel5,c);
      
        
        panel5.setBackground(Color.decode(element.getColor()));
        atomStuff.setBackground(Color.decode(element.getColor()));

        add(atomStuff);
        }
    
    // Label creator
    public JLabel createLabel(String txt, int width, int height, Color color, int size) {
        JLabel label = new JLabel(txt);
        label.setPreferredSize(new Dimension(width, height));
        label.setOpaque(true);
        label.setFont(new Font("Arial", Font.BOLD,size));
        label.setBackground(color);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        return label;
    }
    public JLabel createLabelW(String txt, int width, int height, Color color, int size) {
        JLabel label = new JLabel(txt);
        label.setPreferredSize(new Dimension(width, height));
        label.setOpaque(true);
        label.setFont(new Font("Arial", Font.BOLD,size));
        label.setBackground(color);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.LEFT);
        
        return label;
    }
    
    public void actionPerformed(ActionEvent e){
      
    }
    
}
