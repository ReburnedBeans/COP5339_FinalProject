package finalProject;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Alex Reburn
 */
public class SearchViewUI extends JFrame {
    /**
     * Constructor creates a ViewUI for the Search.
     * @param store     the Model of the MVC.
     */
    public SearchViewUI(Store store) {
        // Set up the UI layout
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        add(new JLabel("Search View"));
        
        //Setup: a Panel object that will contain each of the objects in frame.
        searchPanel = new JPanel(new GridLayout(4, 1));
        searchPanel.setBorder(BorderFactory.createEmptyBorder(
                10, 10, 10, 10));
        
        //Setup: Creating the J-Objects within the Panel.
        cancelButton = new JButton("Cancel");
        searchLabel = new JLabel("Search for Item:");
        searchField = new JTextField();
        searchButton = new JButton("Search");
        
        //Create a new AisleController instance to handle button clicks.
        SearchController searchController = new SearchController(this, store);

        //Adds the J-Objects into the Panel.
        searchPanel.add(searchLabel);
        searchPanel.add(searchField);
        searchPanel.add(searchButton);
        searchPanel.add(cancelButton);
        addToCartButton = new JButton("Add to Cart");
        itemComboBox = new JComboBox();
        
        //Creates the Container.
        containerPanel = getContentPane();
        containerPanel.add(searchPanel, BorderLayout.NORTH);

        // Set up the window properties
        setTitle("Search View");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    /**
     * Adds an action listener to the cancelButton.
     * @param listener  the event listener. 
     */
    public void addCancelButtonListener(ActionListener listener) {
        cancelButton.addActionListener(listener);
    }
    
    /**
     * Adds an action listener to the searchButton.
     * @param listener  the event listener. 
     */
    public void addSearchButtonListener(ActionListener listener) {
        searchButton.addActionListener(listener);
    }
    
    /**
     *
     * @param matchingProduct
     */
    public void displayMatchingProducts(ArrayList<Item> matchingProduct) {
        containerPanel.removeAll(); //clears the previous view.
        
        //Setup: a new Panel for selecting the items.
        searchPanel = new JPanel(new GridLayout(6, 1));
        searchPanel.setBorder(BorderFactory.createEmptyBorder(
                10, 10, 10, 10));

        //Creates an Label for selecting an item.
        JLabel itemLabel = new JLabel("Select an item:");
        
        //Removes the items from a combo box only if it already has content.
        if (itemComboBox != null){
            itemComboBox.removeAllItems();
        }
        
        //Adds every product from the Aisle to the JComboBox.
        for (Item product : matchingProduct) {
            itemComboBox.addItem(product);
        }

        //Creates a Label and TextBox for quantity.
        JLabel quantityLabel = new JLabel("Enter the quantity:");
        quantityField = new JTextField();

        //Adds the J-Objects to the Panel.
        searchPanel.add(itemLabel);
        searchPanel.add(itemComboBox);
        searchPanel.add(quantityLabel);
        searchPanel.add(quantityField);
        searchPanel.add(addToCartButton);

        //Resets the container with the new Panel.
        containerPanel.add(searchPanel, BorderLayout.NORTH);
        
        containerPanel.revalidate();
        containerPanel.repaint();       //Repaints the container.
    }
    
    private Container containerPanel;
    private JPanel searchPanel;
    private final JLabel searchLabel;
    private final JButton cancelButton;
    private final JButton searchButton;
    private final JButton addToCartButton;
    public JTextField searchField;
    private JTextField quantityField;
    private JComboBox<Item> itemComboBox;

    
}

