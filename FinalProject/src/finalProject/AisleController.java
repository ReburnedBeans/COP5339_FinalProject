package finalProject;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author rebur
 */
public class AisleController {

    public AisleController(AisleViewUI view, Store store) {
        this.view = view;
        this.store = store;
        
        view.addAisleButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Retrieves aisle information.
                view.selectAisle(view.getAisleNumber());
            }
        });
        
        view.addItemButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                view.addToCart();

                //Display DashboardViewUI
                DashboardViewUI dashView = new DashboardViewUI(store);
                dashView.setVisible(true);

                    //Hide AisleViewUI
                    view.setVisible(false);

                
            }
        });
        
        view.addCancelButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Display DashboardViewUI
                DashboardViewUI dashView = new DashboardViewUI(store);
                dashView.setVisible(true);

                //Hide AisleViewUI
                view.setVisible(false);
            }
        });
    }
    
    private AisleViewUI view;
    private Store store;
}
