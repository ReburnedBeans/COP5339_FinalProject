package finalProject;

import javax.swing.*;

/**
 *
 * @author rebur
 */
public class TransactionViewUI extends JFrame {
    public TransactionViewUI() {
        setTitle("Transaction History");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        JLabel label = new JLabel("Transaction history goes here.");
        add(label);
    }
}

