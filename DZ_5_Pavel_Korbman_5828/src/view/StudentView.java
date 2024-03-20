package view;

import controller.Controller;
import data.User;

import java.util.ArrayList;

public class StudentView {
    Controller controller = new Controller();

    public void printStudents(ArrayList<User> list){
        System.out.println("Студенты:");
        System.out.println(list);
    }
}
