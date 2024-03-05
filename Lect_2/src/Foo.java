public class Foo {
    public Integer value;

    public static Integer count;

    /** Статический инициализатор*/
    static {
        count = 0;
    }

    public Foo() {
         count++;
    }

    public void printCount(){
        System.out.println(count);
    }

    public static Integer getCount() {
        return count;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
