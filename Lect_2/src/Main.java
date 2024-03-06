/* Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования
 * Абстракция
 * Абстракция – это свойство системы,
 * позволяющее описать общие характеристики базового класса для всех его производных классов,
 * а наполнение деталями предоставляется каждому из этих классов.
 * В абстрактном классе определяются лишь общие поля и характер методов,
 * которые должны быть конкретно реализованы в производных классах,
 * а не в самом базовом классе.
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//         #region teams
        // Когда героев становится больше

        int teamCount = 10;
        Random rand = new Random();

        List<BaseHero> teams = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    teams.add(new Priest());
                    break;
                case 1:
                    teams.add(new Magician());
                    break;
                case 2:
                    teams.add(new Druid());
                    break;
                default:
                    // teams.add(new BaseHero());
                    teams.add(new Human());
                    break;
            }
            System.out.println(teams.get(i).getInfo());
        }

        System.out.println();

//         #endregion
//
//         #region ToDo BaseHero

        // BaseHero hero = new BaseHero();
        // System.out.println(hero.getInfo());
        // ToDo BaseHero
        Priest priest = new Priest();
        System.out.println(priest.getInfo());
        Druid druid = new Druid();
        System.out.println(druid.getInfo());
        Magician magician = new Magician();
        System.out.println(magician.getInfo());
        Druid human = new Human();
        System.out.println(human.getInfo());

        priest.attack(magician);
        System.out.println(magician.getInfo());
        priest.attack(magician);
        System.out.println(magician.getInfo());
        druid.healing(magician);
        System.out.println(magician.getInfo());
        druid.healing(magician);
        System.out.println(magician.getInfo());
        druid.healing(magician);
        System.out.println(magician.getInfo());
        druid.healing(magician);
        System.out.println(magician.getInfo());
        druid.healing(magician);
        System.out.println(magician.getInfo());

        // #endregion

        // #region
        BaseHero dh = new Druid();
        /*BaseHero*/
        Dwarf dwarf = new Dwarf();
        dwarf.dwarf_method();
        ((Dwarf)dwarf).dwarf_method();
        System.out.println(dwarf.name);
        // #endregion
    }
}