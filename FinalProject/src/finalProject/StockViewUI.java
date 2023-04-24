package finalProject;

import javax.swing.*;

/**
 *
 * @author rebur
 */
public class StockViewUI extends JFrame {
    public StockViewUI() {
        setTitle("Stock Shelves");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        JLabel label = new JLabel("Stocking shelves goes here.");
        add(label);
    }
}

