import java.util.HashMap;
import java.util.Map;

public class Warenhouse <T extends Product, U extends Supplier>{
    protected Map <T,U> inventory = new HashMap<>();

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
    public void addProduct (T product, U supplier){
        inventory.put(product, supplier);
    }

    public void delProduct (T product){
        inventory.remove(product);
    }
}
