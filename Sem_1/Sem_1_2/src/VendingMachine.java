import java.util.ArrayList;

public interface VendingMachine {

    void initProduct(ArrayList list);
    Product getProduct(String name);


//    ArrayList<Product> array = new ArrayList<>();
//
//    public void initProduct(ArrayList list){
//        array = list;
//    }
//
//    public Product getProduct(String name) {
//        for (int i = 0; i < array.size(); i++) {
//            if (name == array.get(i).getName()) {
//                return array.get(i);
//            }
//        }
//        return null;
//    }

}
