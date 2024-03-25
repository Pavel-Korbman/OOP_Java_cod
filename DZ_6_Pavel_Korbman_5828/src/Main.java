/**
 Взять реализованный код в рамках семинара 4 и
 продемонстрировать применение принципов, усвоенных на семинаре.
 Нужно в проекте прокомментировать участки кода,
 которые рефакторим, какой принцип применяем и почему.
 */

public class Main {
    public static void main(String[] args) {
        GoodSupplier supplier1 = new GoodSupplier("ООО Овощи", 6.5);
        GoodSupplier supplier2 = new GoodSupplier("ООО Продукты", 7.6);
        BadSupplier supplier3 = new BadSupplier("ООО Еда", 4.0);

        Tomatoes product1 = new Tomatoes("Помидоры Черри", 355.0, 300);
        Tomatoes product2 = new Tomatoes("Помидоры Азербайджан", 500.0, 150);
        Tomatoes product3 = new Tomatoes("Помидоры Парниковые", 190.0, 240);
        Tomatoes product4 = new Tomatoes("Помидоры Слива", 200.0, 345);

        Warenhouse<Tomatoes,GoodSupplier> warenhouse1 = new Warenhouse();
        warenhouse1.add(product1, supplier1);
        warenhouse1.add(product2, supplier2);
        Warenhouse<Tomatoes,BadSupplier> warenhouse2 = new Warenhouse();
        warenhouse2.add(product3, supplier3);
        warenhouse2.add(product4, supplier3);

        System.out.println(warenhouse1);
        System.out.println(warenhouse2);
        System.out.println();

        warenhouse1.del(product1);
        System.out.println(warenhouse1);
    }
}