import java.util.ArrayList;
import java.util.List;

/**
 * Задача:
 * Создать наследника реализованного класса (Product) ГорячийНапиток (Cofe)  с дополнительным полем int температура.
 * Создать класс ГорячихНапитковАвтомат (CofeMachine) реализующий интерфейс ТорговыйАвтомат (VendingMachine)
 * и реализовать перегруженный метод getProduct(int name, int volume, int temperature),
 * выдающий продукт соответствующий имени, объёму и температуре
 * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
 * Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
 */
public class Main {
    public static void main(String[] args) {

        Cofe product_1 = new Cofe();
        product_1.setName("Кофе маленький");
        product_1.setVolume(200);
        product_1.setTemperature(90);

        Cofe product_2 = new Cofe();
        product_2.setName("Кофе средний");
        product_2.setVolume(300);
        product_2.setTemperature(90);

        Cofe product_3 = new Cofe();
        product_3.setName("Кофе большой");
        product_3.setVolume(400);
        product_3.setTemperature(90);

        CofeMachine cofeMachine = new CofeMachine();

        ArrayList<Product> listCofe = new ArrayList<>(List.of(product_1, product_2, product_3));
        cofeMachine.initProduct(listCofe);

        System.out.println(cofeMachine.getProduct("Кофе средний"));
        System.out.println(cofeMachine.getProduct("Кофе средний", 300));
        System.out.println(cofeMachine.getProduct("Кофе средний", 300, 90));

    }
}