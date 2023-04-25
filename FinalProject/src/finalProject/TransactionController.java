/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalProject;

import java.awt.event.ActionEvent;

/**
 *
 * @author rebur
 */
class TransactionController {

    TransactionController(TransactionViewUI view, Store store) {
        //Adds a button listener for the user cancelling the CheckoutViewUI.
        view.addLeaveButtonListener((ActionEvent e) -> {
            //Display DashboardViewUI
            ManagerViewUI dashView = new ManagerViewUI((Manager) store.currentAccount, store);
            dashView.setVisible(true);
            view.setVisible(false); //Hides the TransactionViewUI
        });
    }
    
}