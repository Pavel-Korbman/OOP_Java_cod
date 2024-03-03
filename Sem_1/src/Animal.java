
public class Animal {
    private String name;
    public void voice() {
        System.out.println("Hello i am " + name);
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