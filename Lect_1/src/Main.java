//ЛЕКЦИЯ 1
// Введение в ООП. Концепты и свои типы

/*
ООП – объектно-ориентированное программирование.
Парадигма (стиль, шаблон) разработки ПО, основными понятиями которой являются классы и объекты.
Говорят, что разработка в стиле ООП ведется с использованием классов объектов,
которые обладают состоянием и поведением, зависящим от этого состояния.
 */

// КЛАСС
/* Класс –
это «чертеж» (описание) сущности предметной области,
позволяющий выделить некоторые общие характеристики, состояние и поведение,
зависящее от состояния.

Предметная область —
множество всех предметов (явлений) решаемой проблемы.

Экземпляр класса –
отдельный представитель класса,
имеющий КОНКРЕТНОЕ состояние и поведение, которое полностью определяется описанием класса.

Состояние –
набор данных (полей, атрибутов, членов класса).

Поведение –
функции для работы с данными и выполнения полезной работы.
 */


/*
ЧЕМ НАПОЛНЯЮТ КЛАССЫ:
К Состоянию относятся:
Поля, Константы, События

К Поведению относятся:
Конструкторы, Методы
 */


/*
Инкапсуляция –
это свойство системы, позволяющее объединить данные и методы,
работающие с ними в классе,
скрыв детали реализации и защитив от пользователя этого класса объектов.
 */

/*
Наследование –
это свойство системы,
позволяющее описать новый класс на основе уже существующего,
с частично или полностью заимствующейся функциональностью.

Класс, от которого производится наследование, называется базовым или родительским.
Новый класс – потомком, наследником или производным классом.
 */

/*
Полиморфизм –
это свойство системы, использовать объекты с одинаковым интерфейсом
без информации о типе и внутренней структуре объекта.
Полиморфизм -
способность использовать объект вне зависимости от его реализации,
благодаря, полиморфной переменной –
это переменная, которая может принимать значения разных типов.
 */


import java.util.*;


public class Main {

//    /**
//     * Для вычисления расстояния между точками на плоскости
//     * @param x1 Координата Х первой точки
//     * @param y1 Координата У первой точки
//     * @param x2 Координата Х второй точки
//     * @param y2 Координата У второй точки
//     * @return Расстояние
//     */
//    static double distance(int x1, int y1, int x2, int y2) {
//        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//    }
//
//    static double distance(Point2D a, Point2D b) {
//        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
//    }

    public static void main(String[] args) {
//
//        Point2D a = new Point2D(0, 2); // В классе Point2D есть конструктор, который принимает значения в скобках
//        Point2D b0 = new Point2D(); // В классе Point2D есть конструктор, который вставит нули
//        Point2D b = new Point2D(2); // В классе Point2D есть конструктор, который принимает 1 число для обеих координат
//
//        a.setX(20); // В классе Point2D есть метод для изменения x. Нужен если x - private
//        a.setY(10); // В классе Point2D есть метод для изменения y. Нужен если y - private
//
//        var dis = Point2D.distance(a,b);
//
//        System.out.println(a); // x: 0; y: 2
//        System.out.println(b); // x: 2; y: 2
////        System.out.println(distance(a, b)); // 2.0
//        System.out.println(dis); // 2.0
//
//        System.out.println(a.getX()); // 0
//        System.out.println(a.getY()); // 2
//
//
//        System.out.println(a.toString()); // x: 20; y: 10

    // ПРИМЕР 2
    /**
     * Создаём робота в классе Robot, у которово есть имя и уровень,
     * он запускается, работает и выключается последовательностью комманд.
     * startBIOS(); startOS(); sayHi(); work(); sayBye(); stopOS(); stopBIOS();
     */
    // #region Robot1 demo

//        Robot1 robot1 = new Robot1("name_1", 1);
//        robot1.level = 100500;
//        System.out.printf("%s %d\n", robot1.name, robot1.level);

        // //#endregion
        // // #region processing

//        robot1.startBIOS();
//        robot1.startOS();
//        robot1.sayHi();
//
//        robot1.work();
//
//        robot1.sayBye();
//        robot1.stopOS();
//        robot1.stopBIOS();

        // // #endregion

//        System.out.println();
        // #endregion
/**
 * Создаём робота в классе Robot2, у которого после создания нельзя менять имя и уровень
 * и он запускается и выключается командами robot2.powerOn(); и robot2.powerOff();
 */
        // #region Robo2 demo

//         Robot2 robot2 = new Robot2("name_2", 1);
//
//         System.out.printf("%s level: %d\n", robot2.getName(), robot2.getLevel());
//
//         robot2.powerOn();
//
//         robot2.work();
//         robot2.work();
//         robot2.work();
//
//         robot2.powerOff();

        // #endregion
/**
 * Создаём робота в классе Robot3, у которого после создания нельзя менять имя и уровень
 * и он запускается и выключается командами robot2.powerOn(); и robot2.powerOff();
 */
        //#region Robo3 demo

//    Robot3 robot3 = new Robot3("name_3");
//        System.out.println("-------------");
//        System.out.println(robot3);
//        robot3.power();
//        robot3.work();
//        robot3.power();
//        robot3.work();
//
//        robot3.power();

        //#endregion

        /**
         * Создаём игру с 2 персонажами Magician и Priest
         */
        /**
         * 1 вар - два отдельных класса без наследования - много одинакового кода в Magician и Priest
         */

//        Magician hero1 = new Magician();
//        System.out.println(hero1.getInfo());
//
//        Priest hero2 = new Priest();
//        System.out.println(hero2.getInfo());
//
//        Priest hero3 = new Priest();
//        System.out.println(hero3.getInfo());

        /**
         * 2 вар - добавляем базовый класс - описываем общий функционал в BaseHero
         * и дополняем его в производных классах MagicianN и PriestN
         */
//        MagicianN hero1 = new MagicianN();
//        System.out.println(hero1.getInfo());
//
//        PriestN hero2 = new PriestN();
//        System.out.println(hero2.getInfo());
//
//        PriestN hero3 = new PriestN();
//        System.out.println(hero3.getInfo());
//
//        hero3.GetDamage(hero2.Attack());
//        hero3.GetDamage(hero3.Attack());
//        System.out.println(hero3.getInfo());
//        System.out.println(hero2.getInfo());
        //hero3.GetDamage(hero3.Attack());


        /**
         Полиморфизм. В переменную базового класса BaseHero
         положили экземпляры из дочерних классов new MagicianN() и new PriestN()
         */

//         BaseHero hero3 = new MagicianN();
//         System.out.println(hero3.getInfo());
//
//         BaseHero hero4 = new PriestN();
//         System.out.println(hero4.getInfo());

        // #endregion

        // #region ex2 Attack
        // System.out.println("------");
        // System.out.println(hero3.getInfo());
        // System.out.println(hero4.getInfo());

//        hero3.Attack(hero4);
//
//        hero4.Attack(hero3);
//         System.out.println(hero3.getInfo());
//         System.out.println(hero4.getInfo());

        // #endregion

        // #region Teams


        /**
         Создаём команду из 10 персонажей
         */
        int teamCount = 10;
        Random rand = new Random();
        int magicianCount = 0;
        int priestCount = 0;
//
//
        List<BaseHero> teams = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            if (rand.nextInt(2) == 0) {
                teams.add(new PriestN());
                priestCount++;
            }
            else{
                teams.add(new MagicianN());
                magicianCount++;
            }

            System.out.println(teams.get(i).getInfo());
        }
//        System.out.println();
//        System.out.printf("magicalCount: %d priestCount: %d \n\n", magicianCount, priestCount);

        // attack


    }
}
