package data;

public class Student extends User {
    private int id;

    public Student(String name, String address, int age, int id) {
        super(name, address, age);
        this.id = id;
    }

    @Override
    public String toString() {
        return name + '\'' + "{" +
                "id=" + id +
                ", adress='" + adress + '\'' +
                ", age=" + age +
                '}';
    }
}
