package controller;

import data.Student;
import data.Teacher;
import data.User;
import service.DataService;

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

}
