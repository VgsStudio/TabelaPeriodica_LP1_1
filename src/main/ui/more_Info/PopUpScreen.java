package main.ui.more_Info;

import javax.swing.*;

import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;

import main.back.modules.update_info.UpdateInfoPresenter;
import main.entities.Element;

public class PopUpScreen extends JPanel {
    private JButton infBt, saveBt; 
    private JTextArea info;
    private JPanel  panelNum , panelSybol , panelGinfo, panelInfo, panelTop;

    UpdateInfoPresenter updateInfoPresenter;
   

    public PopUpScreen(Element element, UpdateInfoPresenter updateInfoPresenter){
        this.updateInfoPresenter = updateInfoPresenter;
        // Window settings
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createLineBorder(new Color (248, 242, 242), 15));
        setBackground(new Color(248, 242, 242));
        // Declare variables
        infBt = new JButton("Editar\n Info");
        saveBt = new JButton("Salvar");
        info = new JTextArea(500,500);
        panelNum = new JPanel(new GridBagLayout()); 
        panelSybol = new JPanel(new GridBagLayout());
        panelGinfo = new JPanel(new GridLayout(0,1));
        panelInfo = new JPanel(new BorderLayout());
        panelTop = new JPanel(new GridBagLayout());

        // General Panel config
        GridBagConstraints c = new GridBagConstraints();
        GridBagConstraints d = new GridBagConstraints();
        GridBagConstraints h = new GridBagConstraints();  
        
        c.anchor = GridBagConstraints.LAST_LINE_END;
        c.gridheight = 5;
        c.gridwidth = 3;
        c.weightx = 1;
        c.weighty = 1;

        add(panelInfo,c);
        
        c.fill = GridBagConstraints.NONE;
        d.gridheight = 5;
        d.gridwidth = 3;
        d.weightx = 1;
        d.weighty = 1;
       
        h.insets = new Insets(5, 5, 5, 30);
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
        panelNum.add(createLabel("  "+element.getAtomicNumber(),100 ,100,new Color(248, 242, 242),40,"Times New Roman",false),h);
        panelTop.add(panelNum);
       
        
        
        // Family config
       
        h.gridy = 1; 
        h.fill = GridBagConstraints.HORIZONTAL;
        panelTop.add(createLabel(element.getGroupName(), 300,200,Color.decode(element.getColor()) ,25,"Times New Roman",false),h);
        
    
        
        c.gridx = 0;
        c.gridy = 0;
        add(panelTop, c);

        // General info config
       
        c.gridx = 0;
        c.gridy = 4;
       
        panelGinfo.add(createLabelW("Massa atomica: "+element.getAtomicMass() +" u", 225, 30,new Color(248, 242, 242),18,"Times New Roman"),d);
     
 
       
        panelGinfo.add(createLabelW("Ano de descoberta: "+ element.getYear(), 200, 30,new Color(248, 242, 242),18,"Times New Roman"), d);
      

       
        panelGinfo.add(createLabelW("Numero de Neutrons: "+ element.getNeutronNumber(), 200, 30,new Color(248, 242, 242),18,"Times New Roman"), d);
        panelTop.add(panelGinfo,c);
        
        // Buttons config
        c.anchor = GridBagConstraints.LAST_LINE_START;
        
        add(infBt,c);
        infBt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a){
                info.setEditable(true);
                info.requestFocusInWindow();
                saveBt.setVisible(true);
                infBt.setVisible(false);
                info.setText(element.getInfo());
              
            }
        });


        c.anchor = GridBagConstraints.LAST_LINE_START;
        
        add(saveBt,c);
        saveBt.setVisible(false);
        saveBt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
               info.setEditable(false);
               saveBt.setVisible(false);         
               infBt.setVisible(true);

               updateInfoPresenter.call(element.getAtomicNumber(), info.getText());
               element.setInfo(info.getText());
            }
        });

        

        // New info user update config
        
        info = new JTextArea();
        panelInfo.setMinimumSize(new Dimension(150,150));
        info.setFont(new Font("Arial",0,15));
        info.setBackground(Color.white);
        info.setEditable(false);
        info.setLineWrap(true); 
        info.setWrapStyleWord(true); 
        info.setBorder(BorderFactory.createLineBorder(new Color(248, 242, 242), 2)); 
        info.setDocument(new PlainDocument(){
            final int MAX_LENGTH = 200;
          public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (str == null || info.getText().length() >= MAX_LENGTH) {
                    return;
                }
                super.insertString(offs, str, a);
        }});

        String text = element.getInfo();

        if (text == null){
            text = "";
        }

        if(text.isEmpty()){
            info.setText("Para adicionar infomações do elemento clique em 'Editar Info'");
        }
        else{
            info.setText(element.getInfo());
        }
        
        JScrollPane scroll = new JScrollPane();
        scroll.setViewportView(info);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        panelInfo.add(scroll,BorderLayout.CENTER);

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Dimension newSize = getSize();
                setPreferredSize(newSize);
                revalidate();
            }
        });
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
}
