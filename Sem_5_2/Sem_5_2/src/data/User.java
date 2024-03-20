package data;


public abstract class User {
    protected String name;
    protected String adress;
    protected int age;

    public User(String name, String adress, int age) {
        this.name = name;
        this.adress = adress;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getAge() {
        return age;
    }

    public User() {
    }
}
