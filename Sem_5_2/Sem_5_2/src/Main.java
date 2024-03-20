import controller.Controller;
import data.Student;
import data.Teacher;
import data.User;
import service.DataService;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иванов", "Москва", 20, 0);
        Student student2 = new Student("Петров", "Москва", 18, 0);
        Student student3 = new Student("Сидоров", "Москва", 19, 0);
        Teacher teacher1 = new Teacher("Семён Семёныч", "Москва", 54, 0);
        Teacher teacher2 = new Teacher("Пётр Cергеевич", "Москва", 61, 0);
        Teacher teacher3 = new Teacher("Владимир Иваныч", "Москва", 40, 0);

        Controller controller= new Controller();
        controller.createStudent(student1);
        controller.createStudent(student2);
        controller.createStudent(student3);
        controller.createTeacher(teacher1);
        controller.createTeacher(teacher2);
        controller.createTeacher(teacher3);

        System.out.println(controller.Read("students"));
        System.out.println(controller.Read("teachers"));

    }
}