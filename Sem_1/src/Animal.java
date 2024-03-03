
public abstract class Animal {

    /** protected - разрешает доступ в текущем классе и в классах наследниках */
    protected String name;

    //    public void voice() {
//        System.out.println("Hello i am " + name);
//    }
    public abstract void voice();
    // abstract позволяет делать методы без реализации (набросок метода, который будет реализован потом)

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("Мурзик")) System.out.println("Мурзиком не называть!");
        else this.name = name;
    }
}