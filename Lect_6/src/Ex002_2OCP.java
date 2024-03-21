/**
 * программа предоставляет клиенту скидку
 */
// Open-closed principle
// Принцип открытости/закрытости
// Можно улучшать, но нельзя изменять
// Классы должны быть открыты для расширения
// и одновременно закрыты для модификации.
// Иными словами,
// должна быть возможность добавлять новые свойства и расширять класс
// без изменения внутренней реализации существующих свойств.

/** Здесь клиенты разделены на классы BaseClient, SilverPartner, VIPPartner,
 * они наследуются по цепочке, в каждом добавляется скидка
 * и можно добавлять их, не изменяя основной код */

public class Ex002_2OCP {
    public static void main(String[] args) {

        System.out.println(new BaseClient().getDiscount(100));
        System.out.println(new SilverPartner().getDiscount(100));
        System.out.println(new VIPPartner().getDiscount(100));
    }
}

class BaseClient {
    public double getDiscount(double price) {
        return price * 0.95;
    }
}

class SilverPartner extends BaseClient {
    @Override
    public double getDiscount(double price) {
        return super.getDiscount(price) * 0.9;
    }
}

class VIPPartner extends SilverPartner {
    @Override
    public double getDiscount(double price) {
        return super.getDiscount(price) * 0.9;
    }
}