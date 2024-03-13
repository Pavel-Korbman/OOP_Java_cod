import java.util.*;

import static java.util.List.*;

public class Main {
    public static void main(String[] args) {

        /*Задача 1 - Iterator
         Создать класс Студент
         Создать класс УчебнаяГруппа
         Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
         Реализовать его контракты (включая удаление)
         */

        Student student1 = new Student("Павел", 21);
        Student student2 = new Student("Елена", 23);
        Student student3 = new Student("Ева", 18);
        Student student4 = new Student("Никита", 20);
        Student student5 = new Student("Антон", 22);

        List<Student> list = new ArrayList<>(of(student1, student2, student3, student4, student5));

        Group group01 = new Group();
        group01.setGroup(list);

        for (Student student : group01) {
            System.out.println(student);
        }

        System.out.println();

        Iterator<Student> iter = group01.iterator();

        while (iter.hasNext()) {
            Student student = iter.next();
            System.out.println("имя: " + student.getName() + "," + " возраст: " + student.getAge() + "," + " группа: 1");
        }

        System.out.println();
        // TreeSet<Student> group01sort = new TreeSet<>(new NameComparator()); // Кладёт в коллекцию сортированную NameComparator()

        Collections.sort(group01.getGroup(), new NameComparator());
        Iterator<Student> iterator = group01.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            System.out.println("имя: " + student.getName() + "," + " возраст: " + student.getAge() + "," + " группа: 1");
        }
        System.out.println();
        Collections.sort(group01.getGroup(), new AgeComparator());
        Iterator<Student> iterator1 = group01.iterator();
        while (iterator1.hasNext()){
            Student student = iterator1.next();
            System.out.println("имя: " + student.getName() + "," + " возраст: " + student.getAge() + "," + " группа: 1");
        }



    }
}
