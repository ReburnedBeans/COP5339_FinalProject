package finalProject;

/**
 *
 * @author rebur
 */
interface Item {
    public double getPrice();
    
    public String getName();

    public boolean contains(String text);
    
    @Override
    public String toString();
}
