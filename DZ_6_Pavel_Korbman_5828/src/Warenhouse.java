import java.util.HashMap;
import java.util.Map;

public class Warenhouse<T extends Product, U extends Supplier> implements Add, Del {
    protected Map<T, U> inventory = new HashMap<>();

    public Warenhouse() {

    }

    public Map<T, U> getInventory() {
        return inventory;
    }

    public void setInventory(Map<T, U> inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Склад{" +
                "Товар:" + inventory +
                '}';
    }

    public void del(Object product) {
        inventory.remove((T) product);
    }


    @Override
    public void add(Object product, Object supplier) {
        inventory.put((T) product, (U) supplier);
    }
}
