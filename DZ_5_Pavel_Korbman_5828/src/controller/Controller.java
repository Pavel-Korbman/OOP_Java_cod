package controller;

import data.Student;
import data.Teacher;
import data.User;
import service.DataService;
import view.Menu;
import view.StudentView;
import view.TeacherView;

import java.util.ArrayList;

public class Controller {
    private DataService dataService = new DataService();

    public void createStudent(Student student){
        dataService.create(student);
    }

    public void createTeacher(Teacher teacher){
        dataService.create(teacher);
    }
    public ArrayList<User> Read(String type){
        return dataService.read(type);
    }

    public void buttonClick(){
        Menu menu = new Menu();
        StudentView studentView = new StudentView();
        TeacherView teacherView = new TeacherView();
        String val = menu.startMenu();
        if (val.equals("1")) studentView.printStudents(Read("students"));
        if (val.equals("2")) teacherView.printTeachers(Read("teachers"));
        else System.out.println("Вы ввели не правильную команду");
    }

}
