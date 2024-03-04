import java.util.ArrayList;

public class VendingMachine {
    ArrayList<Product> array = new ArrayList<>();

    public void initProduct(ArrayList list){
        array = list;
    }

    public Product getProduct(String name) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).name.equals(name)) {
                return array.get(i);
            }
        }
        return null;
    }

}
