import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        // Используем для чисел Collections.sort(numbers);
//         List<Integer> numbers = new ArrayList<>();
//         for (int i = 0; i < 10; i++) {
//         numbers.add(r.nextInt(1,20));  // Заполняем рандомно
//         }
//
//         System.out.println(numbers);
//         Collections.sort(numbers); // Сортируем стандартным методом
//         System.out.println(numbers);
        //

        /** Используем Comparable<Worker> */

         List<Worker> workers = new ArrayList<>();
         for (int i = 0; i < 5; i++) {
         workers.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt(18,31),
         r.nextInt(10000)));
         }

         System.out.println(workers);

        Collections.sort(workers);
         // ДЛЯ СОРТИРОВКИ КОЛЛЕКЦИИ в классе Worker имплементируем Comparable<Worker>
        // и настраиваем @Override метод compareTo(Worker o)
         System.out.println(workers);


        // #region Comparable<Worker>

         List<Worker> workers1 = new ArrayList<>();
         for (int i = 0; i < 5; i++) {
             workers1.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt(18, 31), r.nextInt(10000)));
         }
         System.out.println(workers1);

         workers1.sort(new AgeComporator());  // Можно через команду .sort тогда нужно создать класс AgeComporator

         System.out.println(workers1);


        //Через лямбда функцию



        Worker w1 = new Worker("Имя", "Фамилия", 20, 20);
        Worker w2 = new Worker("Имя", "Фамилия", 20, 20);
        System.out.println(workers1);


        //#endregion
    }

}