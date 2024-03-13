
public class Main {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Milk("молоко"));
        latte.addComponent(new Beans("зерна"));

        for (var ingredient : latte) {  // Для работы надо в Beverage имплементировать Iterable<Ingredient>
            System.out.println(ingredient);
        }
    }
}