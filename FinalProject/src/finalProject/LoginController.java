package finalProject;

import javax.swing.JOptionPane;

/**
 *
 * @author rebur
 */
public class LoginController {

    public LoginController(AccountDatabase accountDatabase, LoginViewUI view, Store store) {
        this.accountDatabase = accountDatabase;
        this.view = view;
        this.store = store;
    }

    public void login(String username, String password) {
        // Attempt to find an account with the given username and password
        Account account = accountDatabase.getAccount(username, password);

        if (account == null) {
            // If no account is found, show an error message
            JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
        } else {
            // If an account is found, check if it's a manager account
            if (account instanceof Manager) {
                // If it's a manager account, show the manager view
                ManagerViewUI managerViewUI = new ManagerViewUI((Manager) account);
                managerViewUI.setVisible(true);
            } else {
                // If it's a regular user account, show the user dashboard view
                DashboardViewUI dashboardViewUI = new DashboardViewUI(store);
                dashboardViewUI.setVisible(true);
                
                view.setVisible(false);
            }
        }
    }
    
    private AccountDatabase accountDatabase;
    private LoginViewUI view;
    private Store store;
}

