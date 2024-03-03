public interface AnimalInt {
    void feed();
    default void test(){
        System.out.println("Hello i am test");
    }
}
