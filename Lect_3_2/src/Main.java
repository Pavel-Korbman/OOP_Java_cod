import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Milk("молоко"));
        latte.addComponent(new Beans("зерно"));

        Iterator<Ingredient> iterator = latte;
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}