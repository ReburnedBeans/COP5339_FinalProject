package finalProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alex Reburn
 */
public class SearchController {
    /**
     * Constructor that creates the Controller function.
     * @param view      the current DashboardViewUI.
     * @param store     the store model.
     */
    public SearchController(SearchViewUI view, Store store) {
        this.view = view;
        this.store = store;
        
        //Adds a button listener for the user cancelling the SearchViewUI.
        view.addCancelButtonListener((ActionEvent e) -> {
            DashboardViewUI dashView = new DashboardViewUI(store);
            dashView.setVisible(true); //Display DashboardViewUI
            view.setVisible(false); //Hides the SearchViewUI
        });
        
        //Adds a button listener for the user searching for an Item.
        view.addSearchButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Creates ArrayList for items matching Product.
                ArrayList<Item> matchingProduct = new ArrayList<>();
                
                Iterator<Item> iterator = new ProductIterator(store.getItems());
                
                while (iterator.hasNext()) {
                    Item item = iterator.next();
                    if (item.contains(view.searchField.getText())) {
                        matchingProduct.add(item);
                    }
                }
                
                view.displayMatchingProducts(matchingProduct);
            }
        });
    }
    
    private final SearchViewUI view;
    private final Store store;
}
