package finalProject;

/**
 *
 * @author rebur
 */
public class Product implements Item {
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public boolean contains(String text) {
        return name.toLowerCase().contains(text.toLowerCase());
    }
    
    private String name;
    private double price;
}
