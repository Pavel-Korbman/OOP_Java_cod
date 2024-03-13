import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Павел", 21);
        Student student2 = new Student("Елена", 23);
        Student student3 = new Student("Ева", 18);
        Student student4 = new Student("Никита", 20);
        Student student5 = new Student("Антон", 22);
        Student student6 = new Student("Таня", 24);

        List<Student> list1 = new ArrayList<>(List.of(student1));
        Group group01 = new Group("группа01");
        group01.setGroup(list1);

        List<Student> list2 = new ArrayList<>(List.of(student2));
        Group group02 = new Group("группа02");
        group02.setGroup(list2);

        List<Student> list3 = new ArrayList<>(List.of(student3));
        Group group03 = new Group("группа03");
        group03.setGroup(list3);

        List<Student> list4 = new ArrayList<>(List.of(student4));
        Group group04 = new Group("группа04");
        group04.setGroup(list4);

        List<Student> list5 = new ArrayList<>(List.of(student5));
        Group group05 = new Group("группа05");
        group05.setGroup(list5);

        List<Student> list6 = new ArrayList<>(List.of(student6));
        Group group06 = new Group("группа06");
        group06.setGroup(list6);

        List<Group> list01 = new ArrayList<>(List.of(group01, group02));
        Stream stream001 = new Stream(list01, "Поток001");

        List<Group> list02 = new ArrayList<>(List.of(group03));
        Stream stream002 = new Stream(list02, "Поток002");

        List<Group> list03 = new ArrayList<>(List.of(group04, group05, group06));
        Stream stream003 = new Stream(list03, "Поток003");

        System.out.println("Поток 001:");
        Iterator<Group> iter1 = stream001.iterator();
        while (iter1.hasNext()) {
            Group group = iter1.next();
            System.out.println(group.getGroupName() + group.getGroup());
        }
        System.out.println();
        System.out.println("Поток 002:");
        Iterator<Group> iter2 = stream002.iterator();
        while (iter2.hasNext()) {
            Group group = iter2.next();
            System.out.println(group.getGroupName() + group.getGroup());
        }
        System.out.println();
        System.out.println("Поток 003:");
        Iterator<Group> iter = stream003.iterator();
        while (iter.hasNext()) {
            Group group = iter.next();
            System.out.println(group.getGroupName() + group.getGroup());
        }

        System.out.println();
        List<Stream> institute = new ArrayList<>(List.of(stream001, stream002, stream003));
        Collections.sort(institute, new StreamComparator());
        for (Stream item : institute){
            System.out.println(item);
        }

    }
}