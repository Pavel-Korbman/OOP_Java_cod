public class Cat extends Animal implements AnimalInt {
    @Override
    public void voice() {
    // В родительском классе есть public abstract void voice() - значит в производном классе мы обязаны его реализовать
        System.out.println("Мяу " + name);
    }

    @Override
    public void feed() {
        System.out.println("Cat is feeding");
    }
}
