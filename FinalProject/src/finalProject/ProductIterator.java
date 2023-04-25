package finalProject;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Alex Reburn
 */
public class ProductIterator implements Iterator<Item>{

    public ProductIterator(List<Item> a) {
        this.array = a;
    }
    
    @Override
    public boolean hasNext() {
        return position < array.size();
    }

    @Override
    public Item next() {
        if(!hasNext()) {
            throw new RuntimeException("No more elements in array");
        }
        return array.get(position++);
    }
    
    
    private int position = 0;
    private List<Item> array;
}
