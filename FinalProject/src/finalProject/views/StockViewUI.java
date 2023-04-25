package finalProject.views;

import javax.swing.*;

/**
 *
 * @author rebur
 */
public class StockViewUI extends JFrame {
    public StockViewUI() {

        JLabel label = new JLabel("Stocking shelves goes here.");
        add(label);
        
        //Designs the layout for the ViewUI.
        pack();
        setTitle("Stock Shelves");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

