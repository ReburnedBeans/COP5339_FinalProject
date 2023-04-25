package finalProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rebur
 */
public class ManagerController {
    private final ManagerViewUI view;
    private final Store store;

    public ManagerController(ManagerViewUI view, Store store) {
        this.view = view;
        this.store = store;
    }

    public void viewTransactionHistory() {
        // Create and show the TransactionViewUI
        TransactionViewUI transactionView = new TransactionViewUI(store);
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

