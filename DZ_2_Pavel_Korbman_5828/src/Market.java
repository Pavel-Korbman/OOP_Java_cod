import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    protected String name;
    //    Actor actor;
    static Queue<Actor> queue = new LinkedList<>();
    static ArrayList<Actor> inMarket = new ArrayList<>();
    static ArrayList<Actor> out = new ArrayList<>();

    public void acceptToMarket(Actor actor) {
//        actor.setInMarket(true);
        inMarket.add(actor);
        System.out.println("В магазине"+ inMarket.size()+ "чел:" + inMarket);
    }

    public void takeOrders() {
//        for (Actor val : inMarket) {
        inMarket.getFirst().setOrder(true);
        System.out.println(inMarket.getFirst());
        inMarket.remove(inMarket.getFirst());
//        }
    }


    public void takeInQueue(Actor actor) {
        if (actor.getOrder()) queue.add(actor);
        actor.setInQueue(true);
        System.out.println("В очереди"+ queue.size()+ "чел:" + getQueue().toString());
    }

    public void giveOrders() {
        if (!queue.isEmpty()) {
            queue.peek().setOrderGet(true);
//            queue.peek().setOrder(false);
            releaseFromQueue();
        } else System.out.println("Очередь пуста");
        System.out.println("В очереди "+ queue.size()+ "чел:" + getQueue().toString());
    }

    public void releaseFromQueue() {
        queue.remove(queue.peek());
    }

    public void releaseFromMarket(ArrayList<Actor> out) {
        for (Actor val : inMarket) {
            if (val.isOrderGet() && out.contains(val)) inMarket.remove(val);
        }
        System.out.println("В магазине:" + inMarket);
    }

    public void update() {
        takeOrders();
        for (Actor val : inMarket) {
            if(val.getOrder()) takeInQueue(val);
        }
        giveOrders();
//        System.out.println("В очереди:" + queue.toString());
    }

    public Queue<Actor> getQueue() {
        return queue;
    }

    public static ArrayList<Actor> getInMarket() {
        return inMarket;
    }

    public static void setOut(ArrayList<Actor> out) {
        Market.out = out;
    }

    @Override
    public String toString() {
        return "Market{" +
                "queue=" + queue +
                ", inMarket=" + inMarket +
                '}';
    }


}
