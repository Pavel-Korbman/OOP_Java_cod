import java.util.ArrayList;
import java.util.List;

/** Задача 1 -Абстракция
 * 📌 Реализуйте класс Товар, содержащий данные о товаре,
 * и ТорговыйАвтомат, содержащий в себе методы
 * initProducts (List <Product>) сохраняющий в себе список исходных продуктов и
 * getProduct(String name)*/

public class Product {
    public static void main(String[] args){
        Product product_1 = new Product();
        product_1.name = "Кофе 200 мл";
        product_1.cost = 150.0;

        Product product_2 = new Product();
        product_2.name = "Кофе 300 мл";
        product_2.cost = 200.0;

        Product product_3 = new Product();
        product_3.name = "Кофе 400 мл";
        product_3.cost = 300.0;

        VendingMachine vendingMachine = new VendingMachine();

        ArrayList<Product> arrayList = new ArrayList<>(List.of(product_1, product_2, product_3));

        vendingMachine.initProduct(arrayList);

        System.out.println(vendingMachine.getProduct("Кофе 400 мл"));


    }
    String name;
    Double cost;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}