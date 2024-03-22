import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Программа - список животных
 */
// Liskov substitution principle
// Принцип подстановки Лисков
// Наследник не должен "ломать" поведение
// Наследник не должен делать меньше чем родитель
// Должна быть возможность использования любых порожденных классов на месте родительских.
// При этом они должны обладать тем же поведением,
// что и родительские классы, без внесения изменений.
// Этот принцип гарантирует, что порожденный класс
// расширяет поведение, но не уменьшает его.

/**
 * Здесь мы выделяем свойство, которое есть не у всех (лапки) в отдельный интерфейс interface Legs.
 * Далее классам животных имплементируем те интерфейсы, которые им подходят.
 * Собачке - Dog extends AbstractAnimal implements Legs (животное и лапки)
 * Питону - только животное Python extends AbstractAnimal
 */

public class Ex003_2LSP {
    public static void main(String[] args) {
        List<AbstractAnimal> list1 = new ArrayList<>(Arrays.asList(new Dog(), new Python()));

        for (var animal : list1) {
            System.out.println(animal.getType());
        }

        List<Legs> list2 = new ArrayList<>(Arrays.asList(new Dog()/* , new Python() */));
        for (var animal : list2) {
            System.out.println(animal.getLegsCount());

        }
    }
}

abstract class AbstractAnimal {
    public String getType() {
        return "Зверушка";
    }
}

interface Legs {
    int getLegsCount();
}

class Dog extends AbstractAnimal implements Legs {

    @Override
    public String getType() {
        return "собачка";
    }

    @Override
    public int getLegsCount() {
        return 4;
    }
}

class Python extends AbstractAnimal {
    @Override
    public String getType() {
        return "питончик";
    }
}