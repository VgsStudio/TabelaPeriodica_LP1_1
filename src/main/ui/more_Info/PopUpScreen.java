package main.ui.more_Info;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import main.entities.Element;

public class PopUpScreen extends JFrame implements ActionListener {
    private JButton infBt, saveBt; 
    private JTextArea info;
    private JPanel atomStuff , panelNum , panelSybol , panelGinfo, panelInfo, panelTop;
   

    public PopUpScreen(Element element){
        // Window settings
        super(element.getName());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
        this.setResizable(false);
        setLocationRelativeTo(null);

        // Declare variables
        infBt = new JButton("Editar\n Info");
        saveBt = new JButton("Salvar");
        info = new JTextArea();
        atomStuff = new JPanel(new GridBagLayout());
        panelNum = new JPanel(new GridBagLayout()); 
        panelSybol = new JPanel(new GridBagLayout());
        panelGinfo = new JPanel(new GridLayout(0,1));
        panelInfo = new JPanel(new FlowLayout());
        panelTop = new JPanel(new GridBagLayout());

        // General Panel config
        GridBagConstraints c = new GridBagConstraints();
        GridBagConstraints d = new GridBagConstraints();
        GridBagConstraints h = new GridBagConstraints();  
        
        c.fill = GridBagConstraints.NONE;
        c.gridheight = 5;
        c.gridwidth = 3;
        c.weightx = 1;
        c.weighty = 0.1;
        atomStuff.setBorder(BorderFactory.createLineBorder(new Color (248, 242, 242), 15));

        d.gridheight = 5;
        d.gridwidth = 3;
        d.weightx = 1;
        d.weighty = 1;
       // d.insets = new Insets(5, 50, 5, 50);

        h.insets = new Insets(5, 50, 5, 50);
        panelTop.setBackground(new Color(248, 242, 242));
        

        // Elment name  
        // LABEL CHAR LIMIT: 15, DO NOT EXCEED!
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        panelTop.setPreferredSize(new Dimension(500, 100));

        
        h.anchor = GridBagConstraints.FIRST_LINE_START;
        panelTop.add(createLabel(element.getName(), 100, 100,new Color(248, 242, 242) ,40, "Courier New",false),h);
   

        // Symbol config

        panelSybol.setBackground(new Color(248, 242, 242));
        panelSybol.add(createLabel(element.getSymbol(), 10, 100,new Color(248, 242, 242),40,"Courier New",false),d);
        panelTop.add(panelSybol);


        // Atomic number config
       
        panelNum.setBackground(new Color(248, 242, 242));
        panelNum.add(createLabel(""+element.getAtomicNumber(),100 ,100,new Color(248, 242, 242),40,"Times New Roman",false),h);
        panelTop.add(panelNum);
       
        
        
        // Family config
       
        h.gridy = 1; 
        h.fill = GridBagConstraints.HORIZONTAL;
        panelTop.add(createLabel(element.getGroupName(), 300,200,Color.decode(element.getColor()) ,25,"Times New Roman",false),h);
        
    

        c.gridx = 0;
        c.gridy = 0;
        atomStuff.add(panelTop, c);

        // General info config
        c.anchor = GridBagConstraints.LINE_START;
        c.gridx = 0;
        c.gridy = 2;
        panelGinfo.add(createLabelW("Massa atomica: "+element.getAtomicMass() +" u", 225, 30,new Color(248, 242, 242),18,"Times New Roman"),d);
     
 
        c.gridx = 0;
        c.gridy = 3;
        panelGinfo.add(createLabelW("Ano de descoberta: "+ element.getYear(), 225, 30,new Color(248, 242, 242),18,"Times New Roman"), d);
        atomStuff.add(panelGinfo, c);

        c.gridx = 0;
        c.gridy = 4;
        panelGinfo.add(createLabelW("Numero de Neutrons: "+ element.getNeutronNumber(), 225, 30,new Color(248, 242, 242),18,"Times New Roman"), d);
        atomStuff.add(panelGinfo, c);
        
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
        
        
        c.anchor = GridBagConstraints.EAST;
        c.gridx = 0;
        c.gridwidth = 1;
        
        
        info.setPreferredSize(new Dimension(200, 200));
        info.setFont(new Font("Arial",0,15));
        info.setBackground(Color.white);
        info.setEditable(false);
        info.setLineWrap(true); 
        info.setWrapStyleWord(true); 
        info.setDocument(new PlainDocument(){
            final int MAX_LENGTH = 150;
          public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (str == null || info.getText().length() >= MAX_LENGTH) {
                    return;
                }
                super.insertString(offs, str, a);
        }});
        if(info.getText().equals("")) {
            info.setText("Para adicionar infomações do elemento clique em 'Editar Info' e apague esse texto");
        }
        panelInfo.add(info);
  
        atomStuff.add(panelInfo,c);
      
        
        panelInfo.setBackground(new Color(248, 242, 242));
        atomStuff.setBackground(new Color(248, 242, 242));


        add(atomStuff);
        }
    
    // Label creator
    public JLabel createLabel(String txt, int width, int height, Color color, int size, String font, boolean border) {
        JLabel label = new JLabel(txt);
        label.setPreferredSize(new Dimension(width, height));
        label.setOpaque(true);
        label.setFont(new Font(font, Font.BOLD,size));
        label.setBackground(color);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        if(border){
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        }else{
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
        }
        
        return label;
    }
    public JLabel createLabelW(String txt, int width, int height, Color color, int size, String font) {
        JLabel label = new JLabel(txt);
        label.setPreferredSize(new Dimension(width, height));
        label.setOpaque(true);
        label.setFont(new Font(font, Font.BOLD,size));
        label.setBackground(color);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setBorder(BorderFactory.createLineBorder(new Color(248, 242, 242), 2));

        return label;
    }
    
    public void actionPerformed(ActionEvent e){
        
    
        
    }
    
}
