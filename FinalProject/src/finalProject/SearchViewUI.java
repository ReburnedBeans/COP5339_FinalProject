package finalProject;

import javax.swing.*;

/**
 *
 * @author rebur
 */
public class SearchViewUI extends JFrame {
    public SearchViewUI() {
        // Set up the UI layout
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        add(new JLabel("Search View"));

        // Set up the window properties
        setTitle("Search View");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

