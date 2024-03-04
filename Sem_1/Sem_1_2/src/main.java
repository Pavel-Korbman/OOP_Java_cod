import java.util.ArrayList;
import java.util.List;

public class main {

    /** Задача 1 -Абстракция
     * 📌 Реализуйте класс Товар, содержащий данные о товаре,
     * и ТорговыйАвтомат, содержащий в себе методы
     * initProducts (List <Product>) сохраняющий в себе список исходных продуктов и
     * getProduct(String name)
     ** Задача 2 -Инкапсуляция
     * 📌 Реализуйте конструкторы, get/set методы,
     * постройте логику ТорговогоАвтомата на основе кода сделанного в предыдущем задании.
     ** Задача 3 -Наследование
     * 📌 Сделайте класс Товар абстрактным,
     * создайте нескольких наследников (к примеру: БутылкаВоды),
     * сделайте интерфейсом ТорговыйАвтомат и реализуйте класс какого-то одного типа ТорговогоАвтомата
     * (пример: ПродающийБутылкиВодыАвтомат)*/

    public static void main(String[] args){
        Product product_1 = new Product();
        product_1.setName("Кофе 200 мл");
        product_1.setCost(150.0);

        Product product_2 = new Product();
        product_2.setName("Кофе 300 мл");
        product_2.setCost(200.0);

        Product product_3 = new Product();
        product_1.setName("Кофе 400 мл");
        product_1.setCost(250.0);

        Product product_4 = new Product();
        product_4.setName("Пиво Guinness 330 мл");
        product_4.setCost(200.0);

        Product product_5 = new Product();
        product_5.setName("Пиво Guinness 500 мл");
        product_5.setCost(300.0);

        Product product_6 = new Product();
        product_6.setName("Пиво Guinness 500 мл");
        product_6.setCost(60.0);



        BeerMachine beerMachine = new BeerMachine();

        ArrayList<Product> listBeer = new ArrayList<>(List.of(product_4, product_5, product_6));
//        ArrayList<Product> listCofe = new ArrayList<>(List.of(product_1, product_2, product_3));
        beerMachine.initProduct(listBeer);

        System.out.println(beerMachine.getProduct("Пиво Guinness 500 мл"));


    }
}
