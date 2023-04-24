package finalProject;

import javax.swing.*;

/**
 *
 * @author rebur
 */
public class CheckoutViewUI extends JFrame {
    public CheckoutViewUI() {
        //Setup
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        add(new JLabel("Checkout View"));

        // Set up the window properties
        setTitle("Checkout View");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
