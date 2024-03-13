import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        Foo foo = new Foo() {
//            @Override
//            public void m1() {
//                System.out.println("Запущен Метод m1 в Foo");
//            }
//
//            @Override
//            public void m2() {
//                System.out.println("Запущен Метод m2 в Foo");
//            }
//        };
//        foo.m1();
//        foo.m2();
//
//
//        Foo foo1 = new Foo() {
//            @Override
//            public void m1() {
//                System.out.println("Новое поведение");
//            }
//
//            @Override
//            public void m2() {
//                System.out.println("Новое поведение 2");
//            }
//        };
//        foo1.m1();

//         List<Integer> nums = new ArrayList<>();
//         nums.add(1);
//         nums.add(12);
//         nums.add(123);
//         nums.add(1234);
//         nums.add(12345);
//
//         Iterator<Integer> iter = nums.iterator();
//         while (iter.hasNext()) {
//             System.out.println(iter.next());
//         }

        Worker worker = new Worker(
                "Имя", "Фамилия", 23, 4567);
         Iterator<String> components = worker;  // Напрямую без методов

         while (components.hasNext()) {
             System.out.println(worker.next());
         }

        //#endregion

        //#region Beverage Iterator

        // Beverage latte = new Coffee();
        // latte.addComponent(new Water("Вода"));
        // latte.addComponent(new Вeans("Зёрна"));
        // latte.addComponent(new Milk("Молоко"));

        // Iterator<Ingredient> iterator = latte;
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }
    }
}