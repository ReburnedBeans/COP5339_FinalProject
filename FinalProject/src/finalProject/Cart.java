package finalProject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rebur
 */
public class Cart {

    /**
     * Constructor of the Cart object.
     */
    public Cart() {
        this.items = new ArrayList<>();
    }

    /**
     * Adds an item to the current Cart object.
     * @param item  the item being added to the ArrayList.
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * Removes an item to the current Cart object.
     * @param item  the item being removed from the ArrayList.
     */
    public void removeItem(Item item) {
        items.remove(item);
    }

    /**
     * Returns a list of Items.
     * @return items    The list of items in the Cart.
     */
    public List<Item> getItems() {
        return items;
    }
    
    private List<Item> items;
}
