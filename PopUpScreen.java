import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PopUpScreen extends JFrame implements ActionListener {
    private JButton nextBt , prevBt , infBt, saveBt; 
    private JTextField info;
    private JPanel atomStuff = new JPanel(new java.awt.GridBagLayout()), panel1 = new JPanel(new GridBagLayout()), panel2 = new JPanel(new GridBagLayout());
    public PopUpScreen(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);

        JButton nextBt = new JButton("Next");
        JButton prevBt = new JButton("Previous");
        JButton infBt = new JButton("New info");
        JButton saveBt = new JButton("Save");
        JTextField info = new JTextField();

        String name = "Hidrogenio", family = "Hidrogenio " ,year = "Sla", icon = "H";
        int atomicNumber = 1, protonNum = 1 , atomicMass = 1;
        ElmentTest hidro = new ElmentTest(name, family, atomicNumber, protonNum, atomicMass, year,icon);

        
        GridBagConstraints c = new GridBagConstraints();
        GridBagConstraints d = new GridBagConstraints();
        d.fill = GridBagConstraints.BOTH;
        d.anchor = GridBagConstraints.CENTER;
        
        //c.gridheight = 5;
        //c.gridwidth = 3;
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.insets = new Insets(1,1,1,1);
        c.weightx = 0.5;
        c.weighty = 0.1;
        c.gridx  = 0;
        c.gridy = 0;
        panel2.add(createLabel(hidro.getIcon(), 100, 40,new Color(0x359DBD)),d);
        atomStuff.add(panel2, c);

        
        c.anchor = GridBagConstraints.PAGE_START;
        c.gridx = 1;
        c.gridy = 0;
        panel2.add(createLabel(hidro.getName(), 100, 30, new Color(0x000800)));
        atomStuff.add(panel2, c);

        c.anchor = GridBagConstraints.FIRST_LINE_END;
        c.gridx = 2;
        c.gridy = 0;
        panel1.add(createLabel(""+hidro.getAtomicNumber(),100 ,100,new Color(0x800DBD)));
        atomStuff.add(panel1, c);

        c.anchor= GridBagConstraints.CENTER;
        c.gridx = 1;
        c.gridy = 1;
        atomStuff.add(createLabel(hidro.getFamily(), 100, 30,new Color(0x00DEAD)), c);

        c.anchor = GridBagConstraints.LINE_START;
        c.gridx = 0;
        c.gridy = 2;
        atomStuff.add(createLabel(""+hidro.getAtomicMass(), 100, 30,new Color(0x00FEAD)), c);
 
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
        label.setFont(new Font("Arial", Font.BOLD,16));
        label.setBackground(color);
        return label;
    }
    private JPanel createPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());


        return panel;
    }
    
}