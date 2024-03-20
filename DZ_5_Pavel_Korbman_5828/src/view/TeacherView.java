package view;

import controller.Controller;
import data.User;

import java.util.ArrayList;

public class TeacherView {
    Controller controller = new Controller();
    public void printTeachers(ArrayList<User> list){
        System.out.println("Преподаватели:");
        System.out.println(list);
    }
}
