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
        leaveToLoginButton = new JButton("Logout");

        //Create a new DashboardController instance to handle button clicks
        dashboardController = new DashboardController(this, store);

        // Set up the UI layout
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 1));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(
                10, 10, 10, 10));
        buttonPanel.add(browseByAisleButton);
        buttonPanel.add(searchForItemButton);
        buttonPanel.add(proceedToCheckoutButton);
        buttonPanel.add(leaveToLoginButton);

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
        
        leaveToLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call the proceedToCheckout method of the DashboardController to handle the button click
                dashboardController.logout();
            }
        });
        
        add(buttonPanel, BorderLayout.CENTER);

        // Set up the window properties
        setTitle("Dashboard");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private final JButton browseByAisleButton;
    private final JButton searchForItemButton;
    private final JButton proceedToCheckoutButton;
    private final JButton leaveToLoginButton;
    private DashboardController dashboardController;
}


