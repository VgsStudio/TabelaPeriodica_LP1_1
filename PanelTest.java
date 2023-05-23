import javax.swing.*;
import java.awt.*;

public class PanelTest extends JFrame{
    private JPanel painel3;
    private JPanel painel5;
    private Container container;

    public PanelTest() {

        container = getContentPane();
        container.setLayout(null);

        painel5 = new JPanel();
        painel5.setBackground(Color.red);
        //painel5.setBounds(120, 110, 100, 120);
        painel3 = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.FIRST_LINE_END;
        painel3.setBackground(Color.white);
        painel3.add(painel5,c);
        painel3.setBounds(50, 50, 290, 220);

        container.add(painel3);

        // frame
        setSize(1000, 900);
        setLocation(200, 50);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new PanelTest().setVisible(true);
            }
        });
    }
    
}

