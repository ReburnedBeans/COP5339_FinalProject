package finalProject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rebur
 */
public class ProductBundle implements Item {
    private ArrayList<Item> products;
    
    public ProductBundle() {
        products = new ArrayList<>();
    }
    
    public void addProduct(Item product) {
        products.add(product);
    }
    
    public void removeProduct(Item product) {
        products.remove(product);
    }
    
    public String getName() {
        String bundleName = "Bundle (";
        for (int i = 0; i < products.size(); i++) {
            bundleName += products.get(i).getName();
            if (i < products.size() - 1) {
                bundleName += ", ";
            }
        }
        bundleName += ")";
        return bundleName;
    }
    
    public double getPrice() {
        double total = 0;
        for (Item product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
