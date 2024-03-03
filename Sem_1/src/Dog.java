public class Dog extends Animal{
    @Override
    public void voice() {
        System.out.println("Гав гав " + name);
    }
    // В родительском классе есть public abstract void voice() - значит в производном классе мы обязаны его реализовать
}
