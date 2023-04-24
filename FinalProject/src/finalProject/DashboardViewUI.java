package finalProject;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rebur
 */
public class DashboardViewUI extends JFrame {

    public DashboardViewUI(Store store) {
        // Initialize the UI components
        browseByAisleButton = new JButton("Browse by Aisle");
        searchForItemButton = new JButton("Search for Item");
        proceedToCheckoutButton = new JButton("Proceed to Checkout");

        //Create a new DashboardController instance to handle button clicks
        dashboardController = new DashboardController(this, store);

        // Set up the UI layout
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1));
        buttonPanel.add(browseByAisleButton);
        buttonPanel.add(searchForItemButton);
        buttonPanel.add(proceedToCheckoutButton);

        // Set up the button action listeners
        browseByAisleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call the browseByAisle method of the DashboardController to handle the button click
                dashboardController.browseByAisle();
            }
        });

        searchForItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call the searchForItem method of the DashboardController to handle the button click
                dashboardController.searchForItem();
            }
        });

        proceedToCheckoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call the proceedToCheckout method of the DashboardController to handle the button click
                dashboardController.proceedToCheckout();
            }
        });
        
        add(buttonPanel, BorderLayout.CENTER);

        // Set up the window properties
        setTitle("Dashboard");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private JButton browseByAisleButton;
    private JButton searchForItemButton;
    private JButton proceedToCheckoutButton;
    private DashboardController dashboardController;
}


