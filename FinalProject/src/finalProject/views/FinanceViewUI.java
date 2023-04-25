package finalProject.views;

import javax.swing.*;

/**
 *
 * @author rebur
 */
public class FinanceViewUI extends JFrame {
    public FinanceViewUI() {

        JLabel label = new JLabel("Viewing finances goes here.");
        add(label);
        
        //Designs the layout for the ViewUI.
        pack();
        setTitle("Finances View");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

