public class Program000 {
//    public static void main(String[] args) {
//
//        Foo f1 = new Foo();
//        f1.value = 123;
//        System.out.println(f1.value);
//
//        /** Вызовем метод, который печатает count на экземпляре f1 поля value*/
//        f1.printCount(); // 1 - в классе Foo сделали конструктор, который (count++) увеличивает счётчик при каждом обращении
//
//        // null - если значение count не присвоено, а count - статичное поле - static. Значение f1 ему не присваивается
//        // 0 - если значение count =0 по умолчанию - присвоено в классе Foo при задании поля (или статическим инициализатором)
//
//        /**
//         * К статическому полю count можем обращатся напрямую - без создания экземпляра
//         */
//        // Foo.count = 123000; // Присваиваем значение count
//
//
//        Foo f2 = new Foo();
//        f2.value = 222;
//        System.out.println(f2.value); // 222 - значение f2
//        f2.printCount();  // 2 - счётчик экземпляров
//        // 123000 - значение count
//
//        Foo f3 = new Foo();
//        f3.value = 444;
//        System.out.println(f3.value);  // 444 - значение f2
//        f3.printCount();  // 3
//        System.out.println(Foo.getCount());
//
//        Foo f4 = new Foo();
//        f4.printCount();  // 4
//        System.out.println(Foo.getCount());
//
//    }
}
