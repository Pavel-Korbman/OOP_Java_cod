/*
Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
Соблюдать принципы SOLID, паттерны проектирования.
 */

import Controller.Presenter;
import Model.Calculator;
import View.View;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Presenter p = new Presenter(new Calculator(), new View());
        p.buttonClick();

    }
}