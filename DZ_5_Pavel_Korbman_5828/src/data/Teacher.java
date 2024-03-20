package data;

import java.util.ArrayList;

public class Teacher extends User{
    private int id;
    private ArrayList<String> disciplines;

    public Teacher(String name, String adress, int age, int id) {
        super(name, adress, age);
        this.id = id;
    }

    @Override
    public String toString() {
        return name + '\'' +"{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", age=" + age +
                '}';
    }
}
