
public class Main {
    public static void main(String[] args) {
        Human human_1 = new Human("Павел", "м", 54, "Москва");
        Human human_2 = new Human("Елена", "ж", 51, "Москва");
        Human human_3 = new Human("Никита", "м", 28, "Москва");
        Human human_4 = new Human("Ева", "ж", 16, "Москва");
        Human human_5 = new Human("Таня", "ж", 42, "Москва");
        Human human_6 = new Human("Андрей", "м", 44, "Москва");

//        System.out.println(human_1);
//        System.out.println(human_1);
//        System.out.println(human_3);
//        System.out.println(human_4);
//        System.out.println(human_5);
//        System.out.println(human_6);


        human_2.setMakeOrder(true);
        System.out.println(human_2);
        human_2.setMakeOrder(true, human_2.isMakeOrder(human_2));
        System.out.println(human_2);
        human_2.setTakeOrder(true);
        System.out.println(human_2);
        human_2.setTakeOrder(true, human_2.isTakeOrder(human_2));
        System.out.println(human_2);

        System.out.println(Actor);

//        human_1.setMakeOrder(false, human_1.isMakeOrder(human_1));
//        System.out.println(human_1);


    }
}