import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Actor actor_1 = new Actor("Павел");
        Actor actor_2 = new Actor("Елена");
        Actor actor_3 = new Actor("Никита");
        Actor actor_4 = new Actor("Ева");
        Actor actor_5 = new Actor("Таня");
        Actor actor_6 = new Actor("Андрей");
        Actor actor_7 = new Actor("Сергей");

        Market.acceptToMarket(actor_1);
        Market.acceptToMarket(actor_2);
        Market.acceptToMarket(actor_3);
        Market.acceptToMarket(actor_4);
        Market.acceptToMarket(actor_5);
        Market.acceptToMarket(actor_6);
        Market.acceptToMarket(actor_7);
        System.out.println();
        System.out.println("В магазине " + Market.getInMarket().size() + "чел: " + Market.getInMarket());

        System.out.println();
        actor_1.takeOrders();
        actor_2.takeOrders();
        actor_3.takeOrders();
        actor_4.takeOrders();
        System.out.println();

        Market.update();
//        Market.update();

        System.out.println();
        System.out.println("В магазине " + Market.getInMarket().size() + "чел: " + Market.getInMarket());
        ArrayList<Actor> out = new ArrayList<>();
        out.add(actor_2);
        out.add(actor_1);
        out.add(actor_6);
        Market.releaseFromMarket(out);

    }
}