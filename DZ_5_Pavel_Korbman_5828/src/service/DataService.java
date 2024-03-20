package service;

import data.Student;
import data.Teacher;
import data.User;
import java.util.ArrayList;

public class DataService {
    private ArrayList<User> students = new ArrayList<>();
    private ArrayList<User> teachers = new ArrayList<>();

    public void create(User user) {
        if (user instanceof Student) {
            Student student = new Student(user.getName(), user.getAdress(), user.getAge(), students.size() + 1);
            students.add(student);
        } else {
            Teacher teacher = new Teacher(user.getName(), user.getAdress(), user.getAge(), teachers.size() + 1);
            teachers.add(teacher);
        }

    }

    public ArrayList<User> read(String type) {
        if (type.equals("students")) return students;
        if (type.equals("teachers")) return teachers;
        return null;
    }
}