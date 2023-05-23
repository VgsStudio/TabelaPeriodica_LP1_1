import java.awt.*;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.HeadlessException;
import java.awt.Insets;
import javax.swing.*;
import javax.swing.SwingUtilities;

/**
 *
 * @author Rashed
 */
 class GridBagLayoutDemo extends JFrame{


    public JLabel createLabel(String txt, int width, int height, Color color)
    {
        JLabel label = new JLabel(txt);
        label.setOpaque(true);
        label.setBackground(color);
        label.setPreferredSize(new Dimension(width, height));
        return label;
    }

    public GridBagLayoutDemo() throws HeadlessException {
       setSize(400,400);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       JPanel panel = new JPanel(new java.awt.GridBagLayout());
       GridBagConstraints labCnst = new GridBagConstraints();

       labCnst.fill = GridBagConstraints.NONE;
       labCnst.insets = new Insets(3, 3, 3, 3);
       labCnst.anchor = GridBagConstraints.FIRST_LINE_START;
       labCnst.gridx  = 0;
       labCnst.gridy = 0;
       panel.add(createLabel("play", 100, 30, new Color(0x359DBD)), labCnst);

      // labCnst.anchor = GridBagConstraints.LAST_LINE_START;
       labCnst.gridx  = 0;
       labCnst.gridy = 2;
       panel.add(createLabel("Status: Ready!", 100, 30, new Color(0x359DBD)), labCnst);

       labCnst.anchor = GridBagConstraints.FIRST_LINE_END;
       labCnst.gridx  = 2;
       labCnst.gridy = 0;
       panel.add(createLabel("-0x", 100, 30, new Color(0x359DBD)), labCnst);

       labCnst.anchor = GridBagConstraints.LAST_LINE_END;
       labCnst.gridx  = 2;
       labCnst.gridy = 2;
       panel.add(createLabel("score:30", 100, 30, new Color(0x359DBD)), labCnst);


       labCnst.anchor = GridBagConstraints.LINE_START;
       labCnst.fill = GridBagConstraints.VERTICAL;
       labCnst.gridx  = 2;
       labCnst.gridy = 1;
       labCnst.gridwidth = 1;

       labCnst.weightx = 0.7;
       labCnst.weighty = 0.7;
       panel.add(createLabel("ScoreList", 100, 200, new Color(0xFFAA00)), labCnst);


       labCnst.gridx = 0;
       labCnst.gridy = 1;
       //labCnst.anchor = GridBagConstraints.LIN;
       labCnst.gridwidth = 2;

       labCnst.weightx = 0.8;
       labCnst.weighty = 0.8;
       labCnst.fill = GridBagConstraints.BOTH;
       panel.add(createLabel("It is the center", 200, 200, new Color(0xFFD47E)), labCnst);

       //labCnst.anchor = GridBagConstraints.LINE_END;


       add(panel);

    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new GridBagLayoutDemo().setVisible(true);
            }
        });
    }
}