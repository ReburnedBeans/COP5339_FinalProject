package finalProject;

/**
 *
 * @author rebur
 */
public class DiscountedProduct implements Item {
    
    public DiscountedProduct(Item product, double discount) {
        this.product = product;
        this.discount = discount;
    }
    
    public String getName() {
        return "Discounted" + product.getName() + "(" + this.discount + " off)";
    }
    
    public double getPrice() {
        return product.getPrice() * (1 - discount);
    }
    
    private Item product;
    private double discount;
}
