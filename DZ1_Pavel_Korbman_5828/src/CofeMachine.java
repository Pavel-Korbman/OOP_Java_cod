import java.util.ArrayList;

public class  CofeMachine implements VendingMachine {
    ArrayList<Product> array = new ArrayList<>();

    @Override
    public void initProduct(ArrayList list) {
        array = list;
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

    public Product getProduct(String name, int volume) {
        for (int i = 0; i < array.size(); i++) {
            if (name == array.get(i).getName() && volume == array.get(i).getVolume()) {
                return array.get(i);
            }
        }
        return null;
    }

    public Product getProduct(String name, int volume, int temperature) {
        for (int i = 0; i < array.size(); i++) {
            if (name == array.get(i).getName() && volume == array.get(i).getVolume() && temperature == array.get(i).getTemperature()) {
                return array.get(i);
            }
        }
        return null;
    }

}
