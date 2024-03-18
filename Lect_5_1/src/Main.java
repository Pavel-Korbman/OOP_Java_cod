/*
Задача 1
Написать программу сложения двух чисел. Почти как раньше, но лучше
 */

public class Main {
    public static void main(String[] args) {
        Presenter p = new Presenter(new SumModel(), new View());
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();

    }
}