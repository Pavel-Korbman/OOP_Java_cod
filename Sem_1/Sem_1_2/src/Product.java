import java.util.HashMap;
import java.util.Map;

public class Product {
//    protected String name;
//    protected double cost;
    protected Map<String, Double> products = new HashMap();

    public Product(String name, double cost) {
        this.products.put(name, cost);

    }



//    public Product(String name) {
//        this.products.put(name, 0.0);
//    }

//    public Product() {
//        this.name = "";
//        this.cost = 0;
//    }
}
