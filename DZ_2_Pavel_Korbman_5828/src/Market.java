import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    protected String name;
    static Queue<Actor> queue = new LinkedList<>();
    static ArrayList<Actor> inMarket = new ArrayList<>();
    private static ArrayList<Actor> exit = new ArrayList<>();

    public static void acceptToMarket(Actor actor) {
        inMarket.add(actor);
    }

    protected static void takeOrders() {
        inMarket.getFirst().setOrder(true);
        System.out.println("Заказ: " + inMarket.getFirst());
        inMarket.add(inMarket.getFirst());
        inMarket.remove(inMarket.getFirst());
    }

    private static void takeInQueue(Actor actor) {
        if (actor.getOrder() && !actor.isOrderGet()) queue.add(actor);
        actor.setInQueue(true);
    }

    private static void giveOrders() {
        if (!queue.isEmpty()) {
            queue.peek().setOrderGet(true);
            System.out.println("Заказ получен: " + queue.peek());
            releaseFromQueue();
        }
    }

    private static void releaseFromQueue() {
        queue.remove(queue.peek());
    }

    public static void releaseFromMarket(ArrayList<Actor> out) {
        for (int i = 0; i < inMarket.size(); i++) {
            if (out.contains(inMarket.get(i))&&(inMarket.get(i).isOrderGet() || !inMarket.get(i).getOrder())){
//                inMarket.remove(inMarket.get(i));
                exit.add(inMarket.get(i));
            }
        }
        inMarket.removeAll(exit);
        System.out.println("В магазине " + inMarket.size() + "чел: " + inMarket);
    }

    public static void update() {
        for (Actor val : inMarket) {takeInQueue(val);}
        System.out.println("В очереди " + queue.size() + "чел: " + getQueue().toString());
//        System.out.println();
        for (int i = 0; i <= queue.size()+2; i++) {giveOrders();        }
        System.out.println("В очереди " + queue.size() + "чел: " + getQueue().toString());
        System.out.println();
    }

    public static Queue<Actor> getQueue() {
        return queue;
    }

    public static ArrayList<Actor> getInMarket() {
        return inMarket;
    }

    @Override
    public String toString() {
        return "Market{" +
                "queue=" + queue +
                ", inMarket=" + inMarket +
                '}';
    }

}
