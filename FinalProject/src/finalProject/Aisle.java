package finalProject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rebur
 */
class Aisle {
    
    /**
     * Constructor of the Aisle object.
     * @param aisleNumber   The number on the aisle.
     * @param aisleName     The name of the aisle.
     * @param items         The list of items in the aisle.
     */
    public Aisle(int aisleNumber, String aislename) {
        this.aisleNumber = aisleNumber;
        this.aisleName = aislename;
        this.items = new ArrayList<Item>();
    }

    /**
     * Returns the current aisle number.
     * @return aisleNumber      the number of the aisle.
     */
    public int getAisleNumber() {
        return aisleNumber;
    }
    
    
    /**
     * Returns the current aisle name.
     * @return aisleName      the name of the aisle.
     */
    public String getAisleName() {
        return aisleName;
    }

    /**
     * Returns the current aisle name.
     * @return aisleName      the name of the aisle.
     */
    public List<Item> getItems() {
        return items;
    }
    
    public void addProduct(Product product) {
        items.add(product);
    }
    
    public void addDiscountedProduct(DiscountedProduct product) {
        items.add(product);
    }
    
    public void addBundle(ProductBundle product) {
        items.add(product);
    }

    private final int aisleNumber;
    private final String aisleName;
    private final List<Item> items;
}
