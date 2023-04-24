package finalProject;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author rebur
 */
public class AisleViewUI extends JFrame {
    
    public AisleViewUI(Store store) {
        super("Aisle View");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aislePanel = new JPanel(new GridLayout(3, 1));
        aislePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        aisleLabel = new JLabel("Select an aisle number:");
        aisleNumberField = new JTextField();
        aisleButton = new JButton("Select Aisle");
        

        aislePanel.add(aisleLabel);
        aislePanel.add(aisleNumberField);
        aislePanel.add(aisleButton);
        
        Container contentPane = getContentPane();
        contentPane.add(aislePanel, BorderLayout.NORTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    //NEEDS WORK!
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == aisleButton) {
            aislePanel.removeAll();
            aislePanel.remove(aisleButton);

            aislePanel = new JPanel(new GridLayout(2, 2));
            aislePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            JLabel itemLabel = new JLabel("Select an item:");
            JComboBox<Object> itemComboBox = new JComboBox<>();

            JLabel quantityLabel = new JLabel("Enter the quantity:");
            quantityField = new JTextField();

            addToCartButton = new JButton("Add to Cart");

            aislePanel.add(itemLabel);
            aislePanel.add(itemComboBox);
            aislePanel.add(quantityLabel);
            aislePanel.add(quantityField);
            aislePanel.add(addToCartButton);

            aislePanel.revalidate();
            aislePanel.repaint();
        }
    }
    
    private JPanel aislePanel;
    private JLabel aisleLabel;
    private JComboBox<Item> itemComboBox;
    private JTextField aisleNumberField;
    private JButton aisleButton;
    private JTextField quantityField;
    private JButton addToCartButton;
    private AisleController aisleController;
}

