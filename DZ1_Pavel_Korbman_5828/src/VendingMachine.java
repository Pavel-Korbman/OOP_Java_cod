import java.util.ArrayList;

public interface VendingMachine {
    void initProduct(ArrayList list);
    Product getProduct(String name);
}
