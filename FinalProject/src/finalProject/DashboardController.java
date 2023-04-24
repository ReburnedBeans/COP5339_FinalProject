package finalProject;

import java.util.List;

/**
 *
 * @author rebur
 */
public class DashboardController {

    private DashboardViewUI view;
    private Store store;

    public DashboardController(DashboardViewUI view, Store store) {
        this.view = view;
        this.store = store;
    }

    public void browseByAisle() {
        //Display AisleViewUI
        AisleViewUI aisleView = new AisleViewUI(store);
        aisleView.setVisible(true);

        //Hide DashboardViewUI
        view.setVisible(false);
    }
    
    public void searchForItem() {
        // Create and show the SearchViewUI
            SearchViewUI searchView = new SearchViewUI();
            searchView.setVisible(true);

            // Hide the DashboardViewUI
            view.setVisible(false);
    }
    
    public void proceedToCheckout() {
        // Create and show the CheckoutViewUI
            CheckoutViewUI checkoutView = new CheckoutViewUI();
            checkoutView.setVisible(true);

            // Hide the DashboardViewUI
            view.setVisible(false);
    }
}

