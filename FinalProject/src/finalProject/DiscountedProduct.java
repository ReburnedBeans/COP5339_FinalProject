package finalProject;

/**
 *
 * @author Alex Reburn
 */
public class DiscountedProduct implements Item {
    /**
     * Constructor of the Discounted Product.
     * @param product   the product being discounted.
     * @param discount  the discount factor of the product price.
     */
    public DiscountedProduct(Item product, double discount) {
        this.product = product;
        this.discount = discount;
    }
    
    /**
     * Retrieves the String of the Discounted Product.
     * @return the Discounted Product String.
     */
    @Override
    public String getName() {
        return "Discounted " + product.getName() + "(" + this.discount + " off)";
    }
    
    /**
     * Retrieves the discounted price.
     * @return the price of the discounted price.
     */
    @Override
    public double getPrice() {
        return product.getPrice() * (1 - discount);
    }
    
    private final Item product;
    private final double discount;
}
