import java.util.ArrayList;
public interface QueueBehaviour {
    /**
     * Ставит в очередь
     *
     * @param actor
     */
    static void takeInQueue(Actor actor) {}

    /**
     * Принимает заказ
     */
    static void takeOrders() {}

    /**
     * Отдаёт заказ
     */
    static void giveOrders() {}

    /**
     * Убирает из очереди
     */
    static void releaseFromQueue() {}
}
