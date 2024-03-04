import java.util.ArrayList;

public class BeerMachine implements VendingMachine {
    ArrayList<Product> array = new ArrayList<>();

    @Override
    public void initProduct(ArrayList listBeer) {
        array = listBeer;
    }

    @Override
    public Product getProduct(String name) {
        for (int i = 0; i < array.size(); i++) {
            if (name == array.get(i).getName()) {
                return array.get(i);
            }
        }
        return null;
    }
}
