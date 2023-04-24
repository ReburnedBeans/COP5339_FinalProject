package finalProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rebur
 */
public class ManagerController {
    private ManagerViewUI view;

    public ManagerController(ManagerViewUI view) {
        this.view = view;
    }

    public void viewTransactionHistory() {
        // Create and show the TransactionViewUI
        TransactionViewUI transactionView = new TransactionViewUI();
        transactionView.setVisible(true);

        // Hide the ManagerViewUI
        view.setVisible(false);
    }
    
    public void viewStock() {
        // Create and show the StockViewUI
        StockViewUI stockView = new StockViewUI();
        stockView.setVisible(true);

        // Hide the ManagerViewUI
        view.setVisible(false);
    }

    public void viewFinance() {
        // Create and show the FinanceViewUI
        FinanceViewUI financeView = new FinanceViewUI();
        financeView.setVisible(true);

        // Hide the ManagerViewUI
        view.setVisible(false);
    }    
}

