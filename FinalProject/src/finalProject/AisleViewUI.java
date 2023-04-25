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
        
        this.store = store;
        
        aislePanel = new JPanel(new GridLayout(3, 1));
        aislePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        cancelButton = new JButton("Cancel");
        aisleLabel = new JLabel("Select an aisle number:");
        aisleNumberField = new JTextField();
        aisleButton = new JButton("Select Aisle");
        addToCartButton = new JButton("Add to Cart");
        itemComboBox = new JComboBox();
        
        //Create a new DashboardController instance to handle button clicks
        aisleController = new AisleController(this, store);

        aislePanel.add(aisleLabel);
        aislePanel.add(aisleNumberField);
        aislePanel.add(aisleButton);
        
        containerPanel = getContentPane();
        containerPanel.add(cancelButton);
        containerPanel.add(aislePanel, BorderLayout.NORTH);

        pack();
        // Set up the window properties
        setTitle("Aisle View");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void addAisleButtonListener(ActionListener listener) {
        aisleButton.addActionListener(listener);
    }
    
    public void addItemButtonListener(ActionListener listener) {
        addToCartButton.addActionListener(listener);
    }
    
    public void addCancelButtonListener(ActionListener listener) {
        cancelButton.addActionListener(listener);
    }
    
    public void selectAisle(int aisleNumber) {
        containerPanel.removeAll();
        
        itemPanel = new JPanel(new GridLayout(2, 2));
        itemPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel itemLabel = new JLabel("Select an item:");
        Aisle currentAisle = store.getAisle(aisleNumber);
        
        if (itemComboBox != null){
            itemComboBox.removeAllItems();
        }
        
        for (Item product : currentAisle.getItems()) {
            System.out.println(product.getName() + " was added"); //debug
            itemComboBox.addItem(product);
        }

        JLabel quantityLabel = new JLabel("Enter the quantity:");
        quantityField = new JTextField();

        itemPanel.add(itemLabel);
        itemPanel.add(itemComboBox);
        itemPanel.add(quantityLabel);
        itemPanel.add(quantityField);

        containerPanel.add(addToCartButton);
        containerPanel.add(itemPanel, BorderLayout.NORTH);
        
        containerPanel.revalidate();
        containerPanel.repaint();
    }
    
    public void addToCart() {
        Item selectedItem = (Item) itemComboBox.getSelectedItem();
        int quantity = Integer.parseInt(quantityField.getText());
        
        for (int i=0; i<quantity; i++) {
            store.currentAccount.addToCart(selectedItem);
        }
    }
    
    //Get the aisle number entered by the user
    public int getAisleNumber() {
        return Integer.parseInt(aisleNumberField.getText());
    }
    
    private final Store store;
    private Container containerPanel;
    private JPanel aislePanel;
    private JPanel itemPanel;
    private JLabel aisleLabel;
    private JComboBox<Item> itemComboBox;
    private JTextField aisleNumberField;
    private JButton aisleButton;
    private JButton cancelButton;
    private JTextField quantityField;
    private JButton addToCartButton;
    private AisleController aisleController;
}