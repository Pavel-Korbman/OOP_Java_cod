
public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo() {
            @Override
            public void m1() {
                System.out.println("Запущен Метод m1 в Foo");
            }

            @Override
            public void m2() {
                System.out.println("Запущен Метод m2 в Foo");
            }
        };
        foo.m1();
        foo.m2();


        Foo foo1 = new Foo() {
            @Override
            public void m1() {
                System.out.println("Новое поведение");
            }

            @Override
            public void m2() {
                System.out.println("Новое поведение 2");
            }
        };
        foo1.m1();
    }
}