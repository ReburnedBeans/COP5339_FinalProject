package finalProject;

import javax.swing.*;

/**
 *
 * @author rebur
 */
public class FinanceViewUI extends JFrame {
    public FinanceViewUI() {
        setTitle("Finances");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        JLabel label = new JLabel("Viewing finances goes here.");
        add(label);
    }
}

