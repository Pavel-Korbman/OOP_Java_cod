package view;

import java.util.Scanner;
public class Menu {
    Scanner in = new Scanner(System.in);

    public String startMenu() {
        System.out.println("Вывести списки (студентов - введите 1, преподавателей - введите 2):");
        return in.next();
    }

}
