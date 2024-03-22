import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Программа - список животных
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
 * Здесь в дочернем класе рыбки - не имеют лапок - это ломает (создаёт исключение) поведение для базового класса
 */
public class Ex003_1LSP {
    public static void main(String[] args) throws Exception {
        List<Animal> list = 
        new ArrayList<>(Arrays.asList(new Cat(), new Fish() ));
        for (var animal : list) {
            System.out.println(animal.getType());
            System.out.println(animal.getLegsCount());
        }
    }
}

abstract class Animal {
    public String getType() {
        return "Зверушка";
    }

    public int getLegsCount() throws Exception {
        return 0;
    }
}

class Cat extends Animal {

    @Override
    public String getType() {
        return "кошечка";
    }

    @Override
    public int getLegsCount() {
        return 4;
    }
}

class Fish extends Animal
{
     @Override
     public String getType() {
        return "Рыбка";
     }
     public int getLegsCount() throws Exception {
        throw new Exception("я же рыбка...");
     }
}