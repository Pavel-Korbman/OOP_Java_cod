import java.util.ArrayList;
import java.util.List;

/** Задача 1 -Абстракция
 * 📌 Реализуйте класс Товар, содержащий данные о товаре,
 * и ТорговыйАвтомат, содержащий в себе методы
 * initProducts (List <Product>) сохраняющий в себе список исходных продуктов и
 * getProduct(String name)
 * Задача 2 -Инкапсуляция
 * 📌 Реализуйте конструкторы, get/set методы,
 * постройте логику ТорговогоАвтомата на основе кода сделанного в предыдущем задании.*/

public class Product {

    private String name;
    private Double cost;

    public String getName() {
        return name;
    }

    public Double getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}