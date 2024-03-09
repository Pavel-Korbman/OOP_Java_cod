import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Actor actor_1 = new Actor("Павел");
        Actor actor_2 = new Actor("Елена");
        Actor actor_3 = new Actor("Никита");
        Actor actor_4 = new Actor("Ева");
        Actor actor_5 = new Actor("Таня");
        Actor actor_6 = new Actor("Андрей");


//        System.out.println(actor_1);
//        System.out.println(actor_2);

        actor_1.acceptToMarket(actor_1);
        actor_2.acceptToMarket(actor_2);
        actor_3.acceptToMarket(actor_3);
        actor_4.acceptToMarket(actor_4);
        actor_5.acceptToMarket(actor_5);
        actor_6.acceptToMarket(actor_6);


//        System.out.println();
//        actor_1.takeOrders();
//        actor_2.takeOrders();
//        actor_3.takeOrders();
//        actor_4.takeOrders();
        actor_1.update();

        System.out.println();
        actor_1.takeInQueue(actor_1);
        actor_2.takeInQueue(actor_2);
        actor_2.takeInQueue(actor_3);
        actor_2.takeInQueue(actor_4);

//        System.out.println();
//        actor_1.giveOrders();
//        actor_2.giveOrders();
//        actor_3.giveOrders();
//        actor_4.giveOrders();
        actor_1.update();

        System.out.println();
        ArrayList<Actor> out = new ArrayList<>();
        out.add(actor_1);
        out.add(actor_2);
        Market.setOut(out);
        actor_1.releaseFromMarket(out);






        //        actor_1.update();
//        actor_2.update();
//        actor_3.update();
//        actor_4.update();









    }
}